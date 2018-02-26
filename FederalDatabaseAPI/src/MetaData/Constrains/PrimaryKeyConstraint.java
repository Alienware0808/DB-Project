/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MetaData.Constrains;

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
import ResultSetManagment.SqlResultWrapper;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Franz Weidmann
 */
public class PrimaryKeyConstraint extends Constraint {
    
    public List<ColumnDefinition> PrimaryKeys;
    
    public PrimaryKeyConstraint()
    {
        this.PrimaryKeys = new ArrayList<>();
    }
    
    public PrimaryKeyConstraint(List<ColumnDefinition> primaryKeys)
    {
        this.PrimaryKeys = primaryKeys;
    }
    
    @Override
    public boolean check(FedConnection fedConnection, List<ColumnValue> values)
            throws Exception
    {
        MetaDataEntry entry = fedConnection.metaDataManger.getTableMetaData(PrimaryKeys.get(0).tableName);
        List<ColumnValue> primVals = new ArrayList<ColumnValue>();
        for(ColumnValue colval: values)
        {
            for(ColumnDefinition primkey: PrimaryKeys)
                if(colval.equals(primkey))
                {
                    primVals.add(colval);
                    break;
                }
        }
        if(entry.FedType instanceof FedHorizontalType)
        {
            ResultSet resultSet = SQLHelper.select(fedConnection.getConn()[0], 
                    PrimaryKeys, entry.TableName, primVals);
            if(!resultSet.next())
                return true;
            resultSet = SQLHelper.select(fedConnection.getConn()[1], 
                    PrimaryKeys, entry.TableName, primVals);
            if(!resultSet.next())
                return true;
            if(entry.FedType.DatabaseCount == 3)
            {
                resultSet = SQLHelper.select(fedConnection.getConn()[2], 
                    PrimaryKeys, entry.TableName, primVals);
                if(!resultSet.next())
                    return true;
            }
            return false;
        }
        else 
        {
            ResultSet resultSet = SQLHelper.select(fedConnection.getConn()[0], 
                    PrimaryKeys, entry.TableName, primVals);
            return !resultSet.next();
        }
    }

    public List<ColumnDefinition> getPrimaryKeys() {
        return PrimaryKeys;
    }
}
