/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MetaData.Constrains;

import Conditions.Condition;
import Data.FedHelper;
import FederalDB.FedConnection;
import FederalDB.FedResultSetInterface;
import MetaData.ColumnValue;
import ResultSetManagment.FedOverwriteResultSet;
import ResultSetManagment.FedResultSet;
import ResultSetManagment.FedResultSetExtendedInterface;
import ResultSetManagment.ValueWrapperResultSet;
import java.util.ArrayList;
import java.util.List;

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
    public boolean checkInsert(FedConnection fedConnection, List<ColumnValue> values) throws Exception
    {
        ValueWrapperResultSet resultSet = new ValueWrapperResultSet(values);
        return condition.execute(resultSet).size() == 1;
    }

    @Override
    public boolean checkDelete(FedConnection fedConnection, List<ColumnValue> values) throws Exception
    {
        return true;
    }

    @Override
    public boolean checkUpdate(FedConnection fedConnection, List<ColumnValue> values, Condition where) throws Exception
    {
        MetaData.MetaDataEntry meta = fedConnection.metaDataManger.getTableMetaData(values.get(0).tableName);
        FedResultSetExtendedInterface resultSet = FedHelper.selectAllFromSingleTable(fedConnection, meta.TableName, where);
        FedOverwriteResultSet ov = new FedOverwriteResultSet(resultSet, values);
        String ov_str = FedResultSet.printOut(ov);
        String resultSet_str = FedResultSet.printOut(resultSet);
        int filteredCount = condition.executeIgnoreNull(ov).size();
        int resCount = resultSet.getRowCount();
        if (filteredCount != resCount)
            return false;
        return true;
    }

    @Override
    public String toString()
    {
        return "CHECK CONSTRAINT " + condition.toWhereString();
    }
}
