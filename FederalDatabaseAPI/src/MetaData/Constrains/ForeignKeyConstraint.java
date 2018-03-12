/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MetaData.Constrains;

import Conditions.Condition;
import Data.FedConnectionFactory;
import Data.FedHelper;
import Data.SQLHelper;
import MetaData.Constrains.Constraint;
import FederalDB.FedConnection;
import FederalDB.FedException;
import FederalDB.FedStatement;
import MetaData.ColumnDefinition;
import MetaData.ColumnValue;
import MetaData.FedHorizontalType;
import MetaData.FedVerticalType;
import MetaData.MetaDataEntry;
import ResultSetManagment.FedResultSetExtendedInterface;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import parser.AnalysedStatements.CreateStatement;

/**
 *
 * @author Franz Weidmann
 */
public class ForeignKeyConstraint extends Constraint implements java.io.Serializable
{

    private ColumnDefinition forColumn;
    private ColumnDefinition foreignColumn;

    public ForeignKeyConstraint(ColumnDefinition forColumn, ColumnDefinition foreignColumn)
    {
        this.forColumn = forColumn;
        this.foreignColumn = foreignColumn;
    }

    @Override
    public boolean checkInsert(FedConnection fedConnection, List<ColumnValue> values)
    {
        MetaDataEntry entry = fedConnection.metaDataManger.getTableMetaData(foreignColumn.tableName);
        ColumnValue foreignValue = null;
        for (ColumnValue colValue : values)
        {
            if (forColumn.equals(colValue))
            {
                //foreignValue = colValue;
                foreignValue = new ColumnValue(foreignColumn.name, foreignColumn.tableName, colValue.value);
                break;
            }
        }
        // If there is no fereign-Key or the foreign-Key value is Null the Constraint is true
        if (foreignValue == null || foreignValue.value == null)
        {
            return true;
        }
        List<ColumnValue> foreignValueAsList = new ArrayList<>();
        foreignValueAsList.add(foreignValue);
        List<ColumnDefinition> foreignColumnAsList = new ArrayList<>();
        foreignColumnAsList.add(foreignColumn);
        try
        {
            if (entry.FedType instanceof FedHorizontalType)
            {
                ResultSet resultSet;

                resultSet = SQLHelper.select(fedConnection.getConn()[0],
                        foreignColumnAsList, foreignColumn.tableName, foreignValueAsList);

                if (resultSet.next())
                {
                    resultSet.close();
                    return true;
                }
                resultSet = SQLHelper.select(fedConnection.getConn()[1],
                        foreignColumnAsList, foreignColumn.tableName, foreignValueAsList);
                if (resultSet.next())
                {
                    resultSet.close();
                    return true;
                }
                if (entry.FedType.getDatabaseCount() == 3)
                {
                    resultSet = SQLHelper.select(fedConnection.getConn()[2],
                            foreignColumnAsList, foreignColumn.tableName, foreignValueAsList);
                    if (resultSet.next())
                    {
                        resultSet.close();
                        return true;
                    }
                }
                return false;
            } else if (entry.FedType instanceof FedVerticalType)
            {
                int dbindex = ((FedVerticalType) entry.FedType).getDatabaseForColumn(foreignColumn);
                ResultSet resultSet = SQLHelper.select(fedConnection.getConn()[dbindex],
                        foreignColumnAsList, foreignColumn.tableName, foreignValueAsList);
                boolean result = resultSet.next();
                resultSet.close();
                return result;
            } else
            {
                ResultSet resultSet = SQLHelper.select(fedConnection.getConn()[0],
                        foreignColumnAsList, foreignColumn.tableName, foreignValueAsList);
                boolean result = resultSet.next();
                resultSet.close();
                return result;
            }
        } catch (SQLException ex)
        {
            Logger.getLogger(ForeignKeyConstraint.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public boolean checkDelete(FedConnection fedConnection, List<ColumnValue> values)
    {
        return true;
    }

    @Override
    public boolean checkUpdate(FedConnection fedConnection, List<ColumnValue> values, Condition where)
    {
        MetaDataEntry entry = fedConnection.metaDataManger.getTableMetaData(foreignColumn.tableName);
        ColumnValue foreignValue = null;
        for (ColumnValue colValue : values)
        {
            if (foreignColumn.equals(colValue))
            {
                foreignValue = colValue;
                break;
            }
        }
        // If there is no fereign-Key or the foreign-Key value is Null the Constraint is true
        if (foreignValue == null || foreignValue.value == null)
        {
            return true;
        }
        List<ColumnValue> foreignValueAsList = new ArrayList<>();
        foreignValueAsList.add(foreignValue);
        List<ColumnDefinition> foreignColumnAsList = new ArrayList<>();
        foreignColumnAsList.add(foreignColumn);
        try
        {
            if (entry.FedType instanceof FedHorizontalType)
            {
                ResultSet resultSet;

                resultSet = SQLHelper.select(fedConnection.getConn()[0],
                        foreignColumnAsList, foreignColumn.tableName, foreignValueAsList);

                if (resultSet.next())
                {
                    resultSet.close();
                    return true;
                }
                resultSet = SQLHelper.select(fedConnection.getConn()[1],
                        foreignColumnAsList, foreignColumn.tableName, foreignValueAsList);
                if (resultSet.next())
                {
                    resultSet.close();
                    return true;
                }
                if (entry.FedType.getDatabaseCount() == 3)
                {
                    resultSet = SQLHelper.select(fedConnection.getConn()[2],
                            foreignColumnAsList, foreignColumn.tableName, foreignValueAsList);
                    if (resultSet.next())
                    {
                        resultSet.close();
                        return true;
                    }
                }
                return false;
            } else if (entry.FedType instanceof FedVerticalType)
            {
                int dbindex = ((FedVerticalType) entry.FedType).getDatabaseForColumn(foreignValue);
                ResultSet resultSet = SQLHelper.select(fedConnection.getConn()[dbindex],
                        foreignColumnAsList, foreignColumn.tableName, foreignValueAsList);
                boolean result = resultSet.next();
                resultSet.close();
                return result;
            } else
            {
                ResultSet resultSet = SQLHelper.select(fedConnection.getConn()[0],
                        foreignColumnAsList, foreignColumn.tableName, foreignValueAsList);
                boolean result = resultSet.next();
                resultSet.close();
                return result;
            }
        } catch (SQLException ex)
        {
            Logger.getLogger(ForeignKeyConstraint.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    /**
     * Determines if there are any Entries in Foreign Entries that reference to
     * the keys
     *
     * @param fedConnection
     * @param foreignKeysToDelete Single Row ResultSet with all PrimaryKeys to
     * delete
     * @return
     */
    public boolean checkReferences(FedConnection fedConnection,
            FedResultSetExtendedInterface foreignKeysToDelete)
            throws SQLException, FedException
    {
        FedResultSetExtendedInterface allForeignKeys
                = FedHelper.selectFromSingleTable(fedConnection, forColumn);
        return !isMatched(allForeignKeys, foreignKeysToDelete);
    }

    private boolean isMatched(FedResultSetExtendedInterface left, FedResultSetExtendedInterface right)
            throws FedException
    {
        if (left.getColumnType(0) == Types.VARCHAR)
        {
            do
            {
                do
                {
                    if (left.getString(1).equals(right.getString(1)))
                    {
                        return true;
                    }
                } while (right.next());
                right.first();
            } while (left.next());
        } else
        {
            do
            {
                do
                {
                    if (Objects.equals(left.getInteger(1), right.getInteger(1)))
                    {
                        return true;
                    }
                } while (right.next());
                right.first();
            } while (left.next());
        }
        return false;
    }

    public ColumnDefinition getForeignColumn()
    {
        return foreignColumn;
    }

    @Override
    public String toString()
    {
        return "FOREIGN KEY CONSTRAINT " + forColumn.toColumnString() + " -> " + this.foreignColumn.toColumnString();
    }
}
