/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MetaData;

import Conditions.IValue;
import FederalDB.FedException;
import FederalDB.FedResultSetInterface;
import ResultSetManagment.FedResultSetExtendedInterface;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import parser.AnalysedStatements.CreateColumnDefinition;

/**
 *
 * @author Franz Weidmann
 */
public class ColumnDefinition implements IValue, java.io.Serializable
{

    public String name;
    public String tableName;

    public ColumnDefinition()
    {
    }

    public ColumnDefinition(String columnName, String tableName)
    {
        this.name = columnName.trim().toLowerCase();
        this.tableName = tableName.trim().toLowerCase();
    }

    private int getIndexByName(FedResultSetInterface resultSet) throws FedException
    {
        for (int i = 1; i <= resultSet.getColumnCount(); i++)
        {
            if (resultSet.getColumnName(i).trim().toLowerCase().equals(name.toLowerCase().trim()))
            {
                return i;
            }
        }
        return -1;
    }

    @Override
    public Object getValue(FedResultSetExtendedInterface resultSet)
            throws FedException
    {
        int index = getIndexByName(resultSet);
        if (index == -1)
        {
            throw new FedException(new Exception("Field not Found"));
        }
        try
        {
            int type = resultSet.getColumnType(index);
            if (Objects.equals(type, CreateColumnDefinition.TYPE_VARCHAR))
            {
                // string
                return resultSet.getString(index);
            } else
            {
                return resultSet.getInteger(index);
            }
        } catch (FedException ex)
        {
            Logger.getLogger(ColumnDefinition.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (obj == null)
        {
            return false;
        }
        if (!(obj instanceof ColumnDefinition))
        {
            return false;
        }
        String otherName = ((ColumnDefinition) (obj)).name.toLowerCase();
        String otherTable = ((ColumnDefinition) (obj)).tableName.toLowerCase();
        if (otherName.equals(this.name.toLowerCase())
                && otherTable.equals(this.tableName.toLowerCase()))
        {
            return true;
        }
        return false;
    }

    @Override
    public String toWhereString()
    {
        return tableName + "." + name;
    }
    
    public String toColumnString()
    {
        return toWhereString();
    }

    @Override
    public String toString()
    {
        return tableName + "." + name;
    }
    
    public static String toColumnString(List<ColumnDefinition> coldefs)
    {
        if(coldefs.isEmpty())
            return "";
        String erg = coldefs.get(0).toColumnString();
        for(int i = 1; i < coldefs.size(); i++)
            erg +=  ", " + coldefs.get(i).toColumnString();
        return erg;
    }
    
    public static String toWhereString(List<ColumnDefinition> coldefs)
    {
        if(coldefs.isEmpty())
            return "";
        String erg = coldefs.get(0).toWhereString();
        for(int i = 1; i < coldefs.size(); i++)
            erg +=  ", " + coldefs.get(i).toWhereString();
        return erg;
    }
    
    public static List<ColumnDefinition> filtered(List<CreateColumnDefinition> allcolls, List<ColumnDefinition> selection)
    {
        List<ColumnDefinition> result = new ArrayList<>();
        selection.stream().filter((sel) -> (allcolls.contains(sel))).forEachOrdered((sel) ->
        {
            result.add(sel);
        });
        return result;
    }
}
