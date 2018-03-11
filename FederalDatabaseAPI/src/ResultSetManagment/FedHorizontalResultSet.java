/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ResultSetManagment;

import FederalDB.FedException;
import FederalDB.FedResultSetInterface;
import java.sql.ResultSet;

/**
 *
 * @author Admin
 */
public class FedHorizontalResultSet implements FedResultSetExtendedInterface
{

    private FedResultSetExtendedInterface first;
    private FedResultSetExtendedInterface second;
    private boolean isAtFirst;

    public FedHorizontalResultSet(FedResultSetExtendedInterface first, FedResultSetExtendedInterface second) throws FedException
    {
        this.first = first;
        this.second = second;
        first.first();
        first.first();
        isAtFirst = true;
    }

    public FedHorizontalResultSet(ResultSet left, ResultSet right) throws FedException
    {
        this(new SqlWrapperResultSet(left), new SqlWrapperResultSet(right));
    }

    public FedHorizontalResultSet(FedResultSetExtendedInterface first, ResultSet right) throws FedException
    {
        this(first, new SqlWrapperResultSet(right));
    }

    public FedHorizontalResultSet(ResultSet left, FedResultSetExtendedInterface right) throws FedException
    {
        this(new SqlWrapperResultSet(left), right);
    }

    @Override
    public boolean next() throws FedException
    {
        if (isAtFirst)
        {
            if (first.next())
            {
                return true;
            }
            isAtFirst = false;
            return second.first();
        }
        if (second.next())
        {
            return true;
        }
        return false;
    }

    @Override
    public String getString(int columnIndex) throws FedException
    {
        if (isAtFirst)
        {
            return first.getString(columnIndex);
        }
        return second.getString(columnIndex);
    }

    @Override
    public int getInt(int columnIndex) throws FedException
    {
        if (isAtFirst)
        {
            return first.getInt(columnIndex);
        }
        return second.getInt(columnIndex);
    }

    @Override
    public int getColumnCount() throws FedException
    {
        return first.getColumnCount();
    }

    @Override
    public String getColumnName(int index) throws FedException
    {
        return first.getColumnName(index);
    }

    @Override
    public int getColumnType(int index) throws FedException
    {
        return first.getColumnType(index);
    }

    @Override
    public void close() throws FedException
    {
        first.close();
        second.close();
    }

    @Override
    public boolean first() throws FedException
    {
        boolean res = first.first();
        isAtFirst = res;
        if (second.first())
        {
            return true;
        }
        return res;
    }

    @Override
    public int getCursorPosition() throws FedException
    {
        if (isAtFirst)
        {
            return first.getCursorPosition();
        } else
        {
            return first.getRowCount()+ second.getCursorPosition();
        }
    }

    @Override
    public boolean setCursorPosition(int position) throws FedException
    {
        if (position > first.getRowCount())
        {
            isAtFirst = false;
            return second.setCursorPosition(position - first.getRowCount());
        }
        isAtFirst = true;
        return first.setCursorPosition(position);
    }

    @Override
    public int getRowCount() throws FedException
    {
        return first.getRowCount() + second.getRowCount();
    }

    @Override
    public Integer getInteger(int columnIndex) throws FedException
    {
        if (isAtFirst)
        {
            return first.getInteger(columnIndex);
        }
        return second.getInteger(columnIndex);
    }
}
