/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ResultSetManagment;

import FederalDB.FedException;
import FederalDB.FedResultSetInterface;
import MetaData.ColumnDefinition;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class FedResultSet implements FedResultSetInterface
{

    private FedResultSetInterface rs;

    public FedResultSet(FedResultSetInterface rs)
    {
        this.rs = rs;
    }

    @Override
    public boolean next() throws FedException
    {
        return rs.next();
    }

    @Override
    public String getString(int columnIndex) throws FedException
    {
        return rs.getString(columnIndex);
    }

    @Override
    public int getInt(int columnIndex) throws FedException
    {
        return rs.getInt(columnIndex);
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
    
    public static int getIndexOfColumn(FedResultSetInterface rs, ColumnDefinition coldef) 
            throws FedException
    {
        for(int i = 0; i < rs.getColumnCount(); i++)
            if(rs.getColumnName(i).toLowerCase().equals(coldef.name.toLowerCase().trim()))
                return i;
        return -1;
    }
    
    public static Object[] columnToArray(FedResultSetExtendedInterface rs, int index) 
            throws FedException
    {
        Object[] list = new Object[rs.getRowCount()];
        int i = 0;
        if(rs.first())
        {
            if(rs.getColumnType(index) == Types.VARCHAR)
                do{
                    list[i++] = rs.getString(index);
                }while(rs.next());
            else
                do{
                    list[i++] = rs.getInt(index);
                }while(rs.next());
        }
        return list;
    }
}
