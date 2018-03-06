package FederalDB;

import Data.SQLHelper;
import MetaData.MetaDataManager;
import ResultSetManagment.FedCrossproductResultSet;
import ResultSetManagment.FedHorizontalResultSet;
import ResultSetManagment.FedVerticalResultSet;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Savepoint;
import parser.AnalysedStatements.CreateStatement;

public class FedConnection implements FedConnectionInterface
{

    private Connection conn[] = new Connection[3];
    public final MetaDataManager metaDataManger;

    public FedConnection(Connection[] conns) throws FedException
    {
        this.conn = conns;
        try
        {
            metaDataManger = new MetaDataManager(conn[0]);
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void commit() throws FedException
    {
        throw new FedException(new UnsupportedOperationException("Not supported yet.")); //To change body of generated methods, choose Tools | Templates.
    }
    
    public FedSavepoint setSavepoint() throws SQLException
    {
        return new FedSavepoint(this);
    }
}
