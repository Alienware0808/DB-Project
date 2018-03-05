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

    public FedConnection(Connection[] conns) throws SQLException, IOException, IOException
    {
        this.conn = conns;
        metaDataManger = new MetaDataManager(conn[0]);
        /*
        try
        {
            FedVerticalResultSet vert1 = new FedVerticalResultSet
            (SQLHelper.select(conn[0], "id", "name", "eule", "MYVERT"),
             SQLHelper.select(conn[1], "id", "jemy", "myint", "MYVERT"));
            
            ResultSet vertRes3 = SQLHelper.select(conn[2], "id", "kume", "MYVERT");
            
            FedVerticalResultSet vertiResult = new FedVerticalResultSet(vert1, vertRes3);
            
            System.out.println(vertiResult.getColumnName(1) 
                + " | " + vertiResult.getColumnName(2)
                + " | " + vertiResult.getColumnName(3)
                + " | " + vertiResult.getColumnName(4)
                + " | " + vertiResult.getColumnName(5)
                + " | " + vertiResult.getColumnName(6)
                + " -> " + vertiResult.getColumnCount());
            
            do
            {
                System.out.println(vertiResult.getInt(1) 
                + " | " + vertiResult.getString(2)
                + " | " + vertiResult.getString(3)
                + " | " + vertiResult.getString(4)
                + " | " + vertiResult.getInt(5)
                + " | " + vertiResult.getInt(6));
            } while(vertiResult.next());
            
            FedHorizontalResultSet hori1 = new FedHorizontalResultSet
            (SQLHelper.select(conn[0], "id", "wort", "MYHORI"),
             SQLHelper.select(conn[1], "id", "wort", "MYHORI"));
            
            ResultSet horires3 = SQLHelper.select(conn[2], "id", "wort", "MYHORI");
            
            FedHorizontalResultSet horiResult = new FedHorizontalResultSet(hori1, horires3);
            System.out.println();
             System.out.println(horiResult.getColumnName(1) 
                + " | " + horiResult.getColumnName(2)
                + " -> " + horiResult.getColumnCount());
            
            do
            {
                System.out.println(horiResult.getInt(1) + " | " + horiResult.getString(2));
            } while(horiResult.next());
            
            
            FedCrossproductResultSet crossProd = new FedCrossproductResultSet(vertiResult, horiResult);
            System.out.println();
            System.out.println(crossProd.getColumnName(1) 
                + " | " + crossProd.getColumnName(2)
                + " | " + crossProd.getColumnName(3)
                + " | " + crossProd.getColumnName(4)
                + " | " + crossProd.getColumnName(5)
                + " | " + crossProd.getColumnName(6)
                + " | " + crossProd.getColumnName(7)
                + " | " + crossProd.getColumnName(8)
                + " -> " + crossProd.getColumnCount());
            
            do
            {
                System.out.println(crossProd.getInt(1) 
                + " | " + crossProd.getString(2)
                + " | " + crossProd.getString(3)
                + " | " + crossProd.getString(4)
                + " | " + crossProd.getInt(5)
                + " | " + crossProd.getInt(6)
                + " | " + crossProd.getInt(7)
                + " | " + crossProd.getString(8));
            } while(crossProd.next());
            
            String dummy = "";
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
         */
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
