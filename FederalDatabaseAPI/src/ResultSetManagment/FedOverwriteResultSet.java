/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ResultSetManagment;

import FederalDB.FedException;
import MetaData.ColumnValue;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Admin
 */
public class FedOverwriteResultSet implements FedResultSetExtendedInterface
{

    private FedResultSetExtendedInterface resultSet;
    private List<ColumnValue> columnValues;
    private HashMap<Integer, ColumnValue> indexToValue;

    public FedOverwriteResultSet(FedResultSetExtendedInterface resultSet, List<ColumnValue> columnValues)
            throws FedException
    {
        this.resultSet = resultSet;
        this.columnValues = columnValues;
        indexToValue = new HashMap<>();
        for (int i = 1; i <= resultSet.getColumnCount(); i++)
        {
            String name = resultSet.getColumnName(i).toLowerCase().trim();
            for (ColumnValue colval : columnValues)
            {
                if (colval.name.trim().toLowerCase().equals(name))
                {
                    indexToValue.put(i, colval);
                    break;
                }
            }
        }
    }

    @Override
    public boolean first() throws FedException
    {
        return resultSet.first();
    }

    @Override
    public int getCursorPosition() throws FedException
    {
        return resultSet.getCursorPosition();
    }

    @Override
    public boolean setCursorPosition(int position) throws FedException
    {
        return resultSet.setCursorPosition(position);
    }

    @Override
    public int getRowCount() throws FedException
    {
        return resultSet.getRowCount();
    }

    @Override
    public boolean next() throws FedException
    {
        return resultSet.next();
    }

    @Override
    public String getString(int columnIndex) throws FedException
    {
        if (indexToValue.containsKey(columnIndex))
        {
            return indexToValue.get(columnIndex).value.toString();
        }
        return resultSet.getString(columnIndex);
    }

    @Override
    public int getInt(int columnIndex) throws FedException
    {
        if (indexToValue.containsKey(columnIndex))
        {
            return (int) indexToValue.get(columnIndex).value;
        }
        return resultSet.getInt(columnIndex);
    }

    @Override
    public int getColumnCount() throws FedException
    {
        return resultSet.getColumnCount();
    }

    @Override
    public String getColumnName(int index) throws FedException
    {
        return resultSet.getColumnName(index);
    }

    @Override
    public int getColumnType(int index) throws FedException
    {
        return resultSet.getColumnType(index);
    }

    @Override
    public void close() throws FedException
    {
        resultSet.close();
    }

}
