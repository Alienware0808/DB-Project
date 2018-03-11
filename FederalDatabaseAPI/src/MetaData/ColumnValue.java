/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MetaData;

/**
 *
 * @author svwer
 */
public class ColumnValue extends ColumnDefinition  implements java.io.Serializable
{

    public Object value;

    public ColumnValue(String columnName, String tableName, Object value)
    {
        super(columnName, tableName);
        this.value = value;
    }

    @Override
    public String toString()
    {
        return super.toString() + " = " + String.valueOf(value);
    }
    
    
}
