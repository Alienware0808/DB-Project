/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conditions;

import ResultSetManagment.FedResultSet;
import parser.AnalysedStatements.CreateStatement.ColumnDefinition;

/**
 *
 * @author Tobias Habermann
 */
public class ColumnDefinitionDescriptor extends ValueDescriptor {

    private ColumnDefinition columndef;
    
    public ColumnDefinitionDescriptor(ColumnDefinition columndef) {
        this.columndef = columndef;
    }

    public ColumnDefinition getColumn() {
        return columndef;
    }

    @Override
    public Object getValue(FedResultSet resultSet) {
        // TODO Get Value via ColumnName and TableName of a field
        return null;
    }
}