
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class FedStatement implements FedStatementInterface {
    private Connection con[] = new Connection[3];
    
        public FedStatement(Connection conn[])
        {             
             this.con=conn;
        }

        @Override
	public int executeUpdate(String sql) throws FedException {
            //1: Parser: parse the sql
            //2: Preprepare the sql 
            //3: 
            
            if(sql.startsWith("drop"))
            {
                for(int i=0; i<3;i++)
                {
                    try {
                        PreparedStatement statement= con[i].prepareStatement(sql);
                        statement.executeUpdate();
                    } catch (Exception ex) {
                        Logger.getLogger(FedStatement.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            
            return 1;
  
	}

        @Override
    public FedResultSet executeQuery(String sql) throws FedException {
	return null;
	}

        @Override
    public FedConnection getConnection() throws FedException {
            return null;
	}

        @Override
    public void close() throws FedException {
	
	}
}
