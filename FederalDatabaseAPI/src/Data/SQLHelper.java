/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Conditions.Condition;
import FederalDB.FedException;
import FederalDB.FedResultSetInterface;
import MetaData.ColumnDefinition;
import MetaData.ColumnValue;
import ResultSetManagment.FedResultSet;
import ResultSetManagment.FedResultSetExtendedInterface;
import java.sql.Array;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import parser.AnalysedStatements.CreateColumnDefinition;
import parser.AnalysedStatements.CreateStatement;

/**
 *
 * @author Admin
 */
public final class SQLHelper
{

    static TreeMap<String, List<PreparedStatement>> preparedStatements
            = new TreeMap<String, List<PreparedStatement>>();

    /**
     * Selects from the Connection the given fields from the given Tables
     *
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
        if (table == null || table.isEmpty())
        {
            throw new NullPointerException("Table name cannot be null or an empty String");
        }
        if (columns == null || columns.isEmpty())
        {
            throw new NullPointerException("columns cannot be null or empty");
        }
        if (connection == null || connection.isClosed())
        {
            throw new NullPointerException("connection cannot be null or closed");
        }
        String select_sql = "select ";
        select_sql += SQString.columnList(columns);
        select_sql += " from " + table.toLowerCase().trim();
        PreparedStatement prepStat = getPrepStatement(connection, select_sql);
        return prepStat.executeQuery();
    }
    
    /**
     * Selects from the Connection the given fields from the given Tables
     *
     * @param connection The Database Connection to use
     * @param columns The Columns which have to be selected
     * @param table Select from this table
     * @param where
     * @return The Results as a FedResultSet
     * @throws java.sql.SQLException
     */
    public static ResultSet select(
            Connection connection, List<ColumnDefinition> columns,
            String table, List<ColumnValue> where_equals) throws SQLException
    {
        if (table == null || table.isEmpty())
            throw new NullPointerException("Table name cannot be null or an empty String");
        if (columns == null || columns.isEmpty())
            throw new NullPointerException("columns cannot be null or empty");
        if (connection == null || connection.isClosed())
            throw new NullPointerException("connection cannot be null or closed");
        if (where_equals == null)
            where_equals = new ArrayList<>();
        String select_sql = "select ";
        select_sql += SQString.columnList(columns);
        select_sql += " from " + table.toLowerCase().trim();
        if(!where_equals.isEmpty())
        {
            select_sql += " where " + where_equals.get(0).name + " = ?";
            for(int i = 1; i < where_equals.size(); i++)
                select_sql += " and " + where_equals.get(i).name + " = ?";
        }
        PreparedStatement prepStat = getPrepStatement(connection, select_sql);
        if(!where_equals.isEmpty())
        {
            for(int i = 0; i < where_equals.size(); i++)
                prepStat.setObject(i+1, where_equals.get(i).value);
        }
        return prepStat.executeQuery();
    }
    
    /*private void setObject(int index, Object value, PreparedStatement prepstmt) throws SQLException
    {
        if(value instanceof String)
            prepstmt.setString(index, (String)value);
        else prepstmt.setInt(index, (int)value);
    }*/

    /**
     * Selects from the Connection the given fields from the given Tables
     *
     * @param connection The Database Connection to use
     * @param columns The Columns which have to be selected
     * @param table Select from this table
     * @param where
     * @return The Results as a FedResultSet
     * @throws java.sql.SQLException
     */
    public static ResultSet select(
            Connection connection, List<ColumnDefinition> columns,
            String table, Condition where) throws SQLException
    {
        if (table == null || table.isEmpty())
        {
            throw new NullPointerException("Table name cannot be null or an empty String");
        }
        if (columns == null || columns.isEmpty())
        {
            throw new NullPointerException("columns cannot be null or empty");
        }
        if (connection == null || connection.isClosed())
        {
            throw new NullPointerException("connection cannot be null or closed");
        }
        String select_sql = "select ";
        select_sql += SQString.columnList(columns);
        select_sql += " from " + table.toLowerCase().trim();
        select_sql += " where " + where.toWhereString();
        PreparedStatement prepStat = getPrepStatement(connection, select_sql);
        return prepStat.executeQuery();
    }

    /**
     * Selects from the Connection the given fields from the given Tables
     *
     * @param connection The Database Connection to use
     * @param column1 The Columns which have to be selected
     * @param table Select from this table
     * @return The Results as a FedResultSet
     * @throws java.sql.SQLException
     */
    public static ResultSet select(
            Connection connection, String column1,
            String table) throws SQLException
    {
        List<ColumnDefinition> columns = new ArrayList<>();
        columns.add(new ColumnDefinition(column1, table));
        return select(connection, columns, table);
    }
    
        /**
     * Selects from the Connection the given fields from the given Tables
     *
     * @param connection The Database Connection to use
     * @param column1 The Columns which have to be selected
     * @param table Select from this table
     * @return The Results as a FedResultSet
     * @throws java.sql.SQLException
     */
    public static ResultSet select(
            Connection connection, String column1,
            String table, Condition where) throws SQLException
    {
        List<ColumnDefinition> columns = new ArrayList<>();
        columns.add(new ColumnDefinition(column1, table));
        return select(connection, columns, table, where);
    }

    /**
     * Selects from the Connection the given fields from the given Tables
     *
     * @param connection The Database Connection to use
     * @param column1 The Columns which have to be selected
     * @param column2 The Columns which have to be selected
     * @param table Select from this table
     * @return The Results as a FedResultSet
     * @throws java.sql.SQLException
     */
    public static ResultSet select(
            Connection connection, String column1, String column2,
            String table) throws SQLException
    {
        List<ColumnDefinition> columns = new ArrayList<>();
        columns.add(new ColumnDefinition(column1, table));
        columns.add(new ColumnDefinition(column2, table));
        return select(connection, columns, table);
    }

    /**
     * Selects from the Connection the given fields from the given Tables
     *
     * @param connection The Database Connection to use
     * @param column1 The Columns which have to be selected
     * @param column2 The Columns which have to be selected
     * @param column3 The Columns which have to be selected
     * @param table Select from this table
     * @return The Results as a FedResultSet
     * @throws java.sql.SQLException
     */
    public static ResultSet select(
            Connection connection, String column1, String column2, String column3,
            String table) throws SQLException
    {
        List<ColumnDefinition> columns = new ArrayList<>();
        columns.add(new ColumnDefinition(column1, table));
        columns.add(new ColumnDefinition(column2, table));
        columns.add(new ColumnDefinition(column3, table));
        return select(connection, columns, table);
    }

    /**
     * Tries to Select from the Connection the given fields from the given
     * Tables If it fails it returns null. All Errors are discarded
     *
     * @param connection The Database Connection to use
     * @param column1 The Columns which have to be selected
     * @param table Select from this table
     * @return null if something goes wrong or the Results as a FedResultSet
     */
    public static ResultSet trySelect(
            Connection connection, String column1,
            String table)
    {
        List<ColumnDefinition> coldefs = new ArrayList<>();
        coldefs.add(new ColumnDefinition(column1.toLowerCase().trim(), table.toLowerCase().trim()));
        try
        {
            return select(connection, coldefs, table);
        } catch (Exception ex)
        {
        }
        return null;
    }

    /**
     * Tries to Select from the Connection the given fields from the given
     * Tables If it fails it returns null. All Errors are discarded
     *
     * @param connection The Database Connection to use
     * @param column1 The Columns which have to be selected
     * @param column2 The Columns which have to be selected
     * @param table Select from this table
     * @return null if something goes wrong or the Results as a FedResultSet
     */
    public static ResultSet trySelect(
            Connection connection, String column1, String column2,
            String table)
    {
        List<ColumnDefinition> coldefs = new ArrayList<>();
        coldefs.add(new ColumnDefinition(column1.toLowerCase().trim(), table.toLowerCase().trim()));
        coldefs.add(new ColumnDefinition(column2.toLowerCase().trim(), table.toLowerCase().trim()));
        try
        {
            return select(connection, coldefs, table);
        } catch (Exception ex)
        {
        }
        return null;
    }

    /**
     * Tries to Select from the Connection the given fields from the given
     * Tables If it fails it returns null. All Errors are discarded
     *
     * @param connection The Database Connection to use
     * @param column1 The Columns which have to be selected
     * @param column2 The Columns which have to be selected
     * @param column3 The Columns which have to be selected
     * @param table Select from this table
     * @return null if something goes wrong or the Results as a FedResultSet
     */
    public static ResultSet trySelect(
            Connection connection, String column1, String column2, String column3,
            String table)
    {
        List<ColumnDefinition> coldefs = new ArrayList<>();
        coldefs.add(new ColumnDefinition(column1.toLowerCase().trim(), table.toLowerCase().trim()));
        coldefs.add(new ColumnDefinition(column2.toLowerCase().trim(), table.toLowerCase().trim()));
        coldefs.add(new ColumnDefinition(column3.toLowerCase().trim(), table.toLowerCase().trim()));
        try
        {
            return select(connection, coldefs, table);
        } catch (Exception ex)
        {
        }
        return null;
    }

    /**
     * Tries to Select all Columns from the given Table from the given
     * Connection If it fails it returns null. All Errors are discarded
     *
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
        } catch (Exception ex)
        {
        }
        return null;
    }

    /**
     * Selects all Columns from the given Table from the given Connection
     *
     * @param connection The Database Connection to use
     * @param table Select from this table
     * @return
     * @throws SQLException
     */
    public static ResultSet selectAll(Connection connection, String table) throws SQLException
    {
        if (table == null || table.isEmpty())
        {
            throw new NullPointerException("Table name cannot be null or an empty String");
        }
        if (connection == null || connection.isClosed())
        {
            throw new NullPointerException("connection cannot be null or closed");
        }
        String select_sql = "select * from " + table.toLowerCase().trim();
        PreparedStatement prepStat = getPrepStatement(connection, select_sql);
        return prepStat.executeQuery();
    }

    /**
     * Selects all Columns from the given Table from the given Connection
     *
     * @param connection The Database Connection to use
     * @param table Select from this table
     * @return
     * @throws SQLException
     */
    public static ResultSet selectAll(Connection connection, String table,
            String where) throws SQLException
    {
        if (table == null || table.isEmpty())
        {
            throw new NullPointerException("Table name cannot be null or an empty String");
        }
        if (connection == null || connection.isClosed())
        {
            throw new NullPointerException("connection cannot be null or closed");
        }
        String select_sql = "select * from " + table.toLowerCase().trim();
        if(where != null)
            select_sql += " where " + where.trim();
        PreparedStatement prepStat = getPrepStatement(connection, select_sql);
        return prepStat.executeQuery();
    }

    /**
     * Drops the given Table from the Database If it fails it returns false
     * otherwise true. All Errors are discarded
     *
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
        } catch (Exception ex)
        {
        }
        return false;
    }

    /**
     * Drops the given Table from the Database
     *
     * @param connection
     * @param table
     * @throws SQLException
     */
    public static void dropTable(Connection connection, String table) throws SQLException
    {
        if (table == null || table.isEmpty())
        {
            throw new NullPointerException("Table name cannot be null or an empty String");
        }
        if (connection == null || connection.isClosed())
        {
            throw new NullPointerException("connection cannot be null or closed");
        }
        String drop_sql = "drop table " + table.toLowerCase().trim();
        PreparedStatement prepStat = getPrepStatement(connection, drop_sql);
        prepStat.executeUpdate();
    }

    /**
     * Creates the Table on the given Connection with the given table-name and
     * columns If it fails it returns false otherwise true. All Errors are
     * discarded
     *
     * @param connection The connection to use
     * @param table The table to create
     * @param columns The Columns of the table
     * @return true if the create succeeded. false it not
     */
    public static boolean tryCreateTable(Connection connection, String table,
            List<CreateColumnDefinition> columns)
    {
        try
        {
            createTable(connection, table, columns);
            return true;
        } catch (Exception ex)
        {
        }
        return false;
    }

    /**
     * Creates the Table on the given Connection with the given table-name and
     * columns
     *
     * @param connection The connection to use
     * @param table The table to create
     * @param columns The Columns of the table
     * @throws SQLException
     */
    public static void createTable(Connection connection, String table,
            List<CreateColumnDefinition> columns) throws SQLException
    {
        if (table == null || table.isEmpty())
        {
            throw new NullPointerException("Table name cannot be null or an empty String");
        }
        if (connection == null || connection.isClosed())
        {
            throw new NullPointerException("connection cannot be null or closed");
        }
        String create_sql = "create table " + table.toLowerCase().trim();
        create_sql += " " + SQString.columnDefinitionList(columns);
        PreparedStatement prepStat = getPrepStatement(connection, create_sql);
        prepStat.executeUpdate();
    }
    
    public static int insert(Connection connection, String table, 
            List<ColumnValue> values) 
            throws SQLException, FedException
    {
        if (table == null || table.isEmpty())
            throw new NullPointerException("Table name cannot be null or an empty String");
        if (connection == null || connection.isClosed())
            throw new NullPointerException("connection cannot be null or closed");
        if (values == null || values.isEmpty())
            throw new NullPointerException("No Values given");
        String insert = "insert into " + table + " (" + values.get(0).name;
        for(int i = 1; i < values.size(); i++)
            insert += ","+values.get(i).name;
        insert +=  ") values (?";
        for(int i = 1; i < values.size(); i++)
            insert += ",?";
        insert += ")";
        PreparedStatement prepStat = getPrepStatement(connection, insert);
        for(int i = 0; i < values.size(); i++)
                prepStat.setObject(i+1, values.get(i).value);
        return prepStat.executeUpdate();
    }
    
    public static int insert(Connection connection, String table, 
            FedResultSetExtendedInterface asUpdatedRows) 
            throws SQLException, FedException
    {
        if (table == null || table.isEmpty())
            throw new NullPointerException("Table name cannot be null or an empty String");
        if (connection == null || connection.isClosed())
            throw new NullPointerException("connection cannot be null or closed");
        if (asUpdatedRows == null || asUpdatedRows.getRowCount() == 0)
            throw new NullPointerException("No Values given");
        String insert = "insert into " + table + " (" + asUpdatedRows.getColumnName(1);
        for(int i = 2; i <= asUpdatedRows.getColumnCount(); i++)
            insert += ","+asUpdatedRows.getColumnName(i);
        insert +=  ") values (?";
        for(int i = 1; i < asUpdatedRows.getColumnCount(); i++)
            insert += ",?";
        insert += ")";
        PreparedStatement prepStat = getPrepStatement(connection, insert);
        do
        {
            for(int i = 0; i < asUpdatedRows.getColumnCount(); i++)
                if(asUpdatedRows.getColumnType(i) == Types.VARCHAR)
                    prepStat.setString(i+1, asUpdatedRows.getString(i));
                else if(asUpdatedRows.getInteger(i) == null)
                    prepStat.setNull(i+1, java.sql.Types.INTEGER);
                else prepStat.setInt(i+1, asUpdatedRows.getInt(i));
            prepStat.addBatch();
        } while(asUpdatedRows.next());
        prepStat.executeBatch();
        return asUpdatedRows.getRowCount();
    }
    
    public static int updateWhere(Connection connection, String table, 
            ColumnValue columnValue, Conditions.Condition where) throws SQLException
    {
        if (table == null || table.isEmpty())
            throw new NullPointerException("Table name cannot be null or an empty String");
        if (connection == null || connection.isClosed())
            throw new NullPointerException("connection cannot be null or closed");
        if (columnValue == null)
            throw new NullPointerException("No Values given");
        String update = "update " + table + " set " + columnValue.name + " = ?";
        if(where != null)
            update += " where " + where.toWhereString();
        PreparedStatement prepStat = getPrepStatement(connection, update);
        prepStat.setObject(1, columnValue.value);
        return prepStat.executeUpdate();
    }
    
    public static int deleteWhere(Connection connection, String table,
            Conditions.Condition where) throws SQLException
    {
        if (table == null || table.isEmpty())
            throw new NullPointerException("Table name cannot be null or an empty String");
        if (connection == null || connection.isClosed())
            throw new NullPointerException("connection cannot be null or closed");
        String update = "delete from " + table;
        if(where != null)
            update += " where " + where.toWhereString();
        PreparedStatement prepStat = getPrepStatement(connection, update);
        return prepStat.executeUpdate();
    }
    
    public static int updateSelection(Connection connection, String table, 
            ColumnValue columnValue, FedResultSetExtendedInterface selection) 
            throws SQLException, FedException
    {
        if (table == null || table.isEmpty())
            throw new NullPointerException("Table name cannot be null or an empty String");
        if (connection == null || connection.isClosed())
            throw new NullPointerException("connection cannot be null or closed");
        if (columnValue == null)
            throw new NullPointerException("No Values given");
        if (selection == null)
            throw new NullPointerException("No Values given");
        if(selection.getRowCount() > 0)
        {
            String update = "update " + table + " set " + columnValue.name + " = ?";
            update += " where " + selection.getColumnName(0) + " in (?)";
            Array array;
            if(selection.getColumnType(0) == Types.VARCHAR)
                array = connection.createArrayOf("VARCHAR", FedResultSet.columnToArray(selection, 0));
            else array = connection.createArrayOf("INT", FedResultSet.columnToArray(selection, 0));
            PreparedStatement prepStat = getPrepStatement(connection, update);
            prepStat.setObject(1, columnValue.value);
            prepStat.setArray(2, array);
            return prepStat.executeUpdate();
        }
        return 0;
    }
    
    public static int deleteSelection(Connection connection, String table, 
            FedResultSetExtendedInterface selection) 
            throws SQLException, FedException
    {
        if (table == null || table.isEmpty())
            throw new NullPointerException("Table name cannot be null or an empty String");
        if (connection == null || connection.isClosed())
            throw new NullPointerException("connection cannot be null or closed");
        if (selection == null)
            throw new NullPointerException("No Values given");
        if(selection.getRowCount() > 0)
        {
            String delete = "delete from " + table;
            delete += " where " + selection.getColumnName(0) + " in (?)";
            Array array;
            if(selection.getColumnType(0) == Types.VARCHAR)
                array = connection.createArrayOf("VARCHAR", FedResultSet.columnToArray(selection, 0));
            else array = connection.createArrayOf("INT", FedResultSet.columnToArray(selection, 0));
            PreparedStatement prepStat = getPrepStatement(connection, delete);
            prepStat.setArray(1, array);
            return prepStat.executeUpdate();
        }
        return 0;
    }

    /**
     * Returns a PreparedStatement that is now cached or already was cached
     * before.
     *
     * @param connection
     * @param sql
     * @return
     * @throws SQLException
     */
    public static PreparedStatement getStatement(Connection connection, String sql) throws SQLException
    {
        if (sql == null || sql.isEmpty())
        {
            throw new NullPointerException("sql cannot be null or an empty String");
        }
        if (connection == null || connection.isClosed())
        {
            throw new NullPointerException("connection cannot be null or closed");
        }
        return getPrepStatement(connection, sql);
    }

    private static PreparedStatement getPrepStatement(Connection connection, String sql) throws SQLException
    {
        List<PreparedStatement> preps = preparedStatements.get(sql);
        if (preps != null)
        {
            for (PreparedStatement prepStat : preps)
            {
                try
                {
                    if (prepStat.getConnection() == connection)
                    {
                        return prepStat;
                    }
                } catch (SQLException ex)
                {
                }
            }
        }
        PreparedStatement prepStat = connection.prepareStatement(sql,
                ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        if (preps != null)
        {
            preps.add(prepStat);
        } else
        {
            preps = new ArrayList<>();
            preps.add(prepStat);
            preparedStatements.put(sql, preps);
        }
        return prepStat;
    }
}
