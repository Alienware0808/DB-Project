/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ResultSetManagment.Aggregation;

import MetaData.ColumnDefinition;
import ResultSetManagment.FedResultSetExtendedInterface;
import java.util.List;

/**
 *
 * @author Admin
 */
public abstract class Aggregation extends ColumnDefinition
{
    public Aggregation(String name, String tableName)
    {
        super(name, tableName);
    }
    
    public abstract int aggregate(FedResultSetExtendedInterface rs)
            throws Exception;
    
    public abstract int aggregate(FedResultSetExtendedInterface rs, List<Integer> indices)
            throws Exception;
}
