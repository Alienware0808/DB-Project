/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conditions;

import FederalDB.FedResultSetInterface;

/**
 *
 * @author Admin
 */
public class SingleValueDescriptor implements IValue {
    public Object Value;

    public SingleValueDescriptor() {
    }

    public SingleValueDescriptor(Object Value) {
        this.Value = Value;
    }

    @Override
    public Object getValue(FedResultSetInterface resultSet) {
        return Value;
    }

    @Override
    public String toWhereString() {
        if(Value instanceof String)
            return "'"+Value.toString()+"'";
        return Value.toString();
    }
    
    
}
