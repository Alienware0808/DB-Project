import java.sql.ResultSet;

public class FedResultSet implements FedResultSetInterface {
	
	
	
	@Override
	public boolean next () throws FedException {
            return true;
	}
	
	
	@Override
	public String getString (int columnIndex) throws FedException {
		return "Test";
	}
	
	//Wird irgendwie auch nie verwendet..
	@Override
	public int getInt (int columnIndex) throws FedException {
		//Hier fehlt noch der Inhalt
		return 1;
	}
	
	@Override
	public int getColumnCount () throws FedException {
		return 20;
	}
	
	@Override
	public String getColumnName (int index) throws FedException {
		return "Überschrift_1";
	}
	
	
	//Wird nie verwendet..
	@Override
	public int getColumnType (int index) throws FedException {
		//Hier fehlt noch der Inhalt
		//rs.getColumnType(index);
		return 3;
	}
	
	//wird auch nicht aufgerufen, sollte aber geschlossen werden, wenn das Statement geschlossen wird.
	@Override
	public void close() throws FedException{
		
	}
}