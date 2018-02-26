/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conditions;

import FederalDB.FedException;
import ResultSetManagment.FedResultSet;
import ResultSetManagment.FedResultSetExtendedInterface;
import java.util.ArrayList;
import javafx.collections.transformation.SortedList;

/**
 *
 * @author Tobias Habermann
 */
public class CompareCondition extends Condition {
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

    @Override
    public ArrayList<Integer> execute(FedResultSetExtendedInterface resultSet) 
            throws FedException
    {
        resultSet.first();
        ArrayList<Integer> matches = new ArrayList<>();
        boolean isString = (leftValues.getValue(resultSet) instanceof String);
        switch(type)
        {
            case EQUAL:{
                do
                    if(leftValues.getValue(resultSet).equals(rightValues.getValue(resultSet)))
                        matches.add(resultSet.getCursorPosition());
                while(resultSet.next());
            }
            break;
            case NOT_EQUAL:
            {
                do
                    if(!leftValues.getValue(resultSet).equals(rightValues.getValue(resultSet)))
                        matches.add(resultSet.getCursorPosition());
                while(resultSet.next());
            }
            break;
            case GREATER:
            {
                if(isString)
                    do
                    if(((String)leftValues.getValue(resultSet)).compareTo((String)rightValues.getValue(resultSet)) > 0)
                        matches.add(resultSet.getCursorPosition());
                    while(resultSet.next());
                else
                    do
                    if(((int)leftValues.getValue(resultSet)) > ((int)rightValues.getValue(resultSet)))
                        matches.add(resultSet.getCursorPosition());
                    while(resultSet.next());
            }
            break;
            case LESSER:
            {
                if(isString)
                    do
                    if(((String)leftValues.getValue(resultSet)).compareTo((String)rightValues.getValue(resultSet)) < 0)
                        matches.add(resultSet.getCursorPosition());
                    while(resultSet.next());
                else
                    do
                    if(((int)leftValues.getValue(resultSet)) < ((int)rightValues.getValue(resultSet)))
                        matches.add(resultSet.getCursorPosition());
                    while(resultSet.next());
            }
            break;
            case GREATER_OR_EQUAL:
            {
                if(isString)
                    do
                    if(((String)leftValues.getValue(resultSet)).compareTo((String)rightValues.getValue(resultSet)) >= 0)
                        matches.add(resultSet.getCursorPosition());
                    while(resultSet.next());
                else
                    do
                    if(((int)leftValues.getValue(resultSet)) >= ((int)rightValues.getValue(resultSet)))
                        matches.add(resultSet.getCursorPosition());
                    while(resultSet.next());
            }
            break;
            case LESSER_OR_EQUAL:
            {
                if(isString)
                    do
                    if(((String)leftValues.getValue(resultSet)).compareTo((String)rightValues.getValue(resultSet)) <= 0)
                        matches.add(resultSet.getCursorPosition());
                    while(resultSet.next());
                else
                    do
                    if(((int)leftValues.getValue(resultSet)) <= ((int)rightValues.getValue(resultSet)))
                        matches.add(resultSet.getCursorPosition());
                    while(resultSet.next());
            }
            break;
        }
        return matches;
    }
}
