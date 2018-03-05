/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conditions;

import FederalDB.FedException;
import MetaData.ColumnDefinition;
import ResultSetManagment.FedResultSetExtendedInterface;
import java.util.ArrayList;
import java.util.List;

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

    @Override
    public List<Integer> execute(FedResultSetExtendedInterface resultSet) throws FedException {
        ArrayList<Integer> matches = new ArrayList<Integer>();
        List<Integer> left = leftCondition.execute(resultSet);
        List<Integer> right = rightCondition.execute(resultSet);
        switch(type)
        {
            case AND:
            {
                int lastMatchIndex = 0;
                for(Integer lval: left)
                {
                    for(int i = lastMatchIndex; i < right.size(); i++)
                    {
                        if(lval.equals(right.get(i)))
                        {
                            lastMatchIndex = i + 1;
                            matches.add(lval);
                            break;
                        }
                        if(lval > right.get(i))
                            break;
                    }
                }
            }break;
            case OR:
            {
                int i = 0, j = 0;
                int lastValue = -1;
                while(i < left.size() && j < right.size())
                {
                    if(left.get(i) > right.get(j))
                    {
                        if(lastValue != left.get(i))
                        {
                            lastValue = right.get(j);
                            matches.add(lastValue);
                        }
                        j++;
                    }
                    else
                    {
                        if(lastValue != left.get(i))
                        {
                            lastValue = left.get(i);
                            matches.add(lastValue);
                        }
                        i++;
                    }
                }
            }break;
        }
        return matches;
    }

    @Override
    public List<ColumnDefinition> getRequiredColumns() {
        List<ColumnDefinition> result = new ArrayList<>();
        result.addAll(leftCondition.getRequiredColumns());
        result.addAll(rightCondition.getRequiredColumns());
        return result;
    }

    @Override
    public String toWhereString() {
        return "(" + leftCondition.toWhereString() + ") " + 
                (type == JunctionType.AND? "AND": "OR") +
                "(" + rightCondition.toWhereString() + ") ";
    }
    
    public enum JunctionType
    {
        OR, AND
    }
}
