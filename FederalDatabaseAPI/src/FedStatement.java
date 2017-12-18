
public class FedStatement implements FedStatementInterface {

        @Override
	public int executeUpdate(String sql) throws FedException {
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
