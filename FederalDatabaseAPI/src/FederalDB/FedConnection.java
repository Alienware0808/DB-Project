package FederalDB;

import Data.SQLHelper;
import MetaData.MetaDataManager;
import ResultSetManagment.FedCrossproductResultSet;
import ResultSetManagment.FedHorizontalResultSet;
import ResultSetManagment.FedVerticalResultSet;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.util.logging.Level;
import java.util.logging.Logger;
import parser.AnalysedStatements.CreateStatement;

public class FedConnection implements FedConnectionInterface
{
    private String[] connectionStrings;
    private Connection conn[] = new Connection[3];
    public final MetaDataManager metaDataManger;
    String username; String password;

    public FedConnection(String[] constrs, String username, String password) throws FedException
    {
        this.username = username;
        this.password = password;
        connectionStrings = constrs;
        try
        {
            conn[0] = DriverManager.getConnection(constrs[0], username, password);
            conn[1] = DriverManager.getConnection(constrs[1], username, password);
            conn[2] = DriverManager.getConnection(constrs[2], username, password);
            
            conn[0].setAutoCommit(false);
            conn[1].setAutoCommit(false);
            conn[2].setAutoCommit(false);
            metaDataManger = new MetaDataManager(conn[0]);
        }
        catch (Exception ex)
        {
            throw new FedException(ex);
        }
    }
    
    public FedConnection(FedConnection template) throws FedException
    {
        this.connectionStrings = template.connectionStrings;
        this.username = template.username;
        this.password = template.password;
        try
        {
            conn[0] = DriverManager.getConnection(connectionStrings[0], username, password);
            conn[1] = DriverManager.getConnection(connectionStrings[1], username, password);
            conn[2] = DriverManager.getConnection(connectionStrings[2], username, password);
            
            conn[0].setAutoCommit(false);
            conn[1].setAutoCommit(false);
            conn[2].setAutoCommit(false);
            metaDataManger = template.metaDataManger;
        }
        catch (Exception ex)
        {
            throw new FedException(ex);
        }
    }

    public Connection[] getConn()
    {
        return conn;
    }

    @Override
    public FedStatement getStatement()
    {
        FedStatement statement = new FedStatement(this, conn, metaDataManger);
        return statement;
    }

    @Override
    public void close()
    {
        for (int i = 0; i < 3; i++)
        {
            try
            {
                this.conn[i].close();
            } catch (SQLException se)
            {
            }
        }
    }

    @Override
    public void setAutoCommit(boolean autoCommit) throws FedException
    {
    }

    @Override
    public boolean getAutoCommit() throws FedException
    {
        return false;
    }

    @Override
    public void rollback() throws FedException
    {
        for(Connection con : conn)
            try
            {
                con.rollback();
            } catch (SQLException ex)
            {
                throw new FedException(ex);
            }
    }

    @Override
    public void commit() throws FedException
    {
        for(Connection con : conn)
            try
            {
                con.commit();
            } catch (SQLException ex)
            {
                throw new FedException(ex);
            }
    }
    
    public FedSavepoint setSavepoint() throws SQLException
    {
        return new FedSavepoint(this);
    }
}
