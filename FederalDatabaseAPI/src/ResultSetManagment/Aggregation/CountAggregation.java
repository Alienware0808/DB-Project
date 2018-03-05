/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ResultSetManagment.Aggregation;

import ResultSetManagment.FedResultSet;
import ResultSetManagment.FedResultSetExtendedInterface;
import java.util.List;

/**
 *
 * @author Admin
 */
public class CountAggregation extends Aggregation
{
    public CountAggregation(String name, String tableName)
    {
        super(name, tableName);
    }

    @Override
    public int aggregate(FedResultSetExtendedInterface rs)
            throws Exception
    {
        return rs.getRowCount();
    }

    @Override
    public int aggregate(FedResultSetExtendedInterface rs, List<Integer> indices) throws Exception
    {
        return indices.size();
    }
}
