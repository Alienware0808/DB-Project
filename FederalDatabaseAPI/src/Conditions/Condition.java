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
import java.util.List;

/**
 *
 * @author Tobias Habermann
 */
public abstract class Condition implements Serializable
{

    public abstract List<ColumnDefinition> getRequiredColumns();

    public abstract List<Integer> execute(FedResultSetExtendedInterface resultSet)
            throws FedException;
    
    public abstract List<Integer> executeIgnoreNull(FedResultSetExtendedInterface resultSet)
            throws FedException;

    public abstract String toWhereString();

    @Override
    public String toString()
    {
        return toWhereString();
    }
}
