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
public class FedCrossproductResultSet implements FedResultSetExtendedInterface {

    private FedResultSetExtendedInterface left;
    private FedResultSetExtendedInterface right;
    private int currentRow;
    
    public FedCrossproductResultSet(FedResultSetExtendedInterface left, FedResultSetExtendedInterface right) throws FedException
    {
        this.left = left;
        this.right = right;
        first();
    }
    
    public FedCrossproductResultSet(ResultSet left, ResultSet right) throws FedException
    {
        this(new SqlWrapperResultSet(left), new SqlWrapperResultSet(right));
    }
    
    @Override
    public boolean first() throws FedException {
        currentRow = 1;
        boolean l = left.first();
        boolean r = right.first();
        return r & l;
    }

    @Override
    public boolean next() throws FedException {
        currentRow++;
        if(right.next()) // Next in the right
            return true;
        if(left.next()) // Next in the left
            return right.first(); // Reset the left
        currentRow--;
        return false;
    }

    @Override
    public String getString(int columnIndex) throws FedException {
        if(columnIndex > left.getColumnCount())
            return right.getString(columnIndex - left.getColumnCount());
        return left.getString(columnIndex);
    }

    @Override
    public int getInt(int columnIndex) throws FedException {
        if(columnIndex > left.getColumnCount())
            return right.getInt(columnIndex - left.getColumnCount());
        return left.getInt(columnIndex);
    }

    @Override
    public int getColumnCount() throws FedException {
        int rightCount = right.getColumnCount();
        int leftCount = left.getColumnCount();
        return rightCount + leftCount;
    }

    @Override
    public String getColumnName(int index) throws FedException {
        if(index > left.getColumnCount())
            return right.getColumnName(index - left.getColumnCount());
        return left.getColumnName(index);
    }

    @Override
    public int getColumnType(int index) throws FedException {
        if(index > left.getColumnCount())
            return right.getColumnType(index - left.getColumnCount());
        return left.getColumnType(index);
    }

    @Override
    public void close() throws FedException {
        right.close();
        left.close();
    }

    @Override
    public int getCursorPosition() throws FedException {
        return currentRow;
    }

    @Override
    public boolean setCursorPosition(int position) throws FedException {
        boolean res1 = true;
        boolean res2 = true;
        res1 = left.setCursorPosition((position - 1) / right.getRowCount() + 1);
        res2 = right.setCursorPosition((position - 1) % right.getRowCount() + 1);
        if(res1 & res2)
        {
            currentRow = position;
            return true;
        }
        else
        {
            // Reset to previous valid position
            position = currentRow;
            left.setCursorPosition((position - 1) / right.getRowCount() + 1);
            right.setCursorPosition((position - 1) % right.getRowCount() + 1);
            return false;
        }
    }

    @Override
    public int getRowCount() throws FedException {
        return right.getRowCount() * left.getRowCount();
    }
    
}
