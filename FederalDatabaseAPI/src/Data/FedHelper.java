/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Conditions.Condition;
import FederalDB.FedConnection;
import FederalDB.FedException;
import FederalDB.FedStatement;
import MetaData.ColumnDefinition;
import MetaData.ColumnValue;
import MetaData.FedHorizontalType;
import MetaData.FedVerticalType;
import MetaData.MetaDataEntry;
import ResultSetManagment.FedConditionResultSet;
import ResultSetManagment.FedCrossproductResultSet;
import ResultSetManagment.FedHorizontalResultSet;
import ResultSetManagment.FedResultSetExtendedInterface;
import ResultSetManagment.FedVerticalResultSet;
import ResultSetManagment.SqlWrapperResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import parser.AnalysedStatements.CreateStatement;

/**
 *
 * @author Admin
 */
public final class FedHelper
{

    public static FedResultSetExtendedInterface select(FedConnection connection, List<ColumnDefinition> columns) throws SQLException, FedException
    {
        HashMap<String, List<ColumnDefinition>> selectedColumns = new HashMap<>();
        for(ColumnDefinition coldef : columns)
        {
            boolean found = false;
            for(int i = 0; i < selectedColumns.size(); i++)
                if(selectedColumns.containsKey(coldef.tableName))
                {
                    selectedColumns.get(coldef.tableName).add(coldef);
                    found = true;
                    break;
                }
            if(!found)
            {
                List<ColumnDefinition> newlist = new ArrayList<>();
                newlist.add(coldef);
                selectedColumns.put(coldef.tableName, newlist);
            }
        }
        List<FedResultSetExtendedInterface> results = new ArrayList<>();
        for(List<ColumnDefinition> tableColls : selectedColumns.values())
            results.add(selectFromSingleTable(connection, tableColls));
        // Build all crossproducts for the selections
        if(results.size() == 1)
            return results.get(0);
        FedCrossproductResultSet cprod = new FedCrossproductResultSet(results.get(0), results.get(1));
        for(int i = 2; i < results.size(); i++)
        {
            cprod = new FedCrossproductResultSet(cprod.duplicate(), results.get(i));
        }
        return cprod;
    }
    
    public static FedResultSetExtendedInterface selectFromSingleTable(
            FedConnection connection, List<ColumnDefinition> columns)
            throws SQLException, FedException
    {
        MetaDataEntry meta = connection.metaDataManger.getTableMetaData(columns.get(0).tableName);
        if (meta.FedType instanceof FedHorizontalType)
        {
            FedResultSetExtendedInterface rs1 = new SqlWrapperResultSet(SQLHelper.select(connection.getConn()[0], ColumnDefinition.toWhereString(columns), meta.TableName));
            FedResultSetExtendedInterface rs2 = new SqlWrapperResultSet(SQLHelper.select(connection.getConn()[1], ColumnDefinition.toWhereString(columns), meta.TableName));
            if (meta.FedType.getDatabaseCount() == 3)
            {
                FedResultSetExtendedInterface rs3 = new SqlWrapperResultSet(SQLHelper.select(connection.getConn()[2], ColumnDefinition.toWhereString(columns), meta.TableName));
                FedHorizontalResultSet hs1 = new FedHorizontalResultSet(rs1, rs2);
                return new FedHorizontalResultSet(hs1, rs3);
            }
            return new FedHorizontalResultSet(rs1, rs2);
        } else if (meta.FedType instanceof FedVerticalType)
        {
            FedVerticalResultSet vr;

            FedVerticalType vert = (FedVerticalType) meta.FedType;
            FedResultSetExtendedInterface rs1 = new SqlWrapperResultSet(SQLHelper.select(connection.getConn()[0], ColumnDefinition.toWhereString(columns), meta.TableName));
            FedResultSetExtendedInterface rs2 = new SqlWrapperResultSet(SQLHelper.select(connection.getConn()[1], ColumnDefinition.toWhereString(columns), meta.TableName));
            if (meta.FedType.getDatabaseCount() == 3)
            {
                FedResultSetExtendedInterface rs3 = new SqlWrapperResultSet(SQLHelper.select(connection.getConn()[2], ColumnDefinition.toWhereString(columns), meta.TableName));
                FedVerticalResultSet vzwisch = new FedVerticalResultSet(rs1, rs2);
                vr = new FedVerticalResultSet(vzwisch, rs3);
            } else
            {
                vr = new FedVerticalResultSet(rs1, rs2);
            }
            return vr;
        } else
        {
            return new SqlWrapperResultSet(SQLHelper.select(connection.getConn()[0], ColumnDefinition.toWhereString(columns), meta.TableName));
        }
    }

    public static FedResultSetExtendedInterface selectFromSingleTable(
            FedConnection connection, ColumnDefinition column1)
            throws SQLException, FedException
    {
        MetaDataEntry meta = connection.metaDataManger.getTableMetaData(column1.tableName);
        if (meta.FedType instanceof FedHorizontalType)
        {
            FedResultSetExtendedInterface rs1 = new SqlWrapperResultSet(SQLHelper.select(connection.getConn()[0], column1.toWhereString(), column1.tableName));
            FedResultSetExtendedInterface rs2 = new SqlWrapperResultSet(SQLHelper.select(connection.getConn()[1], column1.toWhereString(), column1.tableName));
            if (meta.FedType.getDatabaseCount() == 3)
            {
                FedResultSetExtendedInterface rs3 = new SqlWrapperResultSet(SQLHelper.select(connection.getConn()[2], column1.toWhereString(), column1.tableName));
                FedHorizontalResultSet hs1 = new FedHorizontalResultSet(rs1, rs2);
                return new FedHorizontalResultSet(hs1, rs3);
            }
            return new FedHorizontalResultSet(rs1, rs2);
        } else if (meta.FedType instanceof FedVerticalType)
        {
            FedVerticalResultSet vr;

            FedVerticalType vert = (FedVerticalType) meta.FedType;
            FedResultSetExtendedInterface rs1 = new SqlWrapperResultSet(SQLHelper.select(connection.getConn()[0], column1.toWhereString(), column1.tableName));
            FedResultSetExtendedInterface rs2 = new SqlWrapperResultSet(SQLHelper.select(connection.getConn()[1], column1.toWhereString(), column1.tableName));
            if (meta.FedType.getDatabaseCount() == 3)
            {
                FedResultSetExtendedInterface rs3 = new SqlWrapperResultSet(SQLHelper.select(connection.getConn()[2], column1.toWhereString(), column1.tableName));
                FedVerticalResultSet vzwisch = new FedVerticalResultSet(rs1, rs2);
                vr = new FedVerticalResultSet(vzwisch, rs3);
            } else
            {
                vr = new FedVerticalResultSet(rs1, rs2);
            }
            return vr;
        } else
        {
            return new SqlWrapperResultSet(SQLHelper.select(connection.getConn()[0], column1.toWhereString(), column1.tableName));
        }
    }

    public static FedResultSetExtendedInterface selectAllFromSingleTable(
            FedConnection connection, String table, Condition where)
            throws SQLException, FedException
    {
        MetaDataEntry meta = connection.metaDataManger.getTableMetaData(table);
        if (meta.FedType instanceof FedHorizontalType)
        {
            FedResultSetExtendedInterface rs1 = new SqlWrapperResultSet(SQLHelper.selectAll(connection.getConn()[0], table, where.toWhereString()));
            FedResultSetExtendedInterface rs2 = new SqlWrapperResultSet(SQLHelper.selectAll(connection.getConn()[1], table, where.toWhereString()));
            if (meta.FedType.getDatabaseCount() == 3)
            {
                FedResultSetExtendedInterface rs3 = new SqlWrapperResultSet(SQLHelper.selectAll(connection.getConn()[2], table, where.toWhereString()));
                FedHorizontalResultSet hs1 = new FedHorizontalResultSet(rs1, rs2);
                return new FedHorizontalResultSet(hs1, rs3);
            }
            return new FedHorizontalResultSet(rs1, rs2);
        } else if (meta.FedType instanceof FedVerticalType)
        {
            FedVerticalResultSet vr;

            FedVerticalType vert = (FedVerticalType) meta.FedType;
            FedResultSetExtendedInterface rs1 = new SqlWrapperResultSet(SQLHelper.selectAll(connection.getConn()[0], table));
            FedResultSetExtendedInterface rs2 = new SqlWrapperResultSet(SQLHelper.selectAll(connection.getConn()[1], table));
            if (meta.FedType.getDatabaseCount() == 3)
            {
                FedResultSetExtendedInterface rs3 = new SqlWrapperResultSet(SQLHelper.selectAll(connection.getConn()[2], table));
                FedVerticalResultSet vzwisch = new FedVerticalResultSet(rs1, rs2);
                vr = new FedVerticalResultSet(vzwisch, rs3);
            } else
            {
                vr = new FedVerticalResultSet(rs1, rs2);
            }
            return new FedConditionResultSet(where, vr);
        } else
        {
            return new SqlWrapperResultSet(SQLHelper.selectAll(connection.getConn()[0], table));
        }
    }
    
    public static FedResultSetExtendedInterface selectPrimFromSingleTable(
            FedConnection connection, String table, Condition where)
            throws SQLException, FedException
    {
        MetaDataEntry meta = connection.metaDataManger.getTableMetaData(table);
        ColumnDefinition prim = meta.getPrimaryKeyConstraint().PrimaryKey;
        if (meta.FedType instanceof FedHorizontalType)
        {
            FedResultSetExtendedInterface rs1 = new SqlWrapperResultSet(SQLHelper.select(connection.getConn()[0], prim.name, table, where));
            FedResultSetExtendedInterface rs2 = new SqlWrapperResultSet(SQLHelper.select(connection.getConn()[1], prim.name, table, where));
            if (meta.FedType.getDatabaseCount() == 3)
            {
                FedResultSetExtendedInterface rs3 = new SqlWrapperResultSet(SQLHelper.select(connection.getConn()[2], prim.name, table, where));
                FedHorizontalResultSet hs1 = new FedHorizontalResultSet(rs1, rs2);
                return new FedHorizontalResultSet(hs1, rs3);
            }
            return new FedHorizontalResultSet(rs1, rs2);
        } else if (meta.FedType instanceof FedVerticalType)
        {
            FedVerticalResultSet vr;

            FedVerticalType vert = (FedVerticalType) meta.FedType;
            FedResultSetExtendedInterface rs1 = new SqlWrapperResultSet(SQLHelper.selectAll(connection.getConn()[0], table));
            FedResultSetExtendedInterface rs2 = new SqlWrapperResultSet(SQLHelper.selectAll(connection.getConn()[1], table));
            if (meta.FedType.getDatabaseCount() == 3)
            {
                FedResultSetExtendedInterface rs3 = new SqlWrapperResultSet(SQLHelper.selectAll(connection.getConn()[2], table));
                FedVerticalResultSet vzwisch = new FedVerticalResultSet(rs1, rs2);
                vr = new FedVerticalResultSet(vzwisch, rs3);
            } else
            {
                vr = new FedVerticalResultSet(rs1, rs2);
            }
            return new FedConditionResultSet(where, vr);
        } else
        {
            return new SqlWrapperResultSet(SQLHelper.select(connection.getConn()[0], prim.name, table, where));
        }
    }
    
    
}
