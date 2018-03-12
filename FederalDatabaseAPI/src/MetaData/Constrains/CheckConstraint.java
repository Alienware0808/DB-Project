/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MetaData.Constrains;

import Conditions.Condition;
import Data.FedConnectionFactory;
import Data.FedHelper;
import FederalDB.FedConnection;
import FederalDB.FedException;
import FederalDB.FedResultSetInterface;
import MetaData.ColumnValue;
import ResultSetManagment.FedOverwriteResultSet;
import ResultSetManagment.FedResultSet;
import ResultSetManagment.FedResultSetExtendedInterface;
import ResultSetManagment.ValueWrapperResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Franz Weidmann
 */
public class CheckConstraint extends Constraint implements java.io.Serializable
{

    private Condition condition;

    public CheckConstraint(Condition condition)
    {
        this.condition = condition;
    }

    public Condition getCondition()
    {
        return condition;
    }

    @Override
    public boolean checkInsert(FedConnection fedConnection, List<ColumnValue> values) 
    {
        try
        {
            ValueWrapperResultSet resultSet = new ValueWrapperResultSet(values);
            boolean result = condition.execute(resultSet).size() == 1;
            resultSet.close();
            return result;
        } catch (FedException ex)
        {
            Logger.getLogger(CheckConstraint.class.getName()).log(Level.SEVERE, null, ex);
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
        MetaData.MetaDataEntry meta = fedConnection.metaDataManger.getTableMetaData(values.get(0).tableName);
        FedResultSetExtendedInterface resultSet;
        try
        {
            resultSet = FedHelper.selectAllFromSingleTable(fedConnection, meta.TableName, where);
            FedOverwriteResultSet ov = new FedOverwriteResultSet(resultSet, values);
            String ov_str = FedResultSet.printOut(ov);
            String resultSet_str = FedResultSet.printOut(resultSet);
            int filteredCount = condition.executeIgnoreNull(ov).size();
            int resCount = resultSet.getRowCount();
            if (filteredCount != resCount)
                return false;
            return true;
        } catch (Exception ex)
        {
            Logger.getLogger(CheckConstraint.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } 
    }

    @Override
    public String toString()
    {
        return "CHECK CONSTRAINT " + condition.toWhereString();
    }
}
