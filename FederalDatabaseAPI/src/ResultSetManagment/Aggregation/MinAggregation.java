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
public class MinAggregation extends Aggregation
{
    public MinAggregation(String name, String tableName)
    {
        super(name, tableName);
    }

    @Override
    public int aggregate(FedResultSetExtendedInterface rs)
            throws Exception
    {
        int columnIndex = FedResultSet.getIndexOfColumn(rs, this);
        int min = 0;
        if(rs.first())
        {
            min = rs.getInt(columnIndex);
            do
            {
                if(rs.getInt(columnIndex) < min)
                    min = rs.getInt(columnIndex);
            }while(rs.next());
        }
        return min;
    }

    @Override
    public int aggregate(FedResultSetExtendedInterface rs, List<Integer> indices) throws Exception
    {
        int columnIndex = FedResultSet.getIndexOfColumn(rs, this);
        int min = 0;
        if(!indices.isEmpty())
        {
            rs.setCursorPosition(indices.get(0));
            min = rs.getInt(columnIndex);
            for(Integer i : indices)
            {
                rs.setCursorPosition(i);
                if(rs.getInt(columnIndex) < min)
                    min = rs.getInt(columnIndex);
            }
        }
        return min; 
    }
}
