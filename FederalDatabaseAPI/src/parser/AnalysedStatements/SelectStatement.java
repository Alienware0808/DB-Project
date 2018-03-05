/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parser.AnalysedStatements;

import Conditions.CompareCondition;
import Conditions.CompareType;
import Conditions.Condition;
import Conditions.HavingCompare;
import Conditions.JunctionCondition;
import Conditions.SingleValueDescriptor;
import Conditions.IValue;
import FederalDB.FedConnection;
import FederalDB.FedException;
import MetaData.ColumnDefinition;
import MetaData.MetaDataEntry;
import ResultSetManagment.Aggregation.AvgAggregation;
import ResultSetManagment.Aggregation.CountAggregation;
import ResultSetManagment.Aggregation.MaxAggregation;
import ResultSetManagment.Aggregation.MinAggregation;
import ResultSetManagment.Aggregation.SumAggregate;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;
import parser.ContextException;
import parser.ParseException;
import parser.SQLiteParser;
import parser.SQLiteParser.Select_coreContext;
import parser.Walker;

/**
 *
 * @author Tobias Habermann
 */
public class SelectStatement extends Statement
{

    public final boolean isFirstColumnDistinct;
    public final HashMap<String, ColumnDefinition> columnAliases;
    public final HashMap<String, MetaDataEntry> tableAliases;
    public final List<MetaDataEntry> tables;
    public final List<ColumnDefinition> resultColumns;
    public final List<ColumnDefinition> extraColumnsForWhere;
    private Conditions.Condition where;
    private ColumnDefinition groupByColumn;
    private HavingCompare groupByHavingCondition;
    public FedConnection fedConnection;

    /**
     * Prepares the SelectStatement given from the parser
     *
     * @param tree The select_core ParseTree
     * @throws ContextException
     * @throws Exception
     */
    public SelectStatement(Select_coreContext tree, FedConnection fedConnection) throws ContextException, Exception
    {
        super(tree);
        // Init all Fields
        columnAliases = new HashMap<>();
        tableAliases = new HashMap<>();
        tables = new ArrayList<>();
        resultColumns = new ArrayList<>();
        extraColumnsForWhere = new ArrayList<>();
        this.fedConnection = fedConnection;

        // Load all tables in the From Statement
        loadTableNamesAndAliases();

        int i = 1; // Skit the "Select" statement
        isFirstColumnDistinct = IsTerminalNode(tree.getChild(i), SQLiteParser.K_DISTINCT);
        if (isFirstColumnDistinct)
        {
            i++;
        }

        // Load all Result Columns in the Statement
        loadResultColumnsAndAliases();

        // Load all Where Clauses (and the Columns for that?? Maybe??? Dont know^^)
        loadWhereClause();

        // Load the Group by Clause
        loadGroupClause();
    }

    public MetaDataEntry getTableByNameOrAlias(String nameOrAlias) throws ContextException
    {
        MetaDataEntry table = this.tableAliases.get(nameOrAlias);
        if (table == null)
        {
            // TODO search the Metadata for that table ...
            table = fedConnection.metaDataManger.getTableMetaData(nameOrAlias);
            if (table == null)
            {
                throw new ContextException("Table not found");
            }
        }
        return table;
    }

    public ColumnDefinition getResultColumnByNameOrAlias(String nameOrAlias)
    {
        nameOrAlias = nameOrAlias.toLowerCase();
        ColumnDefinition col = this.columnAliases.get(nameOrAlias);
        if (col == null)
        {
            for (ColumnDefinition curCol : resultColumns)
            {
                if (curCol.name.equals(nameOrAlias))
                {
                    return curCol;
                }
            }
        }
        return null;
    }

    public ColumnDefinition getResultColumnByNameOrAlias(String colName, String tableNameOrAlias) throws ContextException
    {
        MetaDataEntry table = getTableByNameOrAlias(tableNameOrAlias);
        colName = colName.toLowerCase();
        for (ColumnDefinition curCol : resultColumns)
        {
            if (curCol.name.equals(colName) && curCol.tableName.equals(table.TableName))
            {
                return curCol;
            }
        }
        return null;
    }

    private void loadTableNamesAndAliases()
    {
        int i = 2; // skip the select and result colmn statement
        // find the FROM node
        while (!IsTerminalNode(tree.getChild(i), SQLiteParser.K_FROM))
        {
            i++;
        }
        i++; // skip the FROM Node
        // Find all tables mentioned in the Statement
        while (tree.getChild(i) instanceof SQLiteParser.Table_or_subqueryContext)
        {
            // Process the found Table Statement
            ParseTree table_node = tree.getChild(i);
            MetaDataEntry current = null;
            for (int j = 0; j < table_node.getChildCount(); j++)
            {
                // Add the Table
                if (table_node.getChild(j) instanceof SQLiteParser.Table_nameContext)
                {
                    // TODO Exception Handling??? Maybe???
                    current = fedConnection.metaDataManger.getTableMetaData(table_node.getChild(j).getText());
                    tables.add(current);
                } // Add the Alias for the table
                else if (table_node.getChild(j) instanceof SQLiteParser.Table_aliasContext)
                {
                    tableAliases.put(table_node.getChild(j).getText(), current);
                }
            }
            i++; // Switch to the "," TerminalNode
            if (tree.getChild(i) != null && !tree.getChild(i).getText().equals(","))
            {
                return;
            }
            i++; // Switch to the next Node or the end
        }
    }

    private void loadResultColumnsAndAliases() throws ContextException, Exception
    {
        int i = 1; // skip the select statement
        // skip the Distinct statement as well if needed
        if (isFirstColumnDistinct)
        {
            i++;
        }
        // Find all Columns mentioned in the Statement and the corresponding table to it
        while (tree.getChild(i) instanceof SQLiteParser.Result_columnContext)
        {
            // Process the found Column Statement
            ParseTree column_node = tree.getChild(i);
            List<ColumnDefinition> coldefs = loadSingleResultColumn(column_node);
            resultColumns.addAll(coldefs);
            
            i++; // Switch to the "," TerminalNode
            if (tree.getChild(i) != null && !tree.getChild(i).getText().equals(","))
            {
                return;
            }
            i++; // Switch to the next Node
        }
    }
    
    private List<ColumnDefinition> loadSingleResultColumn(ParseTree column_node) 
            throws ContextException, FedException
    {
        List<ColumnDefinition> result = new ArrayList<>();
        /*
            There are 3 Cases:
                '*'
                | table_name '.' '*'
                | table_name '.' column_alias
                | func '(' expr ')'
             */
            // The "*" case
            if (column_node.getChild(0).getText().startsWith("*"))
            {
                if (tables.size() != 1)
                    throw new ContextException("Illigal use of '*' Identifier");
                else
                {
                    MetaDataEntry meta = fedConnection.metaDataManger.getTableMetaData(tables.get(0).TableName);
                    result.addAll(meta.Columns);
                }
            } 
            else if (column_node.getChild(0) instanceof SQLiteParser.ExprContext)
            {
                ParseTree expr = column_node.getChild(0);
                if(expr.getChild(0) instanceof SQLiteParser.Table_nameContext)
                {
                    MetaDataEntry table = getTableByNameOrAlias(expr.getChild(0).getText().toLowerCase());
                    ColumnDefinition coldef = getResultColumnByNameOrAlias(expr.getChild(2).getText().toLowerCase(), table.TableName);
                    if(expr.getChild(2).getText().startsWith("*")) // Table.*
                        result.addAll(table.Columns);
                    else if(coldef != null) // Table.columname
                        result.add(coldef);
                    else throw new FedException(new Exception("Column Name not found"));
                }
                // function ( expr )
                else if (expr.getChild(0) instanceof SQLiteParser.Function_nameContext) 
                {
                    // Do the things with the functions
                    String functionName = expr.getChild(0).getText().toLowerCase();
                    List<ColumnDefinition> columnName = loadSingleResultColumn(expr.getChild(2));
                    switch(functionName)
                    {
                        case "sum": result.add(new SumAggregate(columnName.get(0).name, columnName.get(0).tableName));
                        break;
                        case "avg": result.add(new AvgAggregation(columnName.get(0).name, columnName.get(0).tableName));
                        break;
                        case "min": result.add(new MinAggregation(columnName.get(0).name, columnName.get(0).tableName));
                        break;
                        case "max": result.add(new MaxAggregation(columnName.get(0).name, columnName.get(0).tableName));
                        break;
                        case "count": result.add(new CountAggregation(columnName.get(0).name, columnName.get(0).tableName));
                        break;
                    }
                }
                // ColumnName
                else if (expr.getChild(0) instanceof SQLiteParser.Column_nameContext)
                {
                    if(tables.size() == 1)
                        result.add(new ColumnDefinition(expr.getText().toLowerCase(), getTableByNameOrAlias(tables.get(0).TableName).TableName));
                    else throw new FedException(new Exception("No table defined for Column"));
                }
            } // The "expr ..." case
            /*else
            {
                // Search in all the Children nodes for the column and its alias
                Walker<ColumnDefinition> walker = new Walker<ColumnDefinition>(column_node, new Walker.IEvents<ColumnDefinition>()
                {
                    @Override
                    public ColumnDefinition nodeFound(ParseTree tree, ColumnDefinition workValue) throws ContextException
                    {
                        // Add the Column
                        if (tree instanceof SQLiteParser.Column_nameContext)
                        {
                            // TODO Exception Handling??? Maybe???
                            if (workValue.name != null)
                            {
                                throw new ContextException("More than one Column is mentioned in a resultColumn");
                            }
                            workValue.name = (tree.getText().toLowerCase());
                        } // Add the Alias for the column
                        else if (tree instanceof SQLiteParser.Column_aliasContext)
                        {
                            columnAliases.put(tree.getText().toLowerCase(), workValue);
                        } // Set the function name for the column
                        else if (tree instanceof SQLiteParser.Function_nameContext)
                        {
                            workValue.function = tree.getText().toLowerCase();
                        } // Set the Table name for the column
                        else if (tree instanceof SQLiteParser.Table_nameContext)
                        {
                            String table_name = tree.getChild(0).getText();
                            MetaDataEntry table = getTableByNameOrAlias(table_name);
                            if (table == null)
                            {
                                throw new ContextException("Table " + table_name + " not found");
                            }
                            workValue.tableName = table_name;
                        }
                        return workValue;
                    }

                    @Override
                    public ColumnDefinition finalNodeFound(ParseTree tree, ColumnDefinition workValue)
                    {
                        return workValue;
                    }

                    @Override
                    public ColumnDefinition finalLiteraFound(String text, ColumnDefinition workValue)
                    {
                        return workValue;
                    }
                });
                walker.workValue = new ColumnDefinition(resultColumns.size());
                result.add(walker.workValue);
                walker.run();
                // Look for the Tablename to be set for the found column
                if (walker.workValue.tableName == null)
                {
                    if (tables.size() == 1)
                    {
                        walker.workValue.tableName = (tables.get(0).TableName);
                    } else
                    {
                        throw new ContextException("Missing a Tablename for a result column");
                    }
                }
            }*/
        return result;
    }

    private void loadWhereClause() throws ContextException
    {
        int i = 0;
        // Find the Where Clause
        while (!(tree.getChild(i) instanceof SQLiteParser.Select_core_whereContext) && tree.getChild(i) != null)
        {
            i++;
        }
        if (tree.getChild(i) == null)
        {
            return;
        }
        // get the initial expr ParseTree
        // Skip the "where" Terminal Node and take the secound Child of the where clause
        SQLiteParser.ExprContext expr = (SQLiteParser.ExprContext) tree.getChild(i).getChild(1);
        where = parseCondition(expr);
    }

    private Condition parseCondition(ParseTree expr) throws ContextException
    {
        switch (expr.getChildCount())
        {
            case 3:
                String operator = expr.getChild(1).getText().toLowerCase();
                switch (operator)
                {
                    case "and":
                        return new JunctionCondition(
                                JunctionCondition.JunctionType.AND,
                                parseCondition(expr.getChild(0)),
                                parseCondition(expr.getChild(2)));
                    case "or":
                        return new JunctionCondition(
                                JunctionCondition.JunctionType.OR,
                                parseCondition(expr.getChild(0)),
                                parseCondition(expr.getChild(2)));
                    case "=":
                        return new CompareCondition(
                                CompareType.EQUAL,
                                parseValueDescriptor(expr.getChild(0)),
                                parseValueDescriptor(expr.getChild(2)));
                    case "<>":
                        return new CompareCondition(
                                CompareType.NOT_EQUAL,
                                parseValueDescriptor(expr.getChild(0)),
                                parseValueDescriptor(expr.getChild(2)));
                    case "<":
                        return new CompareCondition(
                                CompareType.LESSER,
                                parseValueDescriptor(expr.getChild(0)),
                                parseValueDescriptor(expr.getChild(2)));
                    case "<=":
                        return new CompareCondition(
                                CompareType.LESSER_OR_EQUAL,
                                parseValueDescriptor(expr.getChild(0)),
                                parseValueDescriptor(expr.getChild(2)));
                    case ">":
                        return new CompareCondition(
                                CompareType.GREATER,
                                parseValueDescriptor(expr.getChild(0)),
                                parseValueDescriptor(expr.getChild(2)));
                    case ">=":
                        return new CompareCondition(
                                CompareType.GREATER_OR_EQUAL,
                                parseValueDescriptor(expr.getChild(0)),
                                parseValueDescriptor(expr.getChild(2)));
                    default:
                        throw new ContextException("Expected Operator but found " + operator);
                }
            case 1:
                return parseCondition(expr.getChild(0));
            default:
                throw new ContextException("Condition is incorrect");
        }
    }

    private IValue parseValueDescriptor(ParseTree expr) throws ContextException
    {

        switch (expr.getChildCount())
        {
            case 1:
                if (expr instanceof SQLiteParser.Literal_valueContext)
                {
                    String value = expr.getText().trim();
                    if (value.startsWith("'"))
                    {
                        return new SingleValueDescriptor(value.subSequence(1, value.length() - 2).toString());
                    }
                    return new SingleValueDescriptor(Integer.parseInt(value));
                } else if (expr instanceof SQLiteParser.Column_nameContext)
                {
                    if (tables.size() != 1)
                    {
                        throw new ContextException("The Column description could not be matched to an exact table");
                    }
                    ColumnDefinition col = new ColumnDefinition(tables.get(0).TableName, expr.getText());
                    if (getResultColumnByNameOrAlias(col.name, col.tableName) == null)
                    {
                        if(!resultColumns.contains(col))
                            extraColumnsForWhere.add(col);
                    }
                    return new ColumnDefinition(col.name, col.tableName);
                }
            case 3:
                ColumnDefinition col = new ColumnDefinition(getTableByNameOrAlias(expr.getChild(0).getText()).TableName, expr.getChild(2).getText());
                if (getResultColumnByNameOrAlias(col.name, col.tableName) == null)
                {
                    if(!resultColumns.contains(col))
                        extraColumnsForWhere.add(col);
                }
                return new ColumnDefinition(col.name, col.tableName);
            default:
                throw new ContextException("Unexpected expression in where clause");
        }
    }

    private void loadGroupClause() throws ContextException
    {
        int i = 0;
        // Find the Group by Clause
        while (!(tree.getChild(i) instanceof SQLiteParser.Select_core_groud_byContext) && tree.getChild(i) != null)
        {
            i++;
        }
        if (tree.getChild(i) == null)
        {
            return;
        }
        // get the initial expr ParseTree
        // Skip the "group" and "by" Terminal Nodes and take the third Child of the group by clause
        ParseTree coltree = tree.getChild(i).getChild(2);
        if (coltree.getChildCount() == 1)
        {
            String colNameOrAlias = coltree.getText().toLowerCase();
            groupByColumn = getResultColumnByNameOrAlias(colNameOrAlias);
        }
        if (coltree.getChildCount() == 3)
        {
            String colNameOrAlias = coltree.getChild(2).getText().toLowerCase();
            String tableNameOrAlias = coltree.getChild(0).getText().toLowerCase();
            groupByColumn = getResultColumnByNameOrAlias(colNameOrAlias, tableNameOrAlias);
        }
        if (tree.getChild(i).getChild(4) != null)
        {
            ParseTree havingExpr = tree.getChild(i).getChild(4).getChild(0);
            CompareCondition cache = (CompareCondition)parseCondition(havingExpr);
            groupByHavingCondition = new HavingCompare(cache.type, (Integer)((SingleValueDescriptor)cache.getRightValues()).Value);
        }
    }

    public Condition getWhere()
    {
        return where;
    }

    public ColumnDefinition getGroupByColumn()
    {
        return groupByColumn;
    }

    public HavingCompare getGroupByHavingCondition()
    {
        return groupByHavingCondition;
    }

    /*public class ResultColumn extends Column
    {

        private int index;
        private String function;

        private ResultColumn(int index)
        {
            setIndex(index);
        }

        private ResultColumn(int index, String name)
        {
            super(name);
            setIndex(index);
        }

        private ResultColumn(int index, String name, String function)
        {
            super(name);
            setIndex(index);
            setFunction(function);
        }

        public String getFunction()
        {
            return function;
        }

        public int getIndex()
        {
            return index;
        }

        protected final void setFunction(String function)
        {
            this.function = function.toLowerCase();
        }

        protected final void setIndex(int index)
        {
            this.index = index;
        }
    }*/
}
