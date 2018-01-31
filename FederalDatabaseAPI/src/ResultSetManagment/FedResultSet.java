package ResultSetManagment;

import FederalDB.FedException;
import FederalDB.FedResultSetInterface;
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
    private boolean isDisposed;
    private int index;

    private FedResultSet() {
        this.resultTable = new ArrayList();
        isDisposed = false;
        index = 0;
    }

    /**
     * Instanciating a FedResultSet from a java.sql.ResultSet
     * @param resultSet
     * @throws SQLException 
     */
    public FedResultSet(ResultSet resultSet) throws SQLException {
        isDisposed = false;
        this.resultTable = new ArrayList();
        index = 0;
        ResultSetMetaData rsMetaData = resultSet.getMetaData();
        int columnCount = rsMetaData.getColumnCount();
        if(columnCount < 1)
            throw new SQLException("A ResultSet must have atleast one column");
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

    
    /**
     * Checks if a Merge with another ResultSet would result in valid ResultSet
     * @param resultSet
     * @return 
     */
    private boolean isMergeValid(FedResultSet resultSet)
    {
        if(getIndexOfColumn(resultSet.resultTable.get(0)) == -1)
        {
            // Check if the both resultSets have the same amound of Rows
            if(resultSet.resultTable.get(0).data.size() != 
                    resultTable.get(0).data.size())
                return false;
            else
            {
                // Check if the result sets are distinct
                for(ResultSetColumn current : resultSet.resultTable)
                    if(getIndexOfColumn(current) != -1)
                        return false;
            }
        }
        else
        {
            // check if the resultsets have the same columns everywhere!!!
            for(ResultSetColumn current : resultSet.resultTable)
                    if(getIndexOfColumn(current) == -1)
                        return false;
        }
        return true;
    }
    /**
     * Merging different ResultSets
     * @param resultSet
     * @throws FederalDB.FedException
     */
    public void mergeWith(FedResultSet resultSet)
            throws Exception
    {
        if(!isMergeValid(resultSet))
            throw new FedException(new Exception("The merge would result in an inconsistent ResultSet"));
        if(getIndexOfColumn(resultSet.resultTable.get(0)) == -1)
        {
            // Vertical Merge
            resultSet.resultTable.forEach((current) -> {
                resultTable.add(current);
            });
        }
        else
        {
            // Horizontal Merge
            resultSet.resultTable.forEach((current) -> {
                ResultSetColumn ourColumn = resultTable.get(getIndexOfColumn(current));
                ourColumn.data.addAll(current.data);
            });
        }
        resultSet.close();
    }
    
    /**
     * Instanciate FedResultSet as a Crossproduct from the giving FedResultSet
     * @param resultSet
     * @return
     * @throws FedException 
     */
    public FedResultSet crossProduct(FedResultSet resultSet) throws Exception
    {
        FedResultSet result = new FedResultSet();
        resultTable.forEach((current) -> {
            result.resultTable.add(current.clone());
        });
        resultSet.resultTable.forEach((current) -> {
            result.resultTable.add(current.clone());
        });
        // TODO MAKE THAT PERFOMANZZZZZZZZZEEEE !!!
        // TODO TEST THAT 
        int length = resultTable.get(0).data.size();
        int _length = resultSet.resultTable.get(0).data.size();
        for(int rowIndex = 0; rowIndex < length; rowIndex++)
        {
            for(int _rowIndex = 0; _rowIndex < _length; _rowIndex++)
            {
                for(int columnIndex = 0; columnIndex < getColumnCount(); columnIndex++)
                    result.resultTable.get(columnIndex).data.add(resultTable.get(columnIndex).data.get(rowIndex));
                for(int _columnIndex = 0; _columnIndex < getColumnCount(); _columnIndex++)
                    result.resultTable.get(_columnIndex).data.add(resultSet.resultTable.get(_columnIndex).data.get(_rowIndex));
            }
        }
        return result;
    }
    
    /**
     * Returns the index of the given Column in the resultTable
     * @param column
     * @return 
     */
    private int getIndexOfColumn(ResultSetColumn column)
    {
        for(int i = 0; i < resultTable.size(); i++)
        {
            if(resultTable.get(i).name.equals(column.name) && 
                    resultTable.get(i).tableName.equals(column.tableName))
                return i;
        }
        return -1;
    }
    
    
    @Override
    public boolean next() throws FedException {
        if(isDisposed)
            throw new FedException(new Exception("Object disposed"));
        if(resultTable.get(0).data.size() >= index + 1)
            return false;
        index++;
        return true;
    }

    /**
     * @param columnIndex
     * @return
     * @throws FedException 
     */
    @Override
    public String getString(int columnIndex) throws FedException {
        if(isDisposed)
            throw new FedException(new Exception("Object disposed"));
        return resultTable.get(columnIndex).data.get(index).toString();
    }
    
    public Object getObjectByNames(String tableName, String columnName) throws FedException {
        if(isDisposed)
            throw new FedException(new Exception("Object disposed"));
        for(ResultSetColumn col: this.resultTable)
        {
            if(col.name.equals(columnName) && col.tableName.equals(tableName))
                return col;
        }
        return null;
        //return resultTable.get(columnIndex).data.get(index).toString();
    }

    
    @Override
    public int getInt(int columnIndex) throws FedException {
        if(isDisposed)
            throw new FedException(new Exception("Object disposed"));
        return ((Integer)resultTable.get(columnIndex).data.get(index));
    }

    @Override
    public int getColumnCount() throws FedException {
        if(isDisposed)
            throw new FedException(new Exception("Object disposed"));
        return resultTable.size();
    }

    @Override
    public String getColumnName(int index) throws FedException {
        if(isDisposed)
            throw new FedException(new Exception("Object disposed"));
        return resultTable.get(index).getName();
    }

    
    @Override
    public int getColumnType(int index) throws FedException {
        if(isDisposed)
            throw new FedException(new Exception("Object disposed"));
        // TODO Schauen wie es das sqlResultSet macht von Java und dann hier drauf übertragen
        return java.sql.Types.INTEGER;
    }
    
    @Override
    public void close() throws FedException {
        isDisposed = true;

    }

    
    
    /**
     * Creating a generic List T
     * @param <T> 
     */
    private class ResultSetColumn<T> {

        private String name;
        private String tableName;
        private final List<T> data;

        private ResultSetColumn() {
            this.data = new ArrayList<>();
        }

        private ResultSetColumn(List<T> data) {
            this.data = data;
        }

        private ResultSetColumn(String name, String tableName, List<T> data) {
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
        
        @Override
        protected ResultSetColumn clone()
        {
            ResultSetColumn<T> clone = new ResultSetColumn<>();
            clone.name = name;
            clone.tableName = tableName;
            return clone;
        }
    }
}