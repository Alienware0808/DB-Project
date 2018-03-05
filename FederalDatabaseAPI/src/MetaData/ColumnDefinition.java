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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Franz Weidmann
 */
public class ColumnDefinition implements IValue{
    public String name;
    public String tableName;
    
    public ColumnDefinition(){
    }
    
    public ColumnDefinition(String columnName, String tableName){
        this.name = columnName.trim().toLowerCase();
        this.tableName = tableName.trim().toLowerCase();
    }
    
    private int getIndexByName(FedResultSetInterface resultSet) throws FedException
    {
        for(int i = 0; i < resultSet.getColumnCount(); i++)
            if(resultSet.getColumnName(i).trim().toLowerCase().equals(name.toLowerCase().trim()))
                return i;
        return -1;
    }

    @Override
    public Object getValue(FedResultSetInterface resultSet)
            throws FedException
    {
        int index = getIndexByName(resultSet);
        if(index == -1)
            throw new FedException(new Exception("Field not Found"));
        try
        {
            int type = resultSet.getColumnType(index);
            if(type == 0)
            {
                // string
                return resultSet.getString(index);
            }else
            {
                return resultSet.getInt(index);
            }
        } catch (FedException ex)
        {
            Logger.getLogger(ColumnDefinition.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null)
            return false;
        if(!(obj instanceof ColumnDefinition))
            return false;
        if(((ColumnDefinition)(obj)).name.equals(this.name) && 
           ((ColumnDefinition)(obj)).tableName.equals(this.tableName))
            return true;
        return false;
    }

    @Override
    public String toWhereString() {
        return tableName + "." + name;
    }
}
