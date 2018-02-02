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
    private IValue leftValues;
    private IValue rightValues;

    public CompareCondition(CompareType type, IValue leftValues, IValue rightValues) {
        this.type = type;
        this.leftValues = leftValues;
        this.rightValues = rightValues;
    }

    public CompareCondition(CompareType type) {
        this.type = type;
    }

    public IValue getLeftValues() {
        return leftValues;
    }

    public IValue getRightValues() {
        return rightValues;
    }

    public void setLeftValues(IValue leftValues) {
        this.leftValues = leftValues;
    }

    public void setRightValues(IValue rightValues) {
        this.rightValues = rightValues;
    }
}
