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
public class FedHorizontalResultSet implements FedResultSetExtendedInterface {
    
    private FedResultSetExtendedInterface first;
    private FedResultSetExtendedInterface secound;
    private boolean isAtFirst;
    
    public FedHorizontalResultSet(FedResultSetExtendedInterface first, FedResultSetExtendedInterface secound) throws FedException
    {
        this.first = first;
        this.secound = secound;
        first.first();
        first.first();
        isAtFirst = true;
    }

    public FedHorizontalResultSet(ResultSet left, ResultSet right) throws FedException
    {
        this(new SqlResultWrapper(left), new SqlResultWrapper(right));
    }
    
    @Override
    public boolean next() throws FedException {
        if(isAtFirst)
        {
            if(first.next())
                return true;
            isAtFirst = false;
        }
        if(secound.next())
            return true;
        return false;
    }

    @Override
    public String getString(int columnIndex) throws FedException {
        if(isAtFirst)
            return first.getString(columnIndex);
        return secound.getString(columnIndex);
    }

    @Override
    public int getInt(int columnIndex) throws FedException {
        if(isAtFirst)
            return first.getInt(columnIndex);
        return secound.getInt(columnIndex);
    }

    @Override
    public int getColumnCount() throws FedException {
        return first.getColumnCount();
    }

    @Override
    public String getColumnName(int index) throws FedException {
        return first.getColumnName(index);
    }

    @Override
    public int getColumnType(int index) throws FedException {
        return first.getColumnType(index);
    }

    @Override
    public void close() throws FedException {
        first.close();
        secound.close();
    }

    @Override
    public boolean first() throws FedException {
        boolean res = first.first();
        if(secound.first())
            return true;
        return res;
    }
}
