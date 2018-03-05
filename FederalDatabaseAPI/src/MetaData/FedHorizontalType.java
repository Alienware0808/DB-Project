/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MetaData;

import java.util.ArrayList;
import java.util.List;
import parser.AnalysedStatements.CreateStatement;

/**
 *
 * @author Admin
 */
public class FedHorizontalType extends FedType
{

    public CreateStatement.CreateColumnDefinition Column;
    public List<Object> PartationValues;

    public FedHorizontalType(CreateStatement.CreateColumnDefinition Column, List<Object> PartationValues)
    {
        this.Column = Column;
        this.PartationValues = PartationValues;
    }

    @Override
    public int getDatabaseCount()
    {
        return PartationValues.size() + 1;
    }
    
    /**
     * Gets the correct Database-Index for the given Value of the Horizontal-Column
     * @param value
     * @return 
     */
    public int getIndexForValue(Object value)
    {
        if(Column.getType() == String.class)
        {
            if(PartationValues.size() == 1)
            {
                // Is it in the Left Intervall??
                if(((String)PartationValues.get(0)).compareTo((String)value) > 0)
                    return 0; // Then choose the first table
                return 1; // if in the Right one choose the secound
            }
            else
            {
                // Is it in the Left Intervall??
                if(((String)PartationValues.get(0)).compareTo((String)value) > 0)
                    return 0; // Then choose the first table
                // Is it in the middle Intervall??
                else if(((String)PartationValues.get(1)).compareTo((String)value) > 0)
                    return 1; // Choose the secound table
                return 2; // Choose the third if nothing else matches
            }
        }
        else
        {
            if(PartationValues.size() == 1)
            {
                // Is it in the Left Intervall??
                if((int)PartationValues.get(0) > (int)value)
                    return 0; // Then choose the first table
                return 1; // if in the Right one choose the secound
            }
            else
            {
                // Is it in the Left Intervall??
                if((int)PartationValues.get(0) > (int)value)
                    return 0; // Then choose the first table
                // Is it in the middle Intervall??
                else if((int)PartationValues.get(1) > (int)value)
                    return 1; // Choose the secound table
                return 2; // Choose the third if nothing else matches
            }
        }
    }
}
