/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conditions;

import FederalDB.FedResultSetInterface;
import ResultSetManagment.FedResultSet;

/**
 *
 * @author Tobias Habermann
 */
public class SingleValueDescriptor implements IValue {
    public Object value;
    
    public SingleValueDescriptor() {
    }

    public SingleValueDescriptor(Object value) {
        this.value = value;
    }

    @Override
    public Object getValue(FedResultSetInterface resultSet) {
        return value;
    }
}
