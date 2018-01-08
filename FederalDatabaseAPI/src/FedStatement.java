
public class FedStatement implements FedStatementInterface {

        @Override
	public int executeUpdate(String sql) throws FedException {
            
            if(true){
                //Anweisung die Werte zurück gibt
                return 1;
            }
            else{
                //Anweisung die KEINE Werte zurück gibt
                return 0;
            }
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
