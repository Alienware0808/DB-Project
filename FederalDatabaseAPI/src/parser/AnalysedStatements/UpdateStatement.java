/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parser.AnalysedStatements;

import Conditions.ColumnDefinitionDescriptor;
import Conditions.ColumnValueDescriptor;
import Conditions.CompareCondition;
import Conditions.CompareType;
import Conditions.Condition;
import Conditions.JunctionCondition;
import Conditions.SingleValueDescriptor;
import Conditions.ValueDescriptor;
import org.antlr.v4.runtime.tree.ParseTree;
import parser.ContextException;
import parser.SQLiteParser;

/**
 *
 * @author Admin
 */
public class UpdateStatement extends Statement {
    public final Object table;
    public final Object column;
    public final Object valueString;
    public final Condition where;

    public UpdateStatement(ParseTree tree) throws ContextException {
        super(tree);
        table = tree.getChild(1); // TODO read table from metadata via name
        column = tree.getChild(3); // TODO read column from metadata via colname and tablename
        valueString = tree.getChild(5).getText();
        if(IsTerminalNode(tree.getChild(6), SQLiteParser.K_WHERE))
        {
            where = parseCondition(tree.getChild(7));
        }
        else where = null;
    }
    
    private Condition parseCondition(ParseTree expr) throws ContextException
    {
        switch (expr.getChildCount()) {
            case 3:
                String operator = expr.getChild(1).getText().toLowerCase();
                switch(operator)
                {
                    case "and": return new JunctionCondition(
                            JunctionCondition.JunctionType.AND,
                            parseCondition(expr.getChild(0)),
                            parseCondition(expr.getChild(2)));
                    case "or": return new JunctionCondition(
                            JunctionCondition.JunctionType.OR,
                            parseCondition(expr.getChild(0)),
                            parseCondition(expr.getChild(2)));
                    case "=": return new CompareCondition(
                            CompareType.EQUAL,
                            parseValueDescriptor(expr.getChild(0)),
                            parseValueDescriptor(expr.getChild(2)));
                    case "<>": return new CompareCondition(
                            CompareType.NOT_EQUAL,
                            parseValueDescriptor(expr.getChild(0)),
                            parseValueDescriptor(expr.getChild(2)));
                    case "<": return new CompareCondition(
                            CompareType.LESSER,
                            parseValueDescriptor(expr.getChild(0)),
                            parseValueDescriptor(expr.getChild(2)));
                    case "<=": return new CompareCondition(
                            CompareType.LESSER_OR_EQUAL,
                            parseValueDescriptor(expr.getChild(0)),
                            parseValueDescriptor(expr.getChild(2)));
                    case ">": return new CompareCondition(
                            CompareType.GREATER,
                            parseValueDescriptor(expr.getChild(0)),
                            parseValueDescriptor(expr.getChild(2)));
                    case ">=": return new CompareCondition(
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
    
    private ValueDescriptor parseValueDescriptor(ParseTree expr) throws ContextException
    {
        
        switch (expr.getChildCount()) {
            case 1:
                if(expr instanceof SQLiteParser.Literal_valueContext)
                {
                    String value = expr.getText().trim();
                    if(value.startsWith("'"))
                        return new SingleValueDescriptor(value.subSequence(1, value.length()-2).toString());
                    return new SingleValueDescriptor(Integer.parseInt(value));
                }
                else if(expr instanceof SQLiteParser.Column_nameContext)
                {
                    Conditions.ColumnValueDescriptor coldef = null; // TODO get column //getColumnDefinitionByName(expr.getText());
                    if(coldef == null)
                        throw new ContextException("Column Definition not found");
                    return new ColumnValueDescriptor(this.table, ???); // TODO get table name from it
                }
            default:
                throw new ContextException("Unexpected expression in where clause");
        }
    }
}
