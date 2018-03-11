package FederalDB;

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

public class FedStatement implements FedStatementInterface
{

    private FedConnection fedCon;
    private Connection[] con;
    public final MetaDataManager metaDataManger;

    public FedStatement(FedConnection parent, Connection[] con, MetaDataManager metaDataManager)
    {
        this.con = con;
        this.fedCon = parent;
        this.metaDataManger = metaDataManager;
    }

    @Override
    public int executeUpdate(String sql) throws FedException
    {
        try
        {
            parser.AnalysedStatements.Statement inpstatement;
            try
            {
                parser.AnalysedStatements.Statement fastsmt = FastParse.fastParse(sql, fedCon);
                if(fastsmt == null)
                    inpstatement = SQLStatement.parseString(sql, fedCon)[0];
                else inpstatement = fastsmt;
            } catch (Exception ex)
            {
                Logger.getLogger(FedStatement.class.getName()).log(Level.SEVERE, null, ex);
                throw new FedException(ex);
            }
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
                                checkReferences(meta);
                            } catch (Exception ex)
                            {
                                throw new FedException(ex);
                            }
                            for (int i = 0; i < meta.FedType.getDatabaseCount(); i++)
                            {
                                try
                                {
                                    PreparedStatement statement = con[i].prepareStatement(sql);
                                    statement.executeUpdate();
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
        if(referencedForeignKeyConstrains.size() != 0)
        {
            FedResultSetExtendedInterface rs = FedHelper.selectPrimFromSingleTable(fedCon, meta.TableName, null);
            for(ForeignKeyConstraint refFor : referencedForeignKeyConstrains)
            {
                try
                {
                    if(!refFor.checkReferences(fedCon, rs))
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
        MetaDataEntry meta = delstmt.table;
        checkReferences(meta);
        if(meta.FedType instanceof FedHorizontalType)
        {
            int count = 0;
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
            SQLHelper.deleteSelection(fedCon.getConn()[0], meta.TableName, selectedPrimKeys);
            SQLHelper.deleteSelection(fedCon.getConn()[1], meta.TableName, selectedPrimKeys);
            if(meta.FedType.getDatabaseCount() == 3)
                SQLHelper.deleteSelection(fedCon.getConn()[2], meta.TableName, selectedPrimKeys);
            return selectedPrimKeys.getRowCount();
        }
        else
        {
            return SQLHelper.deleteWhere(fedCon.getConn()[0], meta.TableName, delstmt.where);
        }
    }
    
    private int handleUpdate(UpdateStatement upstmt)
            throws Exception
    {
        MetaDataEntry meta = upstmt.table;
        List<ColumnValue> upvalAsList = new ArrayList<>();
        Object valueObject = null;
        if(upstmt.valueString.startsWith("'"))
        {
            String str = upstmt.valueString;
            str = str.substring(1);
            str = str.substring(0, str.length()-1);
            valueObject = str;
        } else if(upstmt.valueString.toLowerCase().equals("null"))
            valueObject = null;
        else valueObject = Integer.parseInt(upstmt.valueString);
        ColumnValue upval = new ColumnValue(upstmt.column, upstmt.table.TableName, valueObject);
        upvalAsList.add(upval);
        // Check Constrains
        for(Constraint constraint : meta.constraints)
            if(!constraint.checkUpdate(fedCon, upvalAsList, upstmt.where))
                throw new FedException(new Exception("Hurting Constraint " + constraint.toString()));
        
        if(meta.FedType instanceof FedHorizontalType)
        {
            FedHorizontalType hori = (FedHorizontalType)meta.FedType;
            // if the Column to update equals the hori col
            if(hori.Column.equals(upval))
            {
                int changedRows = 0;
                int dbindex = hori.getIndexForValue(upval.value);
                FedSavepoint savepoint = fedCon.setSavepoint();
                try
                {
                    for(int i = 0; i < hori.getDatabaseCount(); i++)
                    {
                        if(dbindex == i)
                            changedRows += SQLHelper.updateWhere(fedCon.getConn()[dbindex], meta.TableName, upval, upstmt.where);
                        else
                        {
                            FedResultSetExtendedInterface affectedRows = new SqlWrapperResultSet(
                                    SQLHelper.selectAll(fedCon.getConn()[i], meta.TableName, upstmt.where.toWhereString()));
                            changedRows += affectedRows.getRowCount();
                            FedResultSetExtendedInterface asUpdatedRows = 
                                    new FedOverwriteResultSet(affectedRows, upvalAsList);
                            SQLHelper.insert(fedCon.getConn()[i], meta.TableName, asUpdatedRows);
                            SQLHelper.deleteSelection(fedCon.getConn()[i], meta.TableName, 
                                    new FedProjectionResultSet(affectedRows, meta.getPrimaryKeyConstraint().PrimaryKey));
                        }
                    }
                    return changedRows;
                } catch (Exception ex)
                {
                    savepoint.rollback();
                    throw new FedException(ex);
                }
            }
            else
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
            FedResultSetExtendedInterface selectedPrimKeys = FedHelper.selectPrimFromSingleTable(fedCon, meta.TableName, upstmt.where);
            int index = vert.getDatabaseForColumn(upval);
            return SQLHelper.updateSelection(fedCon.getConn()[index], meta.TableName, upval, selectedPrimKeys);
        } else
        {
            return SQLHelper.updateWhere(fedCon.getConn()[0], meta.TableName, upval, upstmt.where);
        }
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
                if (!tc.getCanBeLocal())
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
                    List<Object> intervalls = hori.getIntervall();
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
                            PreparedStatement statement = con[i].prepareStatement(createsql);
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
                    meta.FedType = new FedVerticalType(vert.getDistributionLists());
                    CreateColumnDefinition primkey = null;
                    for (CreateStatement.TableConstraint tabcon : createstmt.tableConstrains)
                    {
                        if (tabcon instanceof CreateStatement.TableConstraintPrimaryKey)
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
                } else
                {
                    meta.FedType = new FedType();
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
        int indexOfPrimKey = insstmt.ColumnValues.indexOf(meta.getPrimaryKeyConstraint().PrimaryKey);
        if(indexOfPrimKey == -1)
            throw new FedException(new Exception("Missing PrimaryKey Value"));
        primKeyVal = insstmt.ColumnValues.get(indexOfPrimKey);
        // Already checked in preperation
        //if (insstmt.tableMeta == null)
        //    throw new FedException(new Exception("Table does not exist"));
        
        // Check Constrains
        for(Constraint constraint : meta.constraints)
            if(!constraint.checkInsert(fedCon, insstmt.ColumnValues))
                throw new FedException(new Exception("Hurting Constraint " + constraint.toString()));
        
        if(meta.FedType instanceof FedHorizontalType)
        {
            FedHorizontalType hori = (FedHorizontalType)meta.FedType;
            ColumnValue horival = insstmt.ColumnValues.get(insstmt.ColumnValues.indexOf(hori.Column));
            int index = hori.getIndexForValue(horival.value);
            return SQLHelper.insert(fedCon.getConn()[index], meta.TableName, insstmt.ColumnValues);
        }
        else if(meta.FedType instanceof FedVerticalType)
        {
            FedVerticalType vert = (FedVerticalType)meta.FedType;
            
            // Split the insert for each Table
            List<ColumnValue> valuesForTable1 = new ArrayList<>();
            List<ColumnValue> valuesForTable2 = new ArrayList<>();                
            List<ColumnValue> valuesForTable3 = null;
            if(vert.getDatabaseCount() == 2)
            {
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
                        else throw new FedException(new Exception("Unkown Field in Inser Statement"));
                    }
                }
            } else
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
            if(!valuesForTable1.contains(primKeyVal))
                valuesForTable1.add(primKeyVal);
            if(!valuesForTable2.contains(primKeyVal))
                valuesForTable2.add(primKeyVal);
            int result = SQLHelper.insert(fedCon.getConn()[0], meta.TableName, valuesForTable1);
            SQLHelper.insert(fedCon.getConn()[1], meta.TableName, valuesForTable2);
            if(valuesForTable3 != null)
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
    public FedResultSet executeQuery(String sql) throws FedException
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
