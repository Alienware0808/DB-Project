/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parser.AnalysedStatements;

import Conditions.CompareCondition;
import Conditions.CompareType;
import Conditions.Condition;
import Conditions.IValue;
import Conditions.JunctionCondition;
import Conditions.SingleValueDescriptor;
import FederalDB.FedConnection;
import MetaData.ColumnDefinition;
import MetaData.MetaDataEntry;
import org.antlr.v4.runtime.tree.ParseTree;
import static parser.AnalysedStatements.Statement.IsTerminalNode;
import parser.ContextException;
import parser.SQLiteParser;

/**
 *
 * @author Admin
 */
public class DeleteStatement extends Statement
{

    public final MetaDataEntry table;
    public final Condition where;
    private FedConnection fedConnection;

    public DeleteStatement(ParseTree tree, FedConnection fedConnection) throws ContextException
    {
        super(tree);
        this.fedConnection = fedConnection;
        table = fedConnection.metaDataManger.getTableMetaData(tree.getChild(2).getText()); 
        if (IsTerminalNode(tree.getChild(3), SQLiteParser.K_WHERE))
        {
            where = parseCondition(tree.getChild(4));
        } else
        {
            where = null;
        }
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
                if (expr instanceof SQLiteParser.Literal_valueContext ||
                    expr.getChild(0) instanceof SQLiteParser.Literal_valueContext)
                {
                    String value = expr.getText().trim();
                    if (value.startsWith("'"))
                    {
                        return new SingleValueDescriptor(value.subSequence(1, value.length() - 1).toString());
                    }
                    return new SingleValueDescriptor(Integer.parseInt(value));
                } else if (expr instanceof SQLiteParser.Column_nameContext || 
                           expr.getChild(0) instanceof SQLiteParser.Column_nameContext)
                {
//                    Conditions.ColumnValueDescriptor coldef = null; // TODO get column //getColumnDefinitionByName(expr.getText());
//                    if(coldef == null)
//                        throw new ContextException("Column Definition not found");
                    return new ColumnDefinition(expr.getText(), this.table.TableName);
                }
            default:
                throw new ContextException("Unexpected expression in where clause");
        }
    }
}

