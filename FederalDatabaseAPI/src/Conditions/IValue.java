/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conditions;

import FederalDB.FedException;
import FederalDB.FedResultSetInterface;
import ResultSetManagment.FedResultSetExtendedInterface;

/**
 *
 * @author Tobias Habermann
 */
public interface IValue
{

    Object getValue(FedResultSetExtendedInterface resultSet)
            throws FedException;

    String toWhereString();
}
