/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conditions;

import ResultSetManagment.FedResultSet;

/**
 *
 * @author Tobias Habermann
 */
public class SingleValueDescriptor extends ValueDescriptor {
    private Object value;
    
    public SingleValueDescriptor() {
    }

    public SingleValueDescriptor(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    @Override
    public Object getValue(FedResultSet resultSet) {
        return value;
    }
}
