/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ResultSetManagment;

import FederalDB.FedException;
import FederalDB.FedResultSetInterface;
import MetaData.ColumnDefinition;
import MetaData.ColumnValue;
import ResultSetManagment.Aggregation.Aggregation;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;
import parser.AnalysedStatements.CreateColumnDefinition;

/**
 *
 * @author Admin
 */
public class FedResultSet implements FedResultSetInterface
{

    private FedResultSetExtendedInterface rs;
    private boolean beforeFirst;

    public FedResultSet(FedResultSetExtendedInterface rs) throws FedException
    {
        this.rs = rs;
        rs.first();
        beforeFirst = true;
    }

    @Override
    public boolean next() throws FedException
    {
        if(beforeFirst)
        {
            beforeFirst = false;
            return rs.first();
        }
        return rs.next();
    }

    @Override
    public String getString(int columnIndex) throws FedException
    {
        if(rs.getColumnType(columnIndex) == CreateColumnDefinition.TYPE_VARCHAR)
            return rs.getString(columnIndex);
        return rs.getInt(columnIndex) + "";
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
        for(int i = 1; i <= rs.getColumnCount(); i++)
        {
            if(coldef instanceof Aggregation && rs.getColumnName(i).toLowerCase().equals(coldef.toWhereString().toLowerCase().trim()))
                return i;
            if(rs.getColumnName(i).toLowerCase().equals(coldef.name.toLowerCase().trim()))
                return i;
           
        }
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
                    list[i++] = rs.getInteger(index);
                }while(rs.next());
        }
        return list;
    }
    
    public static String padLeft(String s, int n) {
        return String.format("%1$" + n + "s", s);  
    }
    
    public static String printOut(FedResultSetExtendedInterface rs) throws FedException
    {
        int oldpos = rs.getCursorPosition();
        String str = " # |";
        for(int i = 1; i <= rs.getColumnCount(); i++)
            str += padLeft(rs.getColumnName(i), 20) + "|";
        str += " (" + rs.getRowCount() + ")";
        if(rs.first())
        {
            do
            {
                str += "\n" + padLeft(rs.getCursorPosition()+"", 3) + "|";
                for(int i = 1; i <= rs.getColumnCount(); i++)
                    if(rs.getColumnType(i) == CreateColumnDefinition.TYPE_VARCHAR)
                        str += padLeft(rs.getString(i), 20) + "|";
                    else str += padLeft(rs.getInt(i)+"", 20) + "|";
            } while(rs.next());
        }
        rs.setCursorPosition(oldpos);
        return str;
    }
    
    public static FedResultSetExtendedInterface aggregate(FedResultSetExtendedInterface seleResu, List<ColumnDefinition> resultColumns) throws Exception
    {
        List<ColumnValue> values = new ArrayList<>();
        for(ColumnDefinition coldef : resultColumns)
        {
            Aggregation agcol = (Aggregation)coldef;
            ColumnValue val = new ColumnValue(coldef.name, coldef.tableName, agcol.aggregate(seleResu));
            values.add(val);
        }
        return new ValueWrapperResultSet(values);
    }
}
