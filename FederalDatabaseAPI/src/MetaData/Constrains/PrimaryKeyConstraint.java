/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MetaData.Constrains;

import Conditions.Condition;
import Data.FedConnectionFactory;
import MetaData.Constrains.Constraint;
import Data.FedHelper;
import Data.SQLHelper;
import FederalDB.FedConnection;
import FederalDB.FedException;
import FederalDB.FedResultSetInterface;
import FederalDB.FedStatement;
import MetaData.ColumnDefinition;
import MetaData.ColumnValue;
import MetaData.FedHorizontalType;
import MetaData.MetaDataEntry;
import ResultSetManagment.SqlWrapperResultSet;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Franz Weidmann
 */
public class PrimaryKeyConstraint extends Constraint implements java.io.Serializable
{

    public ColumnDefinition PrimaryKey;

    public PrimaryKeyConstraint()
    {
    }

    public PrimaryKeyConstraint(ColumnDefinition PrimaryKey)
    {
        this.PrimaryKey = PrimaryKey;
    }

    public ColumnDefinition getPrimaryKey()
    {
        return PrimaryKey;
    }

    @Override
    public boolean checkInsert(FedConnection fedConnection, List<ColumnValue> values) 
    {
        MetaDataEntry entry = fedConnection.metaDataManger.getTableMetaData(PrimaryKey.tableName);
        ColumnValue primVal = null;
        for (ColumnValue colval : values)
        {
            if (colval.equals(PrimaryKey))
            {
                primVal = colval;
                break;
            }
        }
        if (primVal == null)
        {
            return false;
        }
        List<ColumnDefinition> primaryKeyAsList = new ArrayList<>();
        primaryKeyAsList.add(PrimaryKey);
        List<ColumnValue> primaryValueAsList = new ArrayList<>();
        primaryValueAsList.add(primVal);
        try
        {
        if (entry.FedType instanceof FedHorizontalType)
        {
            ResultSet resultSet = SQLHelper.select(fedConnection.getConn()[0],
                    primaryKeyAsList, entry.TableName, primaryValueAsList);
            if (resultSet.next())
            {
                resultSet.close();
                return false;
            }
            resultSet = SQLHelper.select(fedConnection.getConn()[1],
                    primaryKeyAsList, entry.TableName, primaryValueAsList);
            if (resultSet.next())
            {
                resultSet.close();
                return false;
            }
            if (entry.FedType.getDatabaseCount() == 3)
            {
                resultSet = SQLHelper.select(fedConnection.getConn()[2],
                        primaryKeyAsList, entry.TableName, primaryValueAsList);
                if (resultSet.next())
                {
                    resultSet.close();
                    return false;
                }
            }
            return true;
        } else
        {
            ResultSet resultSet = SQLHelper.select(fedConnection.getConn()[0],
                    primaryKeyAsList, entry.TableName, primaryValueAsList);
            boolean result = !resultSet.next();
            resultSet.close();
            return result;
        }
        } catch (Exception ex)
        {
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean checkDelete(FedConnection fedConnection, List<ColumnValue> values) 
    {
        return true;
    }

    /**
     * Updating the Primary-Key is not allowed
     *
     * @param fedConnection
     * @param values
     * @return
     * @throws Exception
     */
    @Override
    public boolean checkUpdate(FedConnection fedConnection, List<ColumnValue> values, Condition where) 
    {
        MetaDataEntry entry = fedConnection.metaDataManger.getTableMetaData(PrimaryKey.tableName);
        ColumnValue primVal = null;
        for (ColumnValue colval : values)
        {
            if (colval.equals(PrimaryKey))
            {
                primVal = colval;
                break;
            }
        }
        if (primVal == null)
            return true;
        return false;
    }

    @Override
    public String toString()
    {
        return "PRIMARY KEY CONSTRAINT " + this.PrimaryKey.toColumnString();
    }
}
