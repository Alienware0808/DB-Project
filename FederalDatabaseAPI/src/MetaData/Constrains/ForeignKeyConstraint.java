/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MetaData.Constrains;

import Data.SQLHelper;
import MetaData.Constrains.Constraint;
import FederalDB.FedConnection;
import FederalDB.FedStatement;
import MetaData.ColumnDefinition;
import MetaData.ColumnValue;
import MetaData.FedHorizontalType;
import MetaData.MetaDataEntry;
import java.sql.ResultSet;
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
    public boolean check(FedConnection fedConnection, List<ColumnValue> columnValues)
            throws Exception
    {
        MetaDataEntry entry = fedConnection.metaDataManger.getTableMetaData(foreignColumn.tableName);
        ColumnValue foreignValue = null;
        for(ColumnValue colValue: columnValues)
            if(foreignColumn.equals(colValue))
            {
                foreignValue = colValue;
                break;
            }
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
        else 
        {
            ResultSet resultSet = SQLHelper.select(fedConnection.getConn()[0], 
                    foreignColumnAsList, foreignColumn.tableName, foreignValueAsList);
            return resultSet.next();
        }
    }
}
