
import Interfaces.*

public class FedResultSet implements FedResultSetInterface {
	
	@Override
	boolean next () throws FedException {
		
	}
	
	
	@Override
	String getString (int columnIndex) throws FedException {
		//Hier fehlt noch der Inhalt
		return "test";
	}
	
	
	@Override
	int getInt (int columnIndex) throws FedException {
		//Hier fehlt noch der Inhalt
		return 1;
	}
	
	@Override
	int getColumnCount () throws FedException {
		//Hier fehlt noch der Inhalt
		return 2;
	}
	
	@Override
	String getColumnName (int index) throws FedException {
		//Hier fehlt noch der Inhalt
		//ResultSetMetaData.getColumnLabel();
		return "test2";
	}
	
	@Override
	int getColumnType (int index) throws FedException {
		//Hier fehlt noch der Inhalt
		//ResultSetMetaData.getColumnType();
		return 3;
	}
	
	@Override
	void close() throws FedException{
		
	}
}