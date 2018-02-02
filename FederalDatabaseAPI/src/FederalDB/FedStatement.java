package FederalDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import ResultSetManagment.FedResultSet;
import java.util.List;
import parser.*;
import parser.AnalysedStatements.*;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class FedStatement implements FedStatementInterface
{

    private Connection con[] = new Connection[3];

    public FedStatement(Connection conn[])
    {
        this.con = conn;
    }

    @Override
    public int executeUpdate(String sql) throws FedException
    {

        Statement[] statements;
        try
        {
            statements = SQLStatement.parseString(sql);
        } catch (Exception ex)
        {
            Logger.getLogger(FedStatement.class.getName()).log(Level.SEVERE, null, ex);
            throw new FedException(ex);
        }
        if (statements.length != 1)
        {
            throw new FedException(new Exception("Only single Statements are valid for the update"));
        }
        if (statements[0] instanceof LazyPreparedStatement)
        {
            LazyPreparedStatement lstmt = (LazyPreparedStatement) statements[0];

            switch (lstmt.statementType)
            {
                case DROP:
                    for (int i = 0; i < 3; i++)
                    {
                        try
                        {
                            PreparedStatement statement = con[i].prepareStatement(sql);
                            statement.executeUpdate();
                        } catch (Exception ex)
                        {
                            //Logger.getLogger(FedStatement.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    break;
                default:
                    throw new FedException(new Exception("Wrong type of statement for update"));
            }
        } else if (statements[0] instanceof CreateStatement)
        {
            CreateStatement createstmt = (CreateStatement) statements[0];
            try
            {
                handleCreate(createstmt);
            } catch (SQLException ex)
            {
                Logger.getLogger(FedStatement.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (statements[0] instanceof InsertStatement)
        {
            InsertStatement insstmt = (InsertStatement) statements[0];
            try
            {
                handleInsert(insstmt);
            } catch (SQLException ex)
            {
                Logger.getLogger(FedStatement.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }

        if (sql.startsWith("drop"))
        {

        }

        return 1;
    }

    private void handleCreate(CreateStatement createstmt) throws FedException, SQLException
    {
        if (createstmt.fedStatement instanceof CreateStatement.FedHorizontal)
        {
            CreateStatement.FedHorizontal hori = (CreateStatement.FedHorizontal) createstmt.fedStatement;
            if (MetaData.MetaDataManager.MetaManager.getMetaData(createstmt.tableName) == null)
            {
                List<Object> intervalls = hori.getIntervall();
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
                        createsql += ", " + createstmt.tableConstrains.get(i).getText();
                    else
                    {
                        // Total mayhem
                    }
                }
                createsql += ")";
                try
                {
                    for (int i = 0; i < intervalls.size(); i++)
                    {
                        PreparedStatement statement = con[i].prepareStatement(createsql);
                        statement.executeUpdate();
                    }
                    // TODO cereate new metadata entry
                } catch (SQLException ex)
                {
                    Logger.getLogger(FedStatement.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else
            {
                throw new FedException(new Exception("Table already exists"));
            }
        }
        if (createstmt.fedStatement instanceof CreateStatement.FedVertical)
        {
            CreateStatement.FedVertical vert = (CreateStatement.FedVertical) createstmt.fedStatement;
            List<CreateStatement.IColumnDefinition> primkey = null;
            for(CreateStatement.TableConstraint tabcon : createstmt.tableConstrains)
            {
                if(tabcon instanceof CreateStatement.TableConstraintPrimaryKey)
                {
                    CreateStatement.TableConstraintPrimaryKey tabprim = (CreateStatement.TableConstraintPrimaryKey)tabcon;
                    primkey = tabprim.getPrimaryKeys();
                }
            }
            String[] createsql = new String[vert.getDistributionLists().size()];
            for(int j = 0; j < createsql.length; j++)
            {
                createsql[j] = "create table " + createstmt.tableName + " (";
                for (int i = 0; i < primkey.size(); i++)
                {
                    createsql[j] += ((CreateStatement.ColumnDefinition)primkey.get(i)).getText();
                    if (i + 1 < primkey.size())
                    {
                        createsql[j] += ", ";
                    }
                }
                for (int i = 0; i < vert.getDistributionLists().get(j).size(); i++)
                {
                    createsql[j] += ", ";
                    createsql[j] += vert.getDistributionLists().get(j).get(i).getText();
                }
                for (int i = 0; i < createstmt.tableConstrains.size(); i++)
                {
                    if (createstmt.tableConstrains.get(i).getCanBeLocal() && 
                            vert.getDistributionLists().get(j).contains(
                                    createstmt.tableConstrains.get(i).getColumns().get(0)))
                    {
                        createsql[j] += ", " + createstmt.tableConstrains.get(i).getText();
                    }
                }
                createsql[j] += ")";
            }
            for (int i = 0; i < createstmt.tableConstrains.size(); i++)
            {
                if (!createstmt.tableConstrains.get(i).getCanBeLocal())
                {
                    // total mayhem
                }
            }
            for(int i = 0; i < createsql.length; i++)
            {
                PreparedStatement statement = con[i].prepareStatement(createsql[i]);
                statement.executeUpdate();
            }
        } else
        {
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
    }
    
    private void handleInsert(InsertStatement insstmt) throws FedException, SQLException
    {
        if (insstmt.tableDescription == null)
        {
            
        }
    }

    @Override
    public FedResultSet executeQuery(String sql) throws FedException
    {
        return null;
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
