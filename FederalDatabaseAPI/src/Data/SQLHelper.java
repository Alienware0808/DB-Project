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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import parser.AnalysedStatements.CreateStatement;

/**
 *
 * @author Admin
 */
public final class SQLHelper {
    
    static TreeMap<String, List<PreparedStatement>> preparedStatements = 
            new TreeMap<String, List<PreparedStatement>>();
    
    /**
     * Selects from the Connection the given fields from the given Tables
     * @param connection The Database Connection to use
     * @param columns The Columns which have to be selected
     * @param table Select from this table
     * @return The Results as a FedResultSet
     * @throws java.sql.SQLException 
     */
    public static ResultSet select(
            Connection connection, List<ColumnDefinition> columns, 
            String table) throws SQLException
    {
        if(table == null || table.isEmpty())
            throw new NullPointerException("Table name cannot be null or an empty String");
        if(columns == null || columns.isEmpty())
            throw new NullPointerException("columns cannot be null or empty");
        if(connection == null || connection.isClosed())
            throw new NullPointerException("connection cannot be null or closed");
        String select_sql = "select ";
        select_sql += SQString.columnList(columns);
        select_sql += " from " + table.toLowerCase().trim();
        PreparedStatement prepStat = getPrepStatement(connection, select_sql);
        return prepStat.executeQuery();
    }
    
    /**
     * Tries to Select from the Connection the given fields from the given Tables
     * If it fails it returns null. All Errors are discarded
     * @param connection The Database Connection to use
     * @param columns The Columns which have to be selected
     * @param table Select from this table
     * @return null if something goes wrong or the Results as a FedResultSet
     */
    public static ResultSet trySelect(
            Connection connection, List<ColumnDefinition> columns, 
            String table)
    {
        try
        {
            return select(connection, columns, table);
        } catch (Exception ex) {}
        return null;
    }
    
        
    /**
     * Tries to Select all Columns from the given Table from the given Connection
     * If it fails it returns null. All Errors are discarded
     * @param connection The Database Connection to use
     * @param table Select from this table
     * @return null if something goes wrong or the Results as a FedResultSet
     */
    public static ResultSet trySelectAll(
            Connection connection, String table)
    {
        try
        {
            return selectAll(connection, table);
        } catch (Exception ex) {}
        return null;
    }
    
    /**
     * Selects all Columns from the given Table from the given Connection
     * @param connection The Database Connection to use
     * @param table Select from this table
     * @return
     * @throws SQLException 
     */
    public static ResultSet selectAll(Connection connection, String table) throws SQLException
    {
        if(table == null || table.isEmpty())
            throw new NullPointerException("Table name cannot be null or an empty String");
        if(connection == null || connection.isClosed())
            throw new NullPointerException("connection cannot be null or closed");
        String select_sql = "select * from " + table.toLowerCase().trim();
        PreparedStatement prepStat = getPrepStatement(connection, select_sql);
        return prepStat.executeQuery();
    }
    
    /**
     * Drops the given Table from the Database
     * If it fails it returns false otherwise true. All Errors are discarded
     * @param connection
     * @param table
     * @return true if no errors. false if an error occoured
     */
    public static boolean tryDropTable(Connection connection, String table) 
    {
        try
        {
            dropTable(connection, table);
            return true;
        } catch (Exception ex) {}
        return false;
    }
    
    /**
     * Drops the given Table from the Database
     * @param connection
     * @param table
     * @throws SQLException 
     */
    public static void dropTable(Connection connection, String table) throws SQLException
    {
        if(table == null || table.isEmpty())
            throw new NullPointerException("Table name cannot be null or an empty String");
        if(connection == null || connection.isClosed())
            throw new NullPointerException("connection cannot be null or closed");
        String drop_sql = "drop table " + table.toLowerCase().trim();
        PreparedStatement prepStat = getPrepStatement(connection, drop_sql);
        prepStat.executeUpdate();
    }
    
    /**
     * Creates the Table on the given Connection with the given table-name and columns
     * If it fails it returns false otherwise true. All Errors are discarded
     * @param connection The connection to use
     * @param table The table to create
     * @param columns The Columns of the table
     * @return true if the create succeeded. false it not
     */
    public static boolean tryCreateTable(Connection connection, String table, 
            List<CreateStatement.CreateColumnDefinition> columns) 
    {
        try
        {
            createTable(connection, table, columns);
            return true;
        } catch (Exception ex) {}
        return false;
    }
    
    
    /**
     * Creates the Table on the given Connection with the given table-name and columns
     * @param connection The connection to use
     * @param table The table to create
     * @param columns The Columns of the table
     * @throws SQLException 
     */
    public static void createTable(Connection connection, String table, 
            List<CreateStatement.CreateColumnDefinition> columns) throws SQLException
    {
        if(table == null || table.isEmpty())
            throw new NullPointerException("Table name cannot be null or an empty String");
        if(connection == null || connection.isClosed())
            throw new NullPointerException("connection cannot be null or closed");
        String create_sql = "create table " + table.toLowerCase().trim();
        create_sql += " " + SQString.columnDefinitionList(columns);
        PreparedStatement prepStat = getPrepStatement(connection, create_sql);
        prepStat.executeUpdate();
    }
    
    /**
     * Returns a PreparedStatement that is now cached or already was cached before.
     * @param connection
     * @param sql
     * @return 
     * @throws SQLException 
     */
    public static PreparedStatement getStatement(Connection connection, String sql) throws SQLException
    {
        if(sql == null || sql.isEmpty())
            throw new NullPointerException("sql cannot be null or an empty String");
        if(connection == null || connection.isClosed())
            throw new NullPointerException("connection cannot be null or closed");
        return getPrepStatement(connection, sql);
    }
    
    private static PreparedStatement getPrepStatement(Connection connection, String sql) throws SQLException
    {
        List<PreparedStatement> preps = preparedStatements.get(sql);
        for(PreparedStatement prepStat : preps)
            try {
                if(prepStat.getConnection() == connection)
                    return prepStat;
            } catch (SQLException ex) {}
        PreparedStatement prepStat = connection.prepareStatement(sql);
        if(preps != null)
            preps.add(prepStat);
        else
        {
            preps = new ArrayList<>();
            preps.add(prepStat);
            preparedStatements.put(sql, preps);
        }
        return prepStat;
    }
}
