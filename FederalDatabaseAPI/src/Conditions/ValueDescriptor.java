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
public abstract class ValueDescriptor<TYPE> {
    // TODO Change the type of row to the correct one...
    public abstract TYPE getValueFromRow(Object row);
}
