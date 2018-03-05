/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ResultSetManagment;

import Conditions.Condition;
import FederalDB.FedException;
import java.util.List;

/**
 *
 * @author Admin
 */
public class FedConditionResultSet implements FedResultSetExtendedInterface
{

    private Condition condition;
    private FedResultSetExtendedInterface resultSet;
    private List<Integer> filteredRows;
    private int index;

    public FedConditionResultSet(Condition condition, FedResultSetExtendedInterface resultSet)
            throws FedException
    {
        this.condition = condition;
        this.resultSet = resultSet;
        filteredRows = condition.execute(resultSet);
        first();
    }

    @Override
    public boolean first() throws FedException
    {
        index = 0;
        if (filteredRows.size() > 0)
        {
            return resultSet.setCursorPosition(filteredRows.get(0));
        }
        return false;
    }

    @Override
    public int getCursorPosition() throws FedException
    {
        if (filteredRows.isEmpty())
        {
            return 0;
        }
        return index + 1;
    }

    @Override
    public boolean next() throws FedException
    {
        if (filteredRows.isEmpty())
        {
            return false;
        }
        if (index + 1 >= filteredRows.size())
        {
            return false;
        }
        return resultSet.setCursorPosition(++index);
    }

    @Override
    public String getString(int columnIndex) throws FedException
    {
        if (filteredRows.isEmpty())
        {
            throw new FedException(new Exception("No Row Selected"));
        }
        return resultSet.getString(columnIndex);
    }

    @Override
    public int getInt(int columnIndex) throws FedException
    {
        if (filteredRows.isEmpty())
        {
            throw new FedException(new Exception("No Row Selected"));
        }
        return resultSet.getInt(columnIndex);
    }

    @Override
    public int getColumnCount() throws FedException
    {
        return filteredRows.size();
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

    @Override
    public boolean setCursorPosition(int position) throws FedException
    {
        if (position - 1 >= filteredRows.size())
        {
            return false;
        }
        if (position < 1)
        {
            return false;
        }
        index = position - 1;
        return resultSet.setCursorPosition(filteredRows.get(index));
    }

    @Override
    public int getRowCount() throws FedException
    {
        return filteredRows.size();
    }

}
