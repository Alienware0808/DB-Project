package FederalDB;


import MetaData.MetaDataManager;
import java.sql.Connection;
import java.sql.SQLException;


public class FedConnection implements FedConnectionInterface{
    private Connection conn[] = new Connection[3];
    public final MetaDataManager metaDataManger;

    public FedConnection(Connection[] conns){
        this.conn = conns;
        metaDataManger = new MetaDataManager(conn[0]);
    }

    @Override
    public FedStatement getStatement(){
        FedStatement statement= new FedStatement(this, conn, metaDataManger);
        return statement;
    }

    @Override
    public void close(){
        for(int i=0; i < 3;i++){
            try {
            this.conn[i].close();
            } catch (SQLException se) {
                
            }
        }
    }

    @Override
    public void setAutoCommit(boolean autoCommit) throws FedException{
    }

    @Override
    public boolean getAutoCommit() throws FedException{
        return false;
    }


    @Override
    public void rollback() throws FedException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void commit() throws FedException {
        throw new FedException(new UnsupportedOperationException("Not supported yet.")); //To change body of generated methods, choose Tools | Templates.
    }
}