/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ResultSetManagment.Aggregation;

import MetaData.ColumnDefinition;
import ResultSetManagment.FedResultSet;
import ResultSetManagment.FedResultSetExtendedInterface;
import java.util.List;

/**
 *
 * @author Admin
 */
public class SumAggregate extends Aggregation
{
    public SumAggregate(String name, String tableName)
    {
        super(name, tableName);
    }

    @Override
    public int aggregate(FedResultSetExtendedInterface rs)
            throws Exception
    {
        int columnIndex = FedResultSet.getIndexOfColumn(rs, this);
        int sum = 0;
        if(rs.first())
        {
            do
            {
                sum += rs.getInt(columnIndex);
            }while(rs.next());
        }
        return sum;
    }

    @Override
    public int aggregate(FedResultSetExtendedInterface rs, List<Integer> indices) throws Exception
    {
        int columnIndex = FedResultSet.getIndexOfColumn(rs, this);
        int sum = 0;
        if(!indices.isEmpty())
        {
            for(Integer i : indices)
            {
                rs.setCursorPosition(i);
                sum += rs.getInt(columnIndex);
            }
        }
        return sum; 
    }
}
