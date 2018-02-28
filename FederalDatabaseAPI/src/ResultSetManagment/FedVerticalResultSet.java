/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ResultSetManagment;

import FederalDB.FedException;
import FederalDB.FedResultSetInterface;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class FedVerticalResultSet implements FedResultSetExtendedInterface {

    /**
     * Map the Indexes to ignore the primary keys in the right map
     */
    private ArrayList<Integer> rightIndexMap;
    private FedResultSetExtendedInterface left;
    private FedResultSetExtendedInterface right;
    
    public FedVerticalResultSet(FedResultSetExtendedInterface left, FedResultSetExtendedInterface right) throws FedException
    {
        this.left = left;
        this.right = right;
        left.first();
        right.first();
        ArrayList<Integer> indexes = new ArrayList();
        for(int i = 1; i <= right.getColumnCount(); i++)
            indexes.add(i);
        ArrayList<Integer> PrimIndexes = getPrimIndexes();
        for(int i = 0; i < PrimIndexes.size(); i++)
            indexes.remove(PrimIndexes.get(i).intValue()-1);
        rightIndexMap = indexes;
    }
    
    public FedVerticalResultSet(ResultSet left, ResultSet right) throws FedException
    {
        this(new SqlWrapperResultSet(left), new SqlWrapperResultSet(right));
    }
    
    public FedVerticalResultSet(FedResultSetExtendedInterface left, ResultSet right) throws FedException
    {
        this(left, new SqlWrapperResultSet(right));
    }
    
    public FedVerticalResultSet(ResultSet left, FedResultSetExtendedInterface right) throws FedException
    {
        this(new SqlWrapperResultSet(left), right);
    }
    
    private ArrayList<Integer> getPrimIndexes() throws FedException
    {
        ArrayList<Integer> list = new ArrayList();
        for(int i = 1; i <= left.getColumnCount(); i++)
        {
            String leftName = left.getColumnName(i);
            for(int j = 1; j <= right.getColumnCount(); j++)
            {
                if(right.getColumnName(j).equals(leftName))
                {
                    list.add(j);
                    break;
                }
            }
        }
        return list;
    }
    
    private int getRightIndex(int columnIndex) throws FedException
    {
        int leftCount = left.getColumnCount();
        return rightIndexMap.get(columnIndex - leftCount - 1);
    }
    
    @Override
    public boolean next() throws FedException {
        left.next();
        return right.next();
    }

    @Override
    public String getString(int columnIndex) throws FedException {
        if(columnIndex > left.getColumnCount())
            return right.getString(getRightIndex(columnIndex));
        return left.getString(columnIndex);
    }

    @Override
    public int getInt(int columnIndex) throws FedException {
        if(columnIndex > left.getColumnCount())
            return right.getInt(getRightIndex(columnIndex));
        return left.getInt(columnIndex);
    }

    @Override
    public int getColumnCount() throws FedException {
        int leftCount = left.getColumnCount();
        int rightCount = this.rightIndexMap.size();
        return leftCount + rightCount;
    }

    @Override
    public String getColumnName(int index) throws FedException {
        if(index > left.getColumnCount())
            return right.getColumnName(getRightIndex(index));
        return left.getColumnName(index);
    }

    @Override
    public int getColumnType(int index) throws FedException {
        if(index > left.getColumnCount())
            return right.getColumnType(getRightIndex(index));
        return left.getColumnType(index);
    }

    @Override
    public void close() throws FedException {
        right.close();
        left.close();
    }

    @Override
    public boolean first() throws FedException {
        left.first();
        return right.first();
    }

    @Override
    public int getCursorPosition() throws FedException {
        return this.left.getCursorPosition();
    }

    @Override
    public boolean setCursorPosition(int position) throws FedException {
        left.setCursorPosition(position);
        return right.setCursorPosition(position);
    }

    @Override
    public int getRowCount() throws FedException {
        return left.getRowCount();
    }
    
}
