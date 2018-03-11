/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ResultSetManagment;

import FederalDB.FedException;
import MetaData.ColumnValue;
import java.util.List;
import parser.AnalysedStatements.CreateColumnDefinition;

/**
 *
 * @author Admin
 */
public class ValueWrapperResultSet implements FedResultSetExtendedInterface
{

    List<ColumnValue> values;

    public ValueWrapperResultSet(List<ColumnValue> values)
    {
        this.values = values;
    }

    @Override
    public boolean first() throws FedException
    {
        return true;
    }

    @Override
    public int getCursorPosition() throws FedException
    {
        return 1;
    }

    @Override
    public boolean next() throws FedException
    {
        return false;
    }

    @Override
    public String getString(int columnIndex) throws FedException
    {
        if(values.get(columnIndex - 1).value != null)
            return values.get(columnIndex - 1).value.toString();
        return null;
    }

    @Override
    public int getInt(int columnIndex) throws FedException
    {
        if(values.get(columnIndex - 1).value != null)
            return (int) values.get(columnIndex - 1).value;
        return 0;
    }
    
    @Override
    public Integer getInteger(int columnIndex) throws FedException
    {
        if(values.get(columnIndex - 1).value != null)
            return (int) values.get(columnIndex - 1).value;
        return null;
    }

    @Override
    public int getColumnCount() throws FedException
    {
        return values.size();
    }

    @Override
    public String getColumnName(int index) throws FedException
    {
        return values.get(index - 1).name;
    }

    @Override
    public int getColumnType(int index) throws FedException
    {
        if(this.values.get(index - 1).value instanceof String)
            return CreateColumnDefinition.TYPE_VARCHAR;
        return CreateColumnDefinition.TYPE_INT;
    }

    @Override
    public void close() throws FedException
    {
    }

    @Override
    public boolean setCursorPosition(int position) throws FedException
    {
        if (position != 1)
        {
            return false;
        }
        return true;
    }

    @Override
    public int getRowCount() throws FedException
    {
        return 1;
    }
}
