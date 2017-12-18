import java.sql.ResultSet;
import Interfaces.*

public class FedResultSet implements FedResultSetInterface {
	
	ResultSet rs;
	int columns;
	
	
	@Override
	boolean next () throws FedException {
		if(rs.next()) {
			return true;
		} else {
			return false;
		}
	}
	
	
	@Override
	String getString (int columnIndex) throws FedException {
		String inhalt = rs.getString(index);
		return inhalt;
	}
	
	//Wird irgendwie auch nie verwendet..
	@Override
	int getInt (int columnIndex) throws FedException {
		//Hier fehlt noch der Inhalt
		return 1;
	}
	
	@Override
	int getColumnCount () throws FedException {
		columns = rs.getMetaData().getColumnCount();
		return columns;
	}
	
	@Override
	String getColumnName (int index) throws FedException {
		String label = rs.getColumnLabel(index);
		return label;
	}
	
	
	//Wird nie verwendet..
	@Override
	int getColumnType (int index) throws FedException {
		//Hier fehlt noch der Inhalt
		//rs.getColumnType(index);
		return 3;
	}
	
	//wird auch nicht aufgerufen, sollte aber geschlossen werden, wenn das Statement geschlossen wird.
	@Override
	void close() throws FedException{
		
	}
}