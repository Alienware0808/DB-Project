/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parser.AnalysedStatements;

import FederalDB.FedConnection;
import FederalDB.FedException;
import MetaData.ColumnValue;
import MetaData.MetaDataEntry;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import org.antlr.v4.runtime.tree.ParseTree;
import parser.FastParse;
import parser.SQLiteParser;

/**
 *
 * @author Admin
 */
public class InsertStatement extends Statement
{

    public final MetaDataEntry tableMeta;
    public List<ColumnValue> ColumnValues;
    public FedConnection fedConnection;
    
    public InsertStatement(String sql, FedConnection fedConnection) 
            throws FedException
    {
        super(null);
        sql = sql.trim();
        Scanner sc = new Scanner(sql);
        sc.next(); // skip "insert"
        sc.next(); // skip "into"
        tableMeta = fedConnection.metaDataManger.getTableMetaData(sc.next());
        sc.next(); // skip "values"
        sc.useDelimiter("\\(");
        sc.next(); // skip " ("
        sc.useDelimiter(",");
        ColumnValues = new ArrayList<>();
        String value = sc.next().substring(1);
        ColumnValues.add(new ColumnValue(
                tableMeta.Columns.get(0).name, 
                tableMeta.Columns.get(0).tableName,
                FastParse.parseValue(value)));
        int i = 1;
        while(sc.hasNext())
        {
            String next = sc.next();
            if(next.isEmpty() || next.endsWith(";"))
                break;
            if(next.endsWith(")"))
                next = next.substring(0, next.length()-1);
            ColumnValues.add(new ColumnValue(
                tableMeta.Columns.get(i).name, 
                tableMeta.Columns.get(i).tableName,
                FastParse.parseValue(next)));
            i++;
        }
    }

    public InsertStatement(ParseTree tree, FedConnection fedConnection) throws FedException
    {
        super(tree);
        List<Object> values = new ArrayList<>();
        this.fedConnection = fedConnection;
        tableMeta = fedConnection.metaDataManger.getTableMetaData(tree.getChild(2).getText());
        if(tableMeta == null)
            throw new FedException(new Exception("Table does not exist"));
        for (int i = 4; i < tree.getChildCount(); i++)
        {
            if (tree.getChild(i) instanceof SQLiteParser.ExprContext)
            {
                String valstr = tree.getChild(i).getText();
                if (valstr.startsWith("'"))
                {
                    valstr = valstr.substring(1);
                    valstr = valstr.substring(0, valstr.length() - 1);
                    values.add(valstr);
                } else if(valstr.toLowerCase().equals("null"))
                    values.add(null);
                else
                    values.add(Integer.parseInt(valstr));
            }
        }
        ColumnValues = new ArrayList<>();
        for(int i = 0; i < values.size(); i++)
        {
            ColumnValue colval = new ColumnValue(
                    tableMeta.Columns.get(i).name, 
                    tableMeta.TableName, values.get(i));
            ColumnValues.add(colval);
        }
    }
}
