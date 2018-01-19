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
public class JunctionCondition extends Condition {
    public final JunctionType type;
    private Condition leftCondition;
    private Condition rightCondition;

    public JunctionCondition(JunctionType type, Condition leftCondition, Condition rightCondition) {
        this.type = type;
        this.leftCondition = leftCondition;
        this.rightCondition = rightCondition;
    }

    public JunctionCondition(JunctionType type) {
        this.type = type;
    }

    public Condition getLeftCondition() {
        return leftCondition;
    }

    public Condition getRightCondition() {
        return rightCondition;
    }

    public JunctionType getType() {
        return type;
    }

    public void setLeftCondition(Condition leftCondition) {
        this.leftCondition = leftCondition;
    }

    public void setRightCondition(Condition rightCondition) {
        this.rightCondition = rightCondition;
    }
    
    public enum JunctionType
    {
        OR, AND
    }
}
