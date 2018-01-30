/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conditions;

import FederalDB.FedException;
import ResultSetManagment.FedResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tobias Habermann
 */
public class ColumnValueDescriptor extends ValueDescriptor {

    // TODO Create a Descriptor for a Column in a ResultSet...
    private String columnName;
    private String tableName;
    
    public ColumnValueDescriptor(String colmunName, String tableName) {
        // TODO what ever has to be done here ...
    }

    public String getColumnName() {
        return columnName;
    }

    public String getTableName() {
        return tableName;
    }

    @Override
    public Object getValue(FedResultSet resultSet) {
        // TODO Get Value via ColumnName and TableName of a field
        Object res;
        try {
            res = resultSet.getObjectByNames(tableName, columnName);
            return res;
        } catch (FedException ex) {
            Logger.getLogger(ColumnValueDescriptor.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
