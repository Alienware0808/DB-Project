/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MetaData;

import Conditions.IValue;
import FederalDB.FedException;
import ResultSetManagment.FedResultSet;
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
        this.name = columnName;
        this.tableName = tableName;
    }

    @Override
    public Object getValue(FedResultSet resultSet)
    {
        int index = resultSet.getIndexOfColumn(name);
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
}
