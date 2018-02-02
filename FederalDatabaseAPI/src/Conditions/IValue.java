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
public interface IValue {
    Object getValue(FedResultSet resultSet);
}
