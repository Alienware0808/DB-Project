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
import java.util.Objects;
import javafx.collections.transformation.SortedList;

/**
 *
 * @author Tobias Habermann
 */
public class CompareCondition extends Condition implements Serializable
{

    public final CompareType type;
    private IValue leftValues;
    private IValue rightValues;

    public CompareCondition(CompareType type, IValue leftValues, IValue rightValues)
    {
        this.type = type;
        this.leftValues = leftValues;
        this.rightValues = rightValues;
    }

    public CompareCondition(CompareType type)
    {
        this.type = type;
    }

    public IValue getLeftValues()
    {
        return leftValues;
    }

    public IValue getRightValues()
    {
        return rightValues;
    }

    public void setLeftValues(IValue leftValues)
    {
        this.leftValues = leftValues;
    }

    public void setRightValues(IValue rightValues)
    {
        this.rightValues = rightValues;
    }

    @Override
    public ArrayList<Integer> execute(FedResultSetExtendedInterface resultSet)
            throws FedException
    {
        ArrayList<Integer> matches = new ArrayList<>();
        if (resultSet.first())
        {
            boolean isString = (leftValues.getValue(resultSet) instanceof String);
            switch (type)
            {
                case EQUAL:
                {
                    do
                    {
                        if (Objects.equals(leftValues.getValue(resultSet), (rightValues.getValue(resultSet))))
                        {
                            matches.add(resultSet.getCursorPosition());
                        }
                    } while (resultSet.next());
                }
                break;
                case NOT_EQUAL:
                {
                    do
                    {
                        Object left = leftValues.getValue(resultSet);
                        Object right = rightValues.getValue(resultSet);
                        if (!Objects.equals(left, right))
                        {
                            matches.add(resultSet.getCursorPosition());
                        }
                    } while (resultSet.next());
                }
                break;
                case GREATER:
                {
                    if (isString)
                    {
                        do
                        {
                            String left = (String) leftValues.getValue(resultSet);
                            String right = (String) rightValues.getValue(resultSet);
                            if (left != null && right != null)
                            {
                                if (left.compareTo(right) > 0)
                                {
                                    matches.add(resultSet.getCursorPosition());
                                }
                            }
                        } while (resultSet.next());
                    } else
                    {
                        do
                        {
                            Integer left = (Integer) leftValues.getValue(resultSet);
                            Integer right = (Integer) rightValues.getValue(resultSet);
                            if (left != null && right != null)
                            {
                                if (left > right)
                                {
                                    matches.add(resultSet.getCursorPosition());
                                }
                            }
                        } while (resultSet.next());
                    }
                }
                break;
                case LESSER:
                {
                    if (isString)
                    {
                        do
                        {
                            String left = (String) leftValues.getValue(resultSet);
                            String right = (String) rightValues.getValue(resultSet);
                            if (left != null && right != null)
                            {
                                if (left.compareTo(right) < 0)
                                {
                                    matches.add(resultSet.getCursorPosition());
                                }
                            }
                        } while (resultSet.next());
                    } else
                    {
                        do
                        {
                            Integer left = (Integer) leftValues.getValue(resultSet);
                            Integer right = (Integer) rightValues.getValue(resultSet);
                            if (left != null && right != null)
                            {
                                if (left < right)
                                {
                                    matches.add(resultSet.getCursorPosition());
                                }
                            }
                        } while (resultSet.next());
                    }
                }
                break;
                case GREATER_OR_EQUAL:
                {
                    if (isString)
                    {
                        do
                        {
                            String left = (String) leftValues.getValue(resultSet);
                            String right = (String) rightValues.getValue(resultSet);
                            if (left != null && right != null)
                            {
                                if (left.compareTo(right) >= 0)
                                {
                                    matches.add(resultSet.getCursorPosition());
                                }
                            }
                        } while (resultSet.next());
                    } else
                    {
                        do
                        {
                            Integer left = (Integer) leftValues.getValue(resultSet);
                            Integer right = (Integer) rightValues.getValue(resultSet);
                            if (left != null && right != null)
                            {
                                if (left >= right)
                                {
                                    matches.add(resultSet.getCursorPosition());
                                }
                            }
                        } while (resultSet.next());
                    }
                }
                break;
                case LESSER_OR_EQUAL:
                {
                    if (isString)
                    {
                        do
                        {
                            String left = (String) leftValues.getValue(resultSet);
                            String right = (String) rightValues.getValue(resultSet);
                            if (left != null && right != null)
                            {
                                if (left.compareTo(right) <= 0)
                                {
                                    matches.add(resultSet.getCursorPosition());
                                }
                            }
                        } while (resultSet.next());
                    } else
                    {
                        do
                        {
                            Integer left = (Integer) leftValues.getValue(resultSet);
                            Integer right = (Integer) rightValues.getValue(resultSet);
                            if (left != null && right != null)
                            {
                                if (left <= right)
                                {
                                    matches.add(resultSet.getCursorPosition());
                                }
                            }
                        } while (resultSet.next());
                    }
                }
                break;
            }
        }
        return matches;
    }

    @Override
    public List<ColumnDefinition> getRequiredColumns()
    {
        List<ColumnDefinition> result = new ArrayList<>();
        if (leftValues instanceof ColumnDefinition)
        {
            result.add((ColumnDefinition) leftValues);
        }
        if (rightValues instanceof ColumnDefinition)
        {
            result.add((ColumnDefinition) rightValues);
        }
        return result;
    }

    @Override
    public String toWhereString()
    {
        String str = leftValues.toWhereString() + " ";
        switch (type)
        {
            case EQUAL:
                str += "=";
                break;
            case NOT_EQUAL:
                str += "<>";
                break;
            case GREATER:
                str += ">";
                break;
            case LESSER:
                str += "<";
                break;
            case GREATER_OR_EQUAL:
                str += ">=";
                break;
            case LESSER_OR_EQUAL:
                str += "<=";
                break;
        }
        str += " " + rightValues.toWhereString();
        return str;
    }

    @Override
    public List<Integer> executeIgnoreNull(FedResultSetExtendedInterface resultSet) throws FedException
    {

        ArrayList<Integer> matches = new ArrayList<>();
        if (resultSet.first())
        {
            boolean isString = (leftValues.getValue(resultSet) instanceof String);
            switch (type)
            {
                case EQUAL:
                {
                    do
                    {
                        Object left = leftValues.getValue(resultSet);
                        Object right = rightValues.getValue(resultSet);
                        if (left == null || right == null || Objects.equals(left, right))
                        {
                            matches.add(resultSet.getCursorPosition());
                        }
                    } while (resultSet.next());
                }
                break;
                case NOT_EQUAL:
                {
                    do
                    {
                        Object left = leftValues.getValue(resultSet);
                        Object right = rightValues.getValue(resultSet);
                        if (left == null || right == null || !Objects.equals(left, right))
                        {
                            matches.add(resultSet.getCursorPosition());
                        }
                    } while (resultSet.next());
                }
                break;
                case GREATER:
                {
                    if (isString)
                    {
                        do
                        {
                            Object left = leftValues.getValue(resultSet);
                            Object right = rightValues.getValue(resultSet);
                            if (left == null || right == null || ((String) left).compareTo(((String) left)) > 0)
                            {
                                matches.add(resultSet.getCursorPosition());
                            }
                        } while (resultSet.next());
                    } else
                    {
                        do
                        {
                            Object left = leftValues.getValue(resultSet);
                            Object right = rightValues.getValue(resultSet);
                            if (left == null || right == null || ((Integer) left) > ((Integer) right))
                            {
                                matches.add(resultSet.getCursorPosition());
                            }
                        } while (resultSet.next());
                    }
                }
                break;
                case LESSER:
                {
                    if (isString)
                    {
                        do
                        {
                            Object left = leftValues.getValue(resultSet);
                            Object right = rightValues.getValue(resultSet);
                            if (left == null || right == null || ((String) left).compareTo((String) right) < 0)
                            {
                                matches.add(resultSet.getCursorPosition());
                            }
                        } while (resultSet.next());
                    } else
                    {
                        do
                        {
                            Object left = leftValues.getValue(resultSet);
                            Object right = rightValues.getValue(resultSet);
                            if (left == null || right == null || ((Integer) left) < (Integer) right)
                            {
                                matches.add(resultSet.getCursorPosition());
                            }
                        } while (resultSet.next());
                    }
                }
                break;
                case GREATER_OR_EQUAL:
                {
                    if (isString)
                    {
                        do
                        {
                            Object left = leftValues.getValue(resultSet);
                            Object right = rightValues.getValue(resultSet);
                            if (left == null || right == null || ((String) left).compareTo((String) right) >= 0)
                            {
                                matches.add(resultSet.getCursorPosition());
                            }
                        } while (resultSet.next());
                    } else
                    {
                        do
                        {
                            Object left = leftValues.getValue(resultSet);
                            Object right = rightValues.getValue(resultSet);
                            if (left == null || right == null || ((Integer) left) >= (Integer) right)
                            {
                                matches.add(resultSet.getCursorPosition());
                            }
                        } while (resultSet.next());
                    }
                }
                break;
                case LESSER_OR_EQUAL:
                {
                    if (isString)
                    {
                        do
                        {
                            Object left = leftValues.getValue(resultSet);
                            Object right = rightValues.getValue(resultSet);
                            if (left == null || right == null || ((String) left).compareTo((String) right) <= 0)
                            {
                                matches.add(resultSet.getCursorPosition());
                            }
                        } while (resultSet.next());
                    } else
                    {
                        do
                        {
                            Object left = leftValues.getValue(resultSet);
                            Object right = rightValues.getValue(resultSet);
                            if (left == null || right == null || ((Integer) left) <= (Integer) right)
                            {
                                matches.add(resultSet.getCursorPosition());
                            }
                        } while (resultSet.next());
                    }
                }
                break;
            }
        }
        return matches;
    }
}
