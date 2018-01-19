/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conditions;

/**
 *
 * @author Tobias Habermann
 */
public class SingleValueDescriptor<TYPE> extends ValueDescriptor<TYPE> {
    private TYPE value;
    
    public SingleValueDescriptor() {
    }

    public SingleValueDescriptor(TYPE value) {
        this.value = value;
    }
    
    @Override
    public TYPE getValueFromRow(Object row) {
        return value;
    }

    public TYPE getValue() {
        return value;
    }

    public void setValue(TYPE value) {
        this.value = value;
    }
}
