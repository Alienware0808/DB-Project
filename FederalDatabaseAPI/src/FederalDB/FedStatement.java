package FederalDB;

import Data.FedConnectionFactory;
import Data.FedHelper;
import Data.SQLHelper;
import ResultSetManagment.FedResultSet;
import MetaData.ColumnDefinition;
import MetaData.ColumnValue;
import MetaData.Constrains.Constraint;
import MetaData.Constrains.ForeignKeyConstraint;
import MetaData.FedHorizontalType;
import MetaData.FedType;
import MetaData.FedVerticalType;
import MetaData.MetaDataEntry;
import MetaData.MetaDataManager;
import ResultSetManagment.Aggregation.Aggregation;
import ResultSetManagment.FedConditionResultSet;
import ResultSetManagment.FedGroupByResultSet;
import ResultSetManagment.FedOverwriteResultSet;
import ResultSetManagment.FedProjectionResultSet;
import ResultSetManagment.FedResultSetExtendedInterface;
import ResultSetManagment.SqlWrapperResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.List;
import parser.*;
import parser.AnalysedStatements.*;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FedStatement implements FedStatementInterface
{

    private FedConnection fedCon;
    private Connection[] con;
    public final MetaDataManager metaDataManger;

    /**
     * 
     * @param parent fed- connection
     * @param con redundante connections
     * @param metaDataManager 
     */
    public FedStatement(FedConnection parent, Connection[] con, MetaDataManager metaDataManager)
    {
        this.con = con;
        this.fedCon = parent;
        this.metaDataManger = metaDataManager;
    }

    /**
     * Delete/Drop/Insert/update/create
     * @param sql
     * @return
     * @throws FedException 
     */
    @Override
    public int executeUpdate(String sql) throws FedException
    {
        try
        {
            parser.AnalysedStatements.Statement inpstatement;
            try
            {
                //fastparse nur für Inserts
                parser.AnalysedStatements.Statement fastsmt = FastParse.fastParse(sql, fedCon);
                if(fastsmt == null)
                    inpstatement = SQLStatement.parseString(sql, fedCon)[0];
                else inpstatement = fastsmt;
            } catch (Exception ex)
            {
                Logger.getLogger(FedStatement.class.getName()).log(Level.SEVERE, null, ex);
                throw new FedException(ex);
            } //drop
            if (inpstatement instanceof LazyPreparedStatement)
            {
                LazyPreparedStatement lstmt = (LazyPreparedStatement) inpstatement;

                switch (lstmt.Type)
                {
                    case DROP:
                        MetaDataEntry meta = metaDataManger.getTableMetaData(lstmt.TableName);
                        boolean succ = false;
                        if(meta != null)
                        {
                            try
                            {
                                checkReferences(meta);//Constrains für Drop getestet
                            } catch (Exception ex)
                            {
                                throw new FedException(ex);
                            }
                            for (int i = 0; i < meta.FedType.getDatabaseCount(); i++)
                            {
                                try
                                {
                                    PreparedStatement statement = con[i].prepareStatement(sql);
                                    statement.executeUpdate();//jdbc funktion 
                                    succ = true;
                                } catch (Exception ex)
                                {
                                    //Logger.getLogger(FedStatement.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                            metaDataManger.deleteTableMetaData(lstmt.TableName);
                        }
                        if (!succ)
                            throw new FedException(new Exception("Table \"" + lstmt.TableName + "\" does not Exist"));
                        return 0;
                    default:
                        throw new FedException(new Exception("Wrong type of statement for update"));
                }
            } else if (inpstatement instanceof CreateStatement)
            {
                CreateStatement createstmt = (CreateStatement) inpstatement;
                try
                {
                    handleCreate(createstmt);
                    return 0;
                } catch (Exception ex)
                {
                    throw new FedException(ex);
                }
            } else if (inpstatement instanceof InsertStatement)
            {
                InsertStatement insstmt = (InsertStatement) inpstatement;
                try
                {
                    return handleInsert(insstmt);
                } catch (Exception ex)
                {
                    throw new FedException(ex);
                }
            }
            else if(inpstatement instanceof UpdateStatement)
            {
                UpdateStatement upstmt = (UpdateStatement)inpstatement;
                try
                {
                    return handleUpdate(upstmt);
                } catch (Exception ex)
                {
                    throw new FedException(ex);
                }
            }
            else if(inpstatement instanceof DeleteStatement)
            {
                DeleteStatement delstmt = (DeleteStatement)inpstatement;
                try
                {
                    return handleDelete(delstmt);
                } catch (Exception ex)
                {
                    throw new FedException(ex);
                }
            }
            else throw new FedException(new Exception("Type not handled " + inpstatement.toString()));
        }
        catch (FedException ex)
        {
            throw new FedExtendedException("executeUpdate Failed with \""+sql+"\"", ex);
        } catch (Exception ex)
        {
            throw new FedException(ex);
        }
    }
    
    private void checkReferences(MetaDataEntry meta)
            throws Exception
    {
        List<ForeignKeyConstraint> referencedForeignKeyConstrains = 
                metaDataManger.getReferencesToTable(meta.TableName);
        if(referencedForeignKeyConstrains.size() != 0)//hat ein FK
        {
            FedResultSetExtendedInterface rs = FedHelper.selectPrimFromSingleTable(fedCon, meta.TableName, null); //rs= resultset //Holen uns die PK von der eingene Table
            for(ForeignKeyConstraint refFor : referencedForeignKeyConstrains)
            {
                try
                {
                    if(!refFor.checkReferences(fedCon, rs))//andere Tabelle
                        throw new FedException(new Exception("Violated foreign Key Constraint " + refFor.toString()));
                } catch (SQLException ex)
                {
                    throw new FedException(ex);
                }
            }
        }
    }
    
    private int handleDelete(DeleteStatement delstmt)
            throws Exception
    {
        MetaDataEntry meta = delstmt.table; //getMetha informationen 
        checkReferences(meta); 
        if(meta.FedType instanceof FedHorizontalType)
        {
            int count = 0; //wie viele Zeilen wurden gelöscht
            count += SQLHelper.deleteWhere(fedCon.getConn()[0], meta.TableName, delstmt.where);
            count += SQLHelper.deleteWhere(fedCon.getConn()[1], meta.TableName, delstmt.where);
            if(meta.FedType.getDatabaseCount() == 3)
                count += SQLHelper.deleteWhere(fedCon.getConn()[2], meta.TableName, delstmt.where);
            return count;
        }
        if(meta.FedType instanceof FedVerticalType)
        {
            FedVerticalType vert = (FedVerticalType)meta.FedType;
            FedResultSetExtendedInterface selectedPrimKeys = FedHelper.selectPrimFromSingleTable(fedCon, meta.TableName, delstmt.where);
            //SQLHelper.updateSelection(fedCon.getConn()[index], meta.TableName, upval, selectedPrimKeys);
            SQLHelper.deleteSelection(fedCon.getConn()[0], meta.TableName, selectedPrimKeys); //PK ist in jeder Tabelle
            SQLHelper.deleteSelection(fedCon.getConn()[1], meta.TableName, selectedPrimKeys);
            if(meta.FedType.getDatabaseCount() == 3)
                SQLHelper.deleteSelection(fedCon.getConn()[2], meta.TableName, selectedPrimKeys);
            return selectedPrimKeys.getRowCount();
        }
        else
        {
            return SQLHelper.deleteWhere(fedCon.getConn()[0], meta.TableName, delstmt.where); //nicht verti und hori weiterreichen an DB
        }
    }
    
    private int handleUpdate(UpdateStatement upstmt)
            throws Exception
    {   
        MetaDataEntry meta = upstmt.table;
        List<ColumnValue> upvalAsList = new ArrayList<>(); //ColummValue= Columedefinition und Attributwert
        Object valueObject = null;
        if(upstmt.valueString.startsWith("'"))//handelt es sich hier um einen String //Conventierung wird hier gemacht
        {
            String str = upstmt.valueString;//Wert mit dem ich es update durchführe
            str = str.substring(1);//Erste Zeichen weg wegen '
            str = str.substring(0, str.length()-1); //Ende löschen wegen '
            valueObject = str;
        } else if(upstmt.valueString.toLowerCase().equals("null")) //NULL ?
            valueObject = null;
        else valueObject = Integer.parseInt(upstmt.valueString); //Integer?
        ColumnValue upval = new ColumnValue(upstmt.column, upstmt.table.TableName, valueObject);
        upvalAsList.add(upval);
        // Check Constrains
        for(Constraint constraint : meta.constraints)
            if(!constraint.checkUpdate(fedCon, upvalAsList, upstmt.where))
                throw new FedException(new Exception("Hurting Constraint " + constraint.toString())); //FK update nicht erlaubt
        
        if(meta.FedType instanceof FedHorizontalType)
        {
            FedHorizontalType hori = (FedHorizontalType)meta.FedType;
            // if the Column to update equals the hori col //Wenn über die VERTEILSCHLÜSSEL ein update gemacht wird (meistens PK //erste Spalte)
            if(hori.Column.equals(upval))
            {
                int changedRows = 0;
                int dbindex = hori.getIndexForValue(upval.value); //Index für die auszuwelende DB auf die ich die Updates durchführe
                FedSavepoint savepoint = fedCon.setSavepoint();//Für Rollback
                try
                {
                    for(int i = 0; i < hori.getDatabaseCount(); i++)
                    {
                        if(dbindex == i) //update z.B. 50 also tabelle zwei wenn genau wieder 50 gemacht wird also dann auch auf dieser einfach
                            changedRows += SQLHelper.updateWhere(fedCon.getConn()[dbindex], meta.TableName, upval, upstmt.where);
                        else //alle DB durchgehen
                        {
                            FedResultSetExtendedInterface affectedRows = new SqlWrapperResultSet(
                                    SQLHelper.selectAll(fedCon.getConn()[i], meta.TableName, upstmt.where.toWhereString()));
                            changedRows += affectedRows.getRowCount();
                            FedResultSetExtendedInterface asUpdatedRows = 
                                    new FedOverwriteResultSet(affectedRows, upvalAsList); //FedResultset der dad Updat entspricht
                            SQLHelper.insert(fedCon.getConn()[i], meta.TableName, asUpdatedRows); //Insert
                            SQLHelper.deleteSelection(fedCon.getConn()[i], meta.TableName, 
                                    new FedProjectionResultSet(affectedRows, meta.getPrimaryKeyConstraint().PrimaryKey)); //gelöscht
                        }
                    }
                    return changedRows;
                } catch (Exception ex)
                {
                    savepoint.rollback();
                    throw new FedException(ex);
                }
            }
            else //verteilung verändert sich nicht einfaches Update
            { 
                int updatedRows = 0;
                updatedRows += SQLHelper.updateWhere(fedCon.getConn()[0], meta.TableName, upval, upstmt.where);
                updatedRows += SQLHelper.updateWhere(fedCon.getConn()[1], meta.TableName, upval, upstmt.where);
                if(hori.getDatabaseCount() == 3)
                    updatedRows += SQLHelper.updateWhere(fedCon.getConn()[2], meta.TableName, upval, upstmt.where);
                return updatedRows;
            }
        }
        else if(meta.FedType instanceof FedVerticalType)
        {
            FedVerticalType vert = (FedVerticalType)meta.FedType;
            FedResultSetExtendedInterface selectedPrimKeys = FedHelper.selectPrimFromSingleTable(fedCon, meta.TableName, upstmt.where); //Hole PK VON MIR mit WHERE//betroffenen
            int index = vert.getDatabaseForColumn(upval);
            return SQLHelper.updateSelection(fedCon.getConn()[index], meta.TableName, upval, selectedPrimKeys);//update mit selection
        } else
            return SQLHelper.updateWhere(fedCon.getConn()[0], meta.TableName, upval, upstmt.where);
    }

    private void handleCreate(CreateStatement createstmt) throws FedException, SQLException, Exception
    {
        FedSavepoint savepoint = fedCon.setSavepoint();
        try
        {
            MetaDataEntry meta = new MetaDataEntry();
            meta.Columns = createstmt.columnDefinitions;
            meta.TableName = createstmt.tableName;
            for (CreateStatement.TableConstraint tc : createstmt.tableConstrains)
            {
                if (!tc.getCanBeLocal())//was komplex ist 
                {
                    meta.constraints.add(tc.toMetaConstraint());
                }
            }
            if (metaDataManger.getTableMetaData(createstmt.tableName) == null)
            {
                if (createstmt.fedStatement instanceof CreateStatement.FedHorizontal)
                {
                    // Do the Meta Thing
                    CreateStatement.FedHorizontal hori = (CreateStatement.FedHorizontal) createstmt.fedStatement;
                    List<Object> intervalls = hori.getIntervall();//Verteilungsschlüssel Intervalle
                    meta.FedType = new FedHorizontalType(hori.getColumn(), intervalls);
                    String createsql = "create table " + createstmt.tableName + " (";
                    for (int i = 0; i < createstmt.columnDefinitions.size(); i++)
                    {
                        createsql += createstmt.columnDefinitions.get(i).getText();
                        if (i + 1 < createstmt.columnDefinitions.size())
                        {
                            createsql += ", ";
                        }
                    }
                    for (int i = 0; i < createstmt.tableConstrains.size(); i++)
                    {
                        if (createstmt.tableConstrains.get(i).getCanBeLocal())
                        {
                            createsql += ", " + createstmt.tableConstrains.get(i).getText();
                        } else
                        {

                        }
                    }
                    createsql += ")";
                    try
                    {
                        for (int i = 0; i <= intervalls.size(); i++)
                        {
                            PreparedStatement statement = con[i].prepareStatement(createsql);//DB geschickt
                            statement.executeUpdate();
                        }
                        // TODO cereate new metadata entry
                    } catch (SQLException ex)
                    {
                        Logger.getLogger(FedStatement.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else if (createstmt.fedStatement instanceof CreateStatement.FedVertical)
                {
                    CreateStatement.FedVertical vert = (CreateStatement.FedVertical) createstmt.fedStatement;
                    meta.FedType = new FedVerticalType(vert.getDistributionLists()); //WIe bin ich verteilt /Liste von Columedefintion
                    CreateColumnDefinition primkey = null;
                    for (CreateStatement.TableConstraint tabcon : createstmt.tableConstrains) //brauch zunächst alle PK
                    {
                        if (tabcon instanceof CreateStatement.TableConstraintPrimaryKey)  //Suche den PK für jedes Creade
                        {
                            CreateStatement.TableConstraintPrimaryKey tabprim = (CreateStatement.TableConstraintPrimaryKey) tabcon;
                            primkey = tabprim.getPrimaryKeys().get(0);
                        }
                    }
                    String[] createsql = new String[vert.getDistributionLists().size()];
                    for (int j = 0; j < createsql.length; j++)
                    {
                        createsql[j] = "create table " + createstmt.tableName + " (";
                        createsql[j] += ((CreateColumnDefinition) primkey).getText();
                        for (int i = 0; i < vert.getDistributionLists().get(j).size(); i++)
                        {
                            CreateColumnDefinition newcol = ((CreateColumnDefinition) vert.getDistributionLists().get(j).get(i));
                            if(!newcol.equals(primkey))
                            {
                                createsql[j] += ", ";
                                createsql[j] += newcol.getText();
                            }
                        }
                        for (int i = 0; i < createstmt.tableConstrains.size(); i++)
                        {
                            if (createstmt.tableConstrains.get(i).getCanBeLocal()
                                    && vert.getDistributionLists().get(j).contains(
                                            createstmt.tableConstrains.get(i).getColumns().get(0)))
                            {
                                createsql[j] += ", " + createstmt.tableConstrains.get(i).getText();
                            }
                        }
                        createsql[j] += ")";
                    }
                    for (int i = 0; i < createsql.length; i++)
                    {
                        PreparedStatement statement = con[i].prepareStatement(createsql[i]);
                        statement.executeUpdate();
                    }
                } else //wenn nicht hori und vert
                {
                    meta.FedType = new FedType(); //keine verteilte Tabelle
                    PreparedStatement statement;
                    try
                    {
                        String stmt = createstmt.getText();
                        statement = con[0].prepareStatement(stmt);
                        statement.executeUpdate();
                    } catch (SQLException ex)
                    {
                        Logger.getLogger(FedStatement.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                metaDataManger.addTableMetaData(meta);
            } else
            {
                throw new FedException(new Exception("Table already exists"));
            }
            savepoint.releaseSavepoint();
        }
        catch (Exception ex)
        {
            savepoint.rollback();
            throw ex;
        }
    }

    private int handleInsert(InsertStatement insstmt) throws FedException, SQLException, Exception
    {
        MetaDataEntry meta = insstmt.tableMeta;
        // Find the PrimaryKey Value
        ColumnValue primKeyVal = null;
        int indexOfPrimKey = insstmt.ColumnValues.indexOf(meta.getPrimaryKeyConstraint().PrimaryKey); //Hole mir den Primärschlüßelattribut für Insert
        if(indexOfPrimKey == -1)
            throw new FedException(new Exception("Missing PrimaryKey Value"));
        primKeyVal = insstmt.ColumnValues.get(indexOfPrimKey);
        // Already checked in preperation
        //if (insstmt.tableMeta == null)
        //    throw new FedException(new Exception("Table does not exist"));
        
        Stream<Supplier<Boolean>> tasks = Stream.empty(); //parallel für Contrains
        
        // Check Constrains
        for(Constraint constraint : meta.constraints)
            tasks = Stream.concat(tasks, Stream.of(() -> {
                FedConnection con = FedConnectionFactory.give();
                 boolean resu = constraint.checkInsert(con, insstmt.ColumnValues);
                 FedConnectionFactory.free(con);
                 return resu;
                    }));
            //if(!constraint.checkInsert(fedCon, insstmt.ColumnValues))
                //throw new FedException(new Exception("Hurting Constraint " + constraint.toString()));
        
        List<Boolean> lists = tasks
             // Supply all the tasks for execution and collect CompletableFutures
             .map(CompletableFuture::supplyAsync).collect(Collectors.toList())
             // Join all the CompletableFutures to gather the results
             .stream()
             .map(CompletableFuture::join).collect(Collectors.toList());
        int checkindex = lists.indexOf(false);
        if(checkindex != -1)
            throw new FedException(new Exception("Hurting Constraint " + meta.constraints.get(checkindex).toString()));
        
        if(meta.FedType instanceof FedHorizontalType)
        {
            FedHorizontalType hori = (FedHorizontalType)meta.FedType;
            ColumnValue horival = insstmt.ColumnValues.get(insstmt.ColumnValues.indexOf(hori.Column));
            int index = hori.getIndexForValue(horival.value); //Zu welcher DB gehört der Value?
            return SQLHelper.insert(fedCon.getConn()[index], meta.TableName, insstmt.ColumnValues);
        }
        else if(meta.FedType instanceof FedVerticalType)
        {
            FedVerticalType vert = (FedVerticalType)meta.FedType;
            
            // Split the insert for each Table
            List<ColumnValue> valuesForTable1 = new ArrayList<>(); //Speicher für DB1
            List<ColumnValue> valuesForTable2 = new ArrayList<>();  //Speicher für DB2              
            List<ColumnValue> valuesForTable3 = null;
            if(vert.getDatabaseCount() == 2)
            {
                for(ColumnValue colval : insstmt.ColumnValues)
                {
                    int index = vert.DistributionList.get(0).indexOf(colval);//schaue in Methadaten wozu gehört das value //für die erste
                    if(index != -1)
                        valuesForTable1.add(colval); //weise der Liste hinzu
                    else
                    {
                        index = vert.DistributionList.get(1).indexOf(colval); //zweite
                        if(index != -1)
                            valuesForTable2.add(colval);
                        else throw new FedException(new Exception("Unkown Field in Inser Statement"));
                    }
                }
            } else //für 3 redundant
            {
                valuesForTable3 = new ArrayList<>();
                for(ColumnValue colval : insstmt.ColumnValues)
                {
                    int index = vert.DistributionList.get(0).indexOf(colval);
                    if(index != -1)
                        valuesForTable1.add(colval);
                    else
                    {
                        index = vert.DistributionList.get(1).indexOf(colval);
                        if(index != -1)
                            valuesForTable2.add(colval);
                        else
                        {
                            index = vert.DistributionList.get(2).indexOf(colval);
                            if(index != -1)
                                valuesForTable3.add(colval);
                            else throw new FedException(new Exception("Unkown Field in Inser Statement"));
                        }
                    }
                }
            }
            if(!valuesForTable1.contains(primKeyVal))//ist der PK vorhanden wenn nicht füge einen hinzu
                valuesForTable1.add(primKeyVal);
            if(!valuesForTable2.contains(primKeyVal))
                valuesForTable2.add(primKeyVal);
            int result = SQLHelper.insert(fedCon.getConn()[0], meta.TableName, valuesForTable1);//füre Insert durch
            SQLHelper.insert(fedCon.getConn()[1], meta.TableName, valuesForTable2);
            if(valuesForTable3 != null) //Fall für 3 DB
            {
                if(!valuesForTable3.contains(primKeyVal))
                    valuesForTable3.add(primKeyVal);
                SQLHelper.insert(fedCon.getConn()[2], meta.TableName, valuesForTable3);
            }
            return result;
        }
        else
            return SQLHelper.insert(fedCon.getConn()[0], meta.TableName, insstmt.ColumnValues);
    }

    @Override
    public FedResultSet executeQuery(String sql) throws FedException //select
    {
        parser.AnalysedStatements.Statement[] statements;
        try
        {
            statements = SQLStatement.parseString(sql, fedCon);
        } catch (Exception ex)
        {
            Logger.getLogger(FedStatement.class.getName()).log(Level.SEVERE, null, ex);
            throw new FedException(ex);
        }
        if (statements.length != 1)
        {
            throw new FedException(new Exception("Only single Statements are valid for the update"));
        }
        if (!(statements[0] instanceof SelectStatement))
            throw new FedException(new Exception("Only Select statements allowed"));
        SelectStatement selstmt = (SelectStatement)statements[0];
        List<ColumnDefinition> allcolumns = new ArrayList<>();
        allcolumns.addAll(selstmt.resultColumns);
        allcolumns.addAll(selstmt.extraColumnsForWhere);
        
        if(selstmt.getGroupByColumn() != null)
        {
            FedResultSetExtendedInterface cprod;
            try
            {
                cprod = FedHelper.selectGroupBy(fedCon, allcolumns);
                //System.out.println(FedResultSet.printOut(cprod));
            } catch (SQLException ex)
            {
                throw new FedException(ex);
            }
            FedResultSetExtendedInterface conrs;
            //System.out.println(FedResultSet.printOut(cprod));
            if(selstmt.getWhere() != null)
                conrs = new FedConditionResultSet(selstmt.getWhere(), cprod);
            else conrs = cprod;
            //System.out.println(FedResultSet.printOut(conrs));
            //FedResultSetExtendedInterface seleResu = new FedProjectionResultSet(conrs, selstmt.resultColumns);
            HashMap<Integer, Aggregation> aggmap = new HashMap<>();
            for(int i = 0; i < selstmt.resultColumns.size(); i++)
                if(selstmt.resultColumns.get(i) instanceof Aggregation)
                {
                    aggmap.put(i + 1, (Aggregation)selstmt.resultColumns.get(i));
                }
            FedGroupByResultSet grouprs = new FedGroupByResultSet(
                conrs, 
                selstmt.getGroupByColumn(), 
                aggmap, 
                selstmt.getGroupByHavingCondition());
            //System.out.println(sql);
            //System.out.println(FedResultSet.printOut(grouprs));
            return new FedResultSet(grouprs);
        }
        else
        {
            FedResultSetExtendedInterface cprod;
            try
            {
                cprod = FedHelper.select(fedCon, allcolumns);
            } catch (SQLException ex)
            {
                throw new FedException(ex);
            }
            FedResultSetExtendedInterface conrs;
            //System.out.println(FedResultSet.printOut(cprod));
            if(selstmt.getWhere() != null)
                conrs = new FedConditionResultSet(selstmt.getWhere(), cprod);
            else conrs = cprod;
            //System.out.println(FedResultSet.printOut(conrs));
            FedResultSetExtendedInterface seleResu = new FedProjectionResultSet(conrs, selstmt.resultColumns);
            boolean aggregationFound = false;
            for(ColumnDefinition coldef : selstmt.resultColumns)
                if(coldef instanceof Aggregation)
                {
                    aggregationFound = true;
                    break;
                }
            if(aggregationFound)
            {
                FedResultSetExtendedInterface aggrs;
                try {
                    aggrs = FedResultSet.aggregate(seleResu, selstmt.resultColumns);
                } catch (Exception ex) {
                    Logger.getLogger(FedStatement.class.getName()).log(Level.SEVERE, null, ex);
                    throw new FedException(ex);
                }
                /*System.out.println(sql);
                System.out.println(FedResultSet.printOut(seleResu));*/
                //System.out.println(sql);
                //System.out.println(FedResultSet.printOut(aggrs));
                return new FedResultSet(aggrs);
            }
            //System.out.println(sql);
            //System.out.println(FedResultSet.printOut(seleResu));
            return new FedResultSet(seleResu);
        }
        
    }

    @Override
    public FedConnection getConnection() throws FedException
    {
        return null;
    }

    @Override
    public void close() throws FedException
    {

    }
}
