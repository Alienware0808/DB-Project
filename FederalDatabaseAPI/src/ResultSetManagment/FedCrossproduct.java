/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ResultSetManagment;

import FederalDB.FedException;
import java.sql.ResultSet;

/**
 *
 * @author Admin
 */
public class FedCrossproduct implements FedResultSetExtendedInterface {

    private FedResultSetExtendedInterface left;
    private FedResultSetExtendedInterface right;
    private int currentIndex;
    
    public FedCrossproduct(FedResultSetExtendedInterface left, FedResultSetExtendedInterface right) throws FedException
    {
        this.left = left;
        this.right = right;
        first();
    }
    
    public FedCrossproduct(ResultSet left, ResultSet right) throws FedException
    {
        this(new SqlResultWrapper(left), new SqlResultWrapper(right));
    }
    
    @Override
    public boolean first() throws FedException {
        currentIndex = 0;
        boolean l = left.first();
        boolean r = right.first();
        return r & l;
    }

    @Override
    public boolean next() throws FedException {
        if(right.next()) // Next in the right
            return true;
        if(left.next()) // Next in the left
            return right.first(); // Reset the left
        return false;
    }

    @Override
    public String getString(int columnIndex) throws FedException {
        if(left.getColumnCount() > columnIndex)
            return right.getString(columnIndex - left.getColumnCount());
        return left.getString(columnIndex);
    }

    @Override
    public int getInt(int columnIndex) throws FedException {
        if(left.getColumnCount() > columnIndex)
            return right.getInt(columnIndex - left.getColumnCount());
        return left.getInt(columnIndex);
    }

    @Override
    public int getColumnCount() throws FedException {
        return right.getColumnCount() + left.getColumnCount();
    }

    @Override
    public String getColumnName(int index) throws FedException {
        if(left.getColumnCount() > index)
            return right.getColumnName(index - left.getColumnCount());
        return left.getColumnName(index);
    }

    @Override
    public int getColumnType(int index) throws FedException {
        if(left.getColumnCount() > index)
            return right.getColumnType(index - left.getColumnCount());
        return left.getColumnType(index);
    }

    @Override
    public void close() throws FedException {
        right.close();
        left.close();
    }
    
}
