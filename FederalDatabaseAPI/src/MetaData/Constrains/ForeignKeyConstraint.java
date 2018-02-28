/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MetaData.Constrains;

import Conditions.Condition;
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
import parser.AnalysedStatements.CreateStatement;

/**
 *
 * @author Franz Weidmann
 */
public class ForeignKeyConstraint extends Constraint {
    
    private ColumnDefinition forColumn;
    private ColumnDefinition foreignColumn;

    @Override
    public boolean checkInsert(FedConnection fedConnection, List<ColumnValue> values) throws Exception {
        MetaDataEntry entry = fedConnection.metaDataManger.getTableMetaData(foreignColumn.tableName);
        ColumnValue foreignValue = null;
        for(ColumnValue colValue: values)
            if(foreignColumn.equals(colValue))
            {
                foreignValue = colValue;
                break;
            }
        // If there is no fereign-Key or the foreign-Key value is Null the Constraint is true
        if(foreignValue == null || foreignValue.value == null)
            return true;
        List<ColumnValue> foreignValueAsList = new ArrayList<>();
        foreignValueAsList.add(foreignValue);
        List<ColumnDefinition> foreignColumnAsList = new ArrayList<>();
        foreignColumnAsList.add(foreignColumn);
        if(entry.FedType instanceof FedHorizontalType)
        {
            ResultSet resultSet = SQLHelper.select(fedConnection.getConn()[0], 
                    foreignColumnAsList, foreignColumn.tableName, foreignValueAsList);
            if(resultSet.next())
                return true;
            resultSet = SQLHelper.select(fedConnection.getConn()[1], 
                    foreignColumnAsList, foreignColumn.tableName, foreignValueAsList);
            if(resultSet.next())
                return true;
            if(entry.FedType.DatabaseCount == 3)
            {
                resultSet = SQLHelper.select(fedConnection.getConn()[2], 
                    foreignColumnAsList, foreignColumn.tableName, foreignValueAsList);
                if(resultSet.next())
                    return true;
            }
            return false;
        }
        else if(entry.FedType instanceof FedVerticalType)
        {
            int dbindex = ((FedVerticalType)entry.FedType).getDatabaseForColumn(foreignValue);
            ResultSet resultSet = SQLHelper.select(fedConnection.getConn()[dbindex], 
                    foreignColumnAsList, foreignColumn.tableName, foreignValueAsList);
            return resultSet.next();
        }
        else 
        {
            ResultSet resultSet = SQLHelper.select(fedConnection.getConn()[0], 
                    foreignColumnAsList, foreignColumn.tableName, foreignValueAsList);
            return resultSet.next();
        }
    }

    @Override
    public boolean checkDelete(FedConnection fedConnection, List<ColumnValue> values) throws Exception {
        return true;
    }

    @Override
    public boolean checkUpdate(FedConnection fedConnection, List<ColumnValue> values, Condition where) throws Exception {
        MetaDataEntry entry = fedConnection.metaDataManger.getTableMetaData(foreignColumn.tableName);
        ColumnValue foreignValue = null;
        for(ColumnValue colValue: values)
            if(foreignColumn.equals(colValue))
            {
                foreignValue = colValue;
                break;
            }
        // If there is no fereign-Key or the foreign-Key value is Null the Constraint is true
        if(foreignValue == null || foreignValue.value == null)
            return true;
        List<ColumnValue> foreignValueAsList = new ArrayList<>();
        foreignValueAsList.add(foreignValue);
        List<ColumnDefinition> foreignColumnAsList = new ArrayList<>();
        foreignColumnAsList.add(foreignColumn);
        if(entry.FedType instanceof FedHorizontalType)
        {
            ResultSet resultSet = SQLHelper.select(fedConnection.getConn()[0], 
                    foreignColumnAsList, foreignColumn.tableName, foreignValueAsList);
            if(resultSet.next())
                return true;
            resultSet = SQLHelper.select(fedConnection.getConn()[1], 
                    foreignColumnAsList, foreignColumn.tableName, foreignValueAsList);
            if(resultSet.next())
                return true;
            if(entry.FedType.DatabaseCount == 3)
            {
                resultSet = SQLHelper.select(fedConnection.getConn()[2], 
                    foreignColumnAsList, foreignColumn.tableName, foreignValueAsList);
                if(resultSet.next())
                    return true;
            }
            return false;
        }
        else if(entry.FedType instanceof FedVerticalType)
        {
            int dbindex = ((FedVerticalType)entry.FedType).getDatabaseForColumn(foreignValue);
            ResultSet resultSet = SQLHelper.select(fedConnection.getConn()[dbindex], 
                    foreignColumnAsList, foreignColumn.tableName, foreignValueAsList);
            return resultSet.next();
        }
        else 
        {
            ResultSet resultSet = SQLHelper.select(fedConnection.getConn()[0], 
                    foreignColumnAsList, foreignColumn.tableName, foreignValueAsList);
            return resultSet.next();
        }
    }
    
    /**
     * 
     * @param fedConnection
     * @param foreignKeysToDelete Single Row ResultSet with all PrimaryKeys to delete
     * @return 
     */
    public boolean checkReferences(FedConnection fedConnection, 
            FedResultSetExtendedInterface foreignKeysToDelete) 
            throws SQLException, FedException
    {
        FedResultSetExtendedInterface allForeignKeys = 
                FedHelper.selectFromSingleTable(fedConnection, forColumn);
        return !isMatched(allForeignKeys, foreignKeysToDelete);
    }
    
    private boolean isMatched(FedResultSetExtendedInterface left, FedResultSetExtendedInterface right) 
            throws FedException
    {
        if(left.getColumnType(0) == Types.VARCHAR)
        {
            do
            {
                do
                {
                    if(left.getString(1).equals(right.getString(1)))
                        return true;
                } while(right.next());
                right.first();
            }while(left.next());
        }
        else 
        {
            do
            {
                do
                {
                    if(left.getInt(1) == (right.getInt(1)))
                        return true;
                } while(right.next());
                right.first();
            }while(left.next());
        }
        return false;
    }

    public ColumnDefinition getForeignColumn() {
        return foreignColumn;
    }
}
