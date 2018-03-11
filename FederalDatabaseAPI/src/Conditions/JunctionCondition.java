/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conditions;

import FederalDB.FedException;
import MetaData.ColumnDefinition;
import ResultSetManagment.FedResultSetExtendedInterface;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tobias Habermann
 */
public class JunctionCondition extends Condition implements Serializable
{

    public final JunctionType type;
    private Condition leftCondition;
    private Condition rightCondition;

    public JunctionCondition(JunctionType type, Condition leftCondition, Condition rightCondition)
    {
        this.type = type;
        this.leftCondition = leftCondition;
        this.rightCondition = rightCondition;
    }

    public JunctionCondition(JunctionType type)
    {
        this.type = type;
    }

    public Condition getLeftCondition()
    {
        return leftCondition;
    }

    public Condition getRightCondition()
    {
        return rightCondition;
    }

    public JunctionType getType()
    {
        return type;
    }

    public void setLeftCondition(Condition leftCondition)
    {
        this.leftCondition = leftCondition;
    }

    public void setRightCondition(Condition rightCondition)
    {
        this.rightCondition = rightCondition;
    }
    
    private List<Integer> exec(List<Integer> left, List<Integer> right)
    {
        ArrayList<Integer> matches = new ArrayList<Integer>();
        switch (type)
        {
            case AND:
            {
                int lastMatchIndex = 0;
                for (Integer lval : left)
                {
                    if(right.contains(lval))
                        matches.add(lval);
                    /*for (int i = lastMatchIndex; i < right.size(); i++)
                    {
                        if (lval.equals(right.get(i)))
                        {
                            lastMatchIndex = i + 1;
                            matches.add(lval);
                            break;
                        }
                        if (lval > right.get(i))
                        {
                            break;
                        }
                    }*/
                }
            }
            break;
            case OR:
            {
                int i = 0, j = 0;
                int lastValue = -1;
                while (i < left.size() && j < right.size())
                {
                    if (left.get(i) > right.get(j))
                    {
                        if (lastValue != left.get(i))
                        {
                            lastValue = right.get(j);
                            matches.add(lastValue);
                        }
                        j++;
                    } else
                    {
                        if (lastValue != left.get(i))
                        {
                            lastValue = left.get(i);
                            matches.add(lastValue);
                        }
                        i++;
                    }
                }
                if(i != left.size())
                    matches.add(left.get(i));
                if(j != right.size())
                    matches.add(right.get(j));
            }
            break;
        }
        return matches;
    }

    @Override
    public List<Integer> execute(FedResultSetExtendedInterface resultSet) throws FedException
    {
        List<Integer> left = leftCondition.execute(resultSet);
        List<Integer> right = rightCondition.execute(resultSet);
        return exec(left, right);
    }

    @Override
    public List<ColumnDefinition> getRequiredColumns()
    {
        List<ColumnDefinition> result = new ArrayList<>();
        result.addAll(leftCondition.getRequiredColumns());
        result.addAll(rightCondition.getRequiredColumns());
        return result;
    }

    @Override
    public String toWhereString()
    {
        return "(" + leftCondition.toWhereString() + ") "
                + (type == JunctionType.AND ? "AND" : "OR")
                + "(" + rightCondition.toWhereString() + ") ";
    }

    @Override
    public List<Integer> executeIgnoreNull(FedResultSetExtendedInterface resultSet) throws FedException
    {
        List<Integer> left = leftCondition.executeIgnoreNull(resultSet);
        List<Integer> right = rightCondition.executeIgnoreNull(resultSet);
        return exec(left, right);
    }

    public enum JunctionType
    {
        OR, AND
    }
}
