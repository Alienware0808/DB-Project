/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ResultSetManagment;

import FederalDB.FedException;
import MetaData.ColumnDefinition;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Admin
 */
public class FedProjectionResultSet implements FedResultSetExtendedInterface
{
    private List<ColumnDefinition> projected;
    private int[] map;
    private FedResultSetExtendedInterface rs;

    public FedProjectionResultSet(FedResultSetExtendedInterface rs, List<ColumnDefinition> projected) throws FedException
    {
        this.projected = projected;
        this.rs = rs;
        map = new int[projected.size()];
        for(int i = 0; i < projected.size(); i++)
        {
            for(int colindex = 1; colindex <= rs.getColumnCount(); colindex++)
                if(rs.getColumnName(colindex).toLowerCase().trim().equals(projected.get(i).name))
                {
                    map[i] = colindex;
                    break;
                }
        }
    }
    
    public FedProjectionResultSet(FedResultSetExtendedInterface rs, ColumnDefinition projectedColumn) throws FedException
    {
        List<ColumnDefinition> projected = new ArrayList<ColumnDefinition>();
        projected.add(projectedColumn);
        this.projected = projected;
        this.rs = rs;
        map = new int[projected.size()];
        for(int i = 0; i < projected.size(); i++)
        {
            for(int colindex = 1; colindex <= rs.getColumnCount(); colindex++)
                if(rs.getColumnName(colindex).toLowerCase().trim().equals(projected.get(i).name))
                {
                    map[i] = colindex;
                    break;
                }
        }
    }
    
    @Override
    public boolean first() throws FedException
    {
        return rs.first();
    }

    @Override
    public int getCursorPosition() throws FedException
    {
        return rs.getCursorPosition();
    }

    @Override
    public boolean setCursorPosition(int position) throws FedException
    {
        return rs.setCursorPosition(position);
    }

    @Override
    public int getRowCount() throws FedException
    {
        return rs.getRowCount();
    }

    @Override
    public boolean next() throws FedException
    {
        return rs.next();
    }

    @Override
    public String getString(int columnIndex) throws FedException
    {
        return rs.getString(map[columnIndex-1]);
    }

    @Override
    public int getInt(int columnIndex) throws FedException
    {
        return rs.getInt(map[columnIndex-1]);
    }

    @Override
    public int getColumnCount() throws FedException
    {
        return map.length;
    }

    @Override
    public String getColumnName(int index) throws FedException
    {
        return rs.getColumnName(map[index-1]);
    }

    @Override
    public int getColumnType(int index) throws FedException
    {
        return rs.getColumnType(map[index-1]);
    }

    @Override
    public void close() throws FedException
    {
        rs.close();
    }
}
