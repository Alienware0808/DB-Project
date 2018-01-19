import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class FedResultSet implements FedResultSetInterface {

    private final List<ResultSetColumn> resultTable;

    public FedResultSet() {
        this.resultTable = new ArrayList();
    }

    public FedResultSet(ResultSet resultSet) {

        this.resultTable = new ArrayList();

    // TODO ResultSet befüllen
//        resultSet.getMetaData().getTableName();
//        resultSet.getMetaData().getColumnName();
//        resultSet.getMetaData().getColumnCount();
    }

    // TODO Zusammenführen von ResultSets
    
    
    
    // TODO Interface - Funktionen (letzter Schritt)
    @Override
    public boolean next() throws FedException {
        return true;
    }

    @Override
    public String getString(int columnIndex) throws FedException {
        return "Test";
    }

    //Wird irgendwie auch nie verwendet..
    @Override
    public int getInt(int columnIndex) throws FedException {
        //Hier fehlt noch der Inhalt
        return 1;
    }

    @Override
    public int getColumnCount() throws FedException {
        return 20;
    }

    @Override
    public String getColumnName(int index) throws FedException {
        return "Überschrift_1";
    }

    //Wird nie verwendet..
    @Override
    public int getColumnType(int index) throws FedException {
        //Hier fehlt noch der Inhalt
        //rs.getColumnType(index);
        return 3;
    }

    //wird auch nicht aufgerufen, sollte aber geschlossen werden, wenn das Statement geschlossen wird.
    @Override
    public void close() throws FedException {

    }

    
    // erstmal finished
    public class ResultSetColumn<T> {

        private String name;
        private String tableName;
        private final List<T> data;

        public ResultSetColumn() {
            this.data = new ArrayList<>();
        }

        public ResultSetColumn(List<T> data) {
            this.data = data;
        }

        public ResultSetColumn(String name, String tableName, List<T> data) {
            this.name = name;
            this.tableName = tableName;
            this.data = data;
        }

        public T getDataAt(int index) {
            return data.get(index);
        }

        public String getName() {
            return name;
        }

        public String getTableName() {
            return tableName;
        }
    }
}
