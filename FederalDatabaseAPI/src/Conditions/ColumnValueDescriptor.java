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
public class ColumnValueDescriptor<TYPE> extends ValueDescriptor<TYPE> {

    // TODO Create a Descriptor for a Column in a ResultSet...
    private Object somethingToDescribeTheColumnToChooseIDK;
    
    
    public ColumnValueDescriptor(String columnNameOrAliasDontKnow) {
        // TODO what ever has to be done here ...
    }

    @Override
    public TYPE getValueFromRow(Object row) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
