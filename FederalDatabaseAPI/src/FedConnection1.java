import java.sql.*;
import oracle.jdbc.driver.*;
import oracle.sql.*;

public class FedConnection implements FedConnectionInterface
{
    private Connection conn[]= new Connection [2];

    public FedConnection(Connection[] conns){
        this.conn = conns;
    }

    public FedConnection getStatement(){
        return null;
    }

    public void close(){
        for(int i=0; i < 3;i++){
            this.conn[i].close();
        }
    }

    public void setAutoCommit(boolean autoCommit) throws FedException{
        
    }

    public boolean getAutoCommit() throws FedException{
        return true;
    }

    public void commit() throws FedException{
        
    }

    public void rollback() throws FedException{

    }
    

}