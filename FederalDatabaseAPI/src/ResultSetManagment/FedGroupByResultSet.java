/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ResultSetManagment;

import Conditions.CompareCondition;
import Conditions.HavingCompare;
import FederalDB.FedException;
import MetaData.ColumnDefinition;
import ResultSetManagment.Aggregation.Aggregation;
import java.sql.Types;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class FedGroupByResultSet implements FedResultSetExtendedInterface
{
    private FedResultSetExtendedInterface rs;
    private ColumnDefinition forColumn;
    /**
     * Maps from the found GroupColumnValues to a List of Row Indicies matching the GroupColumnValue
     */
    private HashMap<Object, List<Integer>> map;
    private int cursor;
    private int forColumnIndex;
    /**
     * Maps from the ColumnIndex to the corresponding Aggregation Column
     */
    private HashMap<Integer, Aggregation> aggregationMap;
    private HavingCompare having;

    public FedGroupByResultSet(FedResultSetExtendedInterface rs, 
            ColumnDefinition forColumn, 
            HashMap<Integer, Aggregation> aggregationMap, HavingCompare having) throws FedException
    {
        this.rs = rs;
        this.forColumn = forColumn;
        this.map = new HashMap<>();
        this.aggregationMap = aggregationMap;
        this.having = having;
        forColumnIndex = FedResultSet.getIndexOfColumn(rs, forColumn);
        if(rs.first())
        {
            do
            {
                Object colval = rs.getColumnType(forColumnIndex) == Types.VARCHAR? rs.getString(forColumnIndex): rs.getInt(forColumnIndex);
                if(!map.containsKey(colval))
                    map.put(colval, new ArrayList<>());
                map.get(colval).add(rs.getCursorPosition());
            }while(rs.next());
        }
        if(having != null)
        {
            for(int i = 0; i < map.size(); i++)
                if(!having.execute(new ArrayList(map.values()).size()))
                    map.remove((new ArrayList(map.keySet()).get(i)));
        }
        first();
    }

    @Override
    public boolean first() throws FedException
    {
        if(map.isEmpty())
            return false;
        cursor = 1;
        return true;
    }

    @Override
    public int getCursorPosition() throws FedException
    {
        return cursor;
    }

    @Override
    public boolean setCursorPosition(int position) throws FedException
    {
        if(position <= map.size() && position > 0)
        {
            cursor = position;
            return true;
        }
        return false;
    }

    @Override
    public int getRowCount() throws FedException
    {
        return map.size();
    }

    @Override
    public boolean next() throws FedException
    {
        if(cursor + 1 <= map.size())
        {
            cursor++;
            return true;
        }
        return false;
    }

    @Override
    public String getString(int columnIndex) throws FedException
    {
        if(columnIndex == forColumnIndex)
            return ((String) new ArrayList(map.keySet()).get(cursor-1));
        throw new FedException(new Exception("Column not found or not aggregated"));
    }

    @Override
    public int getInt(int columnIndex) throws FedException
    {
        if(aggregationMap.containsKey(columnIndex))
        {
            try {
                return aggregationMap.get(columnIndex).aggregate(rs, (List<Integer>)new ArrayList(map.values()).get(cursor-1));
            } catch (Exception ex) {
                throw new FedException(ex);
            }
        }
        else if(columnIndex == forColumnIndex)
            return ((Integer) new ArrayList(map.keySet()).get(cursor-1));
        throw new FedException(new Exception("Column not found or not aggregated"));
    }

    @Override
    public int getColumnCount() throws FedException
    {
        return rs.getColumnCount();
    }

    @Override
    public String getColumnName(int index) throws FedException
    {
        return rs.getColumnName(index);
    }

    @Override
    public int getColumnType(int index) throws FedException
    {
        return rs.getColumnType(index);
    }

    @Override
    public void close() throws FedException
    {
        rs.close();
    }
}
