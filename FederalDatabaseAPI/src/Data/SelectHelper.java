/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import MetaData.ColumnDefinition;
import ResultSetManagment.FedResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public final class SelectHelper {
    
    static List<PreparedStatement> preparedStatments = new ArrayList<>();
    
    /**
     * Selects from the Connection the given fields from the given Tables
     * @param connection
     * @param columns
     * @param table
     * @return 
     */
    public static FedResultSet select(Connection connection, List<ColumnDefinition> columns, String table)
    {
        String select_sql = "select ";
        for(int i = 0; i < columns.size(); i++)
        {
            select_sql += columns.get(i).name.toLowerCase();
            if(i+1 < columns.size())
                select_sql += ", ";
        }
        select_sql += " from " + table.toLowerCase();
        return null;
    }
    
    private static PreparedStatement getPrepStatement(Connection connection)
    {
        //for(PreparedStatement prepStat : preparedStatments)
         //   if(prepStat.getConnection() == i)
        return null;
    }
}
