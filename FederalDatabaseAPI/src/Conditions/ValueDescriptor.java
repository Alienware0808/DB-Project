/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conditions;

import ResultSetManagment.FedResultSet;

/**
 *
 * @author Tobias Habermann
 */
public abstract class ValueDescriptor {
    // TODO Change the type of row to the correct one...
    public abstract Object getValue(FedResultSet resultSet);
}
