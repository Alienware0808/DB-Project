
import java.sql.Connection;
import java.sql.SQLException;


public class FedConnection implements FedConnectionInterface{
    private Connection conn[] = new Connection[3];

    public FedConnection(Connection[] conns){
        this.conn = conns;
    }

    @Override
    public FedStatement getStatement(){
        return null;
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

}