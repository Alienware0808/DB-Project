import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Marcel
 */

public class FedResultSet implements FedResultSetInterface {

    private final List<ResultSetColumn> resultTable;

    public FedResultSet() {
        this.resultTable = new ArrayList();
    }

    public FedResultSet(ResultSet resultSet) throws SQLException {

        this.resultTable = new ArrayList();
        ResultSetMetaData rsMetaData = resultSet.getMetaData();
        int columnCount = rsMetaData.getColumnCount();
        for (int i = 1; i <= columnCount;i++){
            resultSet.first();
            String classname = rsMetaData.getColumnClassName(i);
            
            switch(classname)
            {
                case "int":  
                    ResultSetColumn<Integer> intcol = new ResultSetColumn<Integer>();
                    intcol.name = rsMetaData.getColumnName(i);
                    intcol.tableName = rsMetaData.getTableName(i);
                    resultTable.add(intcol);
                    if(resultSet.isLast())
                        continue;
                    do
                    {
                        intcol.data.add(resultSet.getInt(i));
                    }   
                    while(resultSet.next());
                    break;
                    
                case "java.lang.String":  
                    ResultSetColumn<String> strcol = new ResultSetColumn<String>();
                    strcol.name = rsMetaData.getColumnName(i);
                    strcol.tableName = rsMetaData.getTableName(i);
                    resultTable.add(strcol);
                    if(resultSet.isLast())
                        continue;
                    do
                    {
                        strcol.data.add(resultSet.getString(i));
                    }   
                    while(resultSet.next());
                    break;
            }
            System.out.println("column MetaData ");
            System.out.println("column number " + i);

            System.out.println(rsMetaData.getTableName(i));
        }
        
    }

    // TODO Zusammenführen von ResultSets
    // Zusammenführen bezieht sich auf fedresultset --> Methode heißt Union und die nimmt ein fedreulstsetan --> da werden die 
    // Beim zusammenführen soll ein neues resultset erstellt werden --> wie a + b = c 
    
    //Funktion für resultset was heißt "Merge" (wie ein mergen git) und dabei wir dein resultset angenommen und pflegt es in das momentate resultset ein
    //Beim Mergen --> for each schleife und itereirt über die datensätze die wir bekommen (liste mit data drinne) und schauen ob es bei jedem 
    //wenn ja beide listen hinzufügen // wenn nein füge ich die columen in mein resultset ein //schauen wie referenzenzierung in java funktioniert --> wen wir eine column übernehmen die wir überkommen haben müssen wir die referenz reinschreiben --> 
    //dispose durchführen --> resultset soll nicht mehr gültig sein (sperren)
    //Expection schreiben --> dispose Exception --> String Message "Du darfst das nicht machen weil.." - von exception erben
    //Jede Table müss gleich viele Einträge haben deswegen private/public --> vor merge schauen ob das valid ist oder nicht
    //tipp: private funktion nimmt ein eintrag entgegen ResultSetColumn und schauen ob es diesen gibt oder nicht. check if columnexits
    
    
    // TODO Interface - Funktionen (letzter Schritt)
    @Override
    public boolean next() throws FedException {
        return true;
    }

    /**
     * dfhdfhdfhdfh
     * @param columnIndex
     * @return
     * @throws FedException 
     */
    @Override
    public String getString(int columnIndex) throws FedException {
        return "Test";
        
    }

    //Wird irgendwie auch nie verwendet..
    @Override
    public int getInt(int columnIndex) throws FedException {
        //Hier fehlt noch der Inhalt
        return 0;
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
