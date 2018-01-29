/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conditions;

/**
 *
 * @author Tobias Habermann
 * @param <LEFT>
 * @param <RIGHT>
 */
public class CompareCondition<LEFT, RIGHT> extends Condition {
    public final CompareType type;
    private ValueDescriptor leftValues;
    private ValueDescriptor rightValues;

    public CompareCondition(CompareType type, ValueDescriptor leftValues, ValueDescriptor rightValues) {
        this.type = type;
        this.leftValues = leftValues;
        this.rightValues = rightValues;
    }

    public CompareCondition(CompareType type) {
        this.type = type;
    }

    public ValueDescriptor getLeftValues() {
        return leftValues;
    }

    public ValueDescriptor getRightValues() {
        return rightValues;
    }

    public void setLeftValues(ValueDescriptor leftValues) {
        this.leftValues = leftValues;
    }

    public void setRightValues(ValueDescriptor rightValues) {
        this.rightValues = rightValues;
    }
}
