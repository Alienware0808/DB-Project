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
import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.util.ArrayList;
import java.util.List;
import org.antlr.v4.runtime.tree.ParseTree;
import parser.ContextException;
import parser.SQLiteParser;

/**
 *
 * @author Tobias Habermann
 */
public class CreateStatement extends Statement {
    public String tableName;
    public boolean isIfNotExistContained;
    public final List<TableConstraint> tableConstrains;
    public final List<ColumnDefinition> columnDefinitions;
    public Object fedStatement;
    
    public CreateStatement(ParseTree tree) throws ContextException {
        super(tree);
        int i = 0;
        
        isIfNotExistContained = false;
        columnDefinitions = new ArrayList<>();
        tableConstrains = new ArrayList<>();
        
        while(!(tree.getChild(i) instanceof  SQLiteParser.Column_defContext))
        {
            if(IsTerminalNode(tree.getChild(i), SQLiteParser.K_IF)) // Dann würde K_NOT und K_EXISTS kommen ...
                isIfNotExistContained = true;
            else if(tree.getChild(i) instanceof SQLiteParser.Table_nameContext)
                tableName = tree.getChild(i).getText();
            i++;
        }
        
        for(; i < tree.getChildCount(); i++)
        {
            if(tree.getChild(i) instanceof SQLiteParser.Table_constraintContext)
                break;
            if(tree.getChild(i) instanceof SQLiteParser.Column_defContext)
            {
                ColumnDefinition coldef = new ColumnDefinition(tree.getChild(i));
                coldef.name = tree.getChild(i).getChild(0).getText();
                ParseTree typethingi = tree.getChild(i).getChild(1);
                String typestr = typethingi.getChild(0).getText().toLowerCase();
                switch (typestr) {
                    case "varchar": coldef.type = String.class;
                    break;
                    case "integer": coldef.type = Integer.class;
                    break;
                    case "int": coldef.type = Integer.class;
                    break;
                    default:
                        throw new ContextException("Unkown Collumn Type");
                }
                if(typethingi.getChild(2) != null)
                    coldef.typeLength = Integer.parseInt(typethingi.getChild(2).getText());
                columnDefinitions.add(coldef);
            }
        }
         for(; i < tree.getChildCount(); i++)
        {
            if(tree.getChild(i) instanceof SQLiteParser.Federal_stmtContext)
                break;
            if(tree.getChild(i) instanceof SQLiteParser.Table_constraintContext)
            {
                ParseTree contree = tree.getChild(i);
                int j = 1;
                String constraint_name = null;
                if(contree.getChild(j) instanceof SQLiteParser.NameContext)
                {
                    constraint_name = contree.getChild(j).getText();
                    j++;
                }
                if(IsTerminalNode(contree.getChild(j), SQLiteParser.K_PRIMARY))
                {
                    TableConstraintPrimaryKey primkey =  new TableConstraintPrimaryKey(contree);
                    j++; // skip "PRIMARY" 
                    j++; // skip "KEY"
                    j++; // skip "("
                    for(; j < contree.getChildCount(); j++)
                    {
                        if(contree.getChild(j).getText().equals(")"))
                            break;
                        if(contree.getChild(j) instanceof SQLiteParser.Indexed_columnContext)
                        {
                            ColumnDefinition coldef = getColumnDefinitionByName(contree.getChild(j).getText());
                            if(coldef == null)
                                throw new ContextException("Column not found");
                            primkey.primaryKeys.add(coldef);
                        }
                    }
                    this.tableConstrains.add(primkey);
                }
                if(IsTerminalNode(contree.getChild(j), SQLiteParser.K_FOREIGN))
                {
                    TableConstraintForeignKey foreignkey =  new TableConstraintForeignKey(contree);
                    j++; // skip "FOREIGN" 
                    j++; // skip "KEY"
                    j++; // skip "("
                    foreignkey.from = getColumnDefinitionByName(contree.getChild(j).getText());
                    j++;
                    j++; // skip ")"
                    j++; // skip "references"
                    foreignkey.referenceTo = "Unknown"; // TODO getMetadataForColumn(contree.getChild(j).getText());
                    this.tableConstrains.add(foreignkey);
                }
                if(IsTerminalNode(contree.getChild(j), SQLiteParser.K_CHECK))
                {
                    j++; // skip "CHECK" 
                    j++; // skip "("
                    if(IsTerminalNode(contree.getChild(j+1), SQLiteParser.K_BETWEEN))
                    {
                        ColumnDefinition coldef = getColumnDefinitionByName(contree.getChild(j).getText());
                        if(coldef == null)
                            throw new ContextException("Column Definition not found in between statement");
                        TableConstraintBetween between = new TableConstraintBetween(contree, coldef);
                        j++;
                        j++; // skip "BETWEEN"
                        between.min = contree.getChild(j).getText();
                        between.max = contree.getChild(j+2).getText();
                        try
                        {
                            between.min = Integer.parseInt(between.min.toString());
                            between.max = Integer.parseInt(between.max.toString());
                        }catch (Exception ex)
                        {}
                        this.tableConstrains.add(between);
                    }
                    if(IsTerminalNode(contree.getChild(j+1), SQLiteParser.K_IS))
                    {
                        ColumnDefinition coldef = getColumnDefinitionByName(contree.getChild(j).getText());
                        if(coldef == null)
                            throw new ContextException("Column Definition not found in null statement");
                        TableConstraintNullConstraint nullcon = new TableConstraintNullConstraint(contree, coldef);
                        j++;
                        j++; // skip "IS"
                        nullcon.isNotNullSet = IsTerminalNode(contree.getChild(j), SQLiteParser.K_NOT);
                        this.tableConstrains.add(nullcon);
                    }
                    else
                    {
                        TableConstraintCompare comparecon = new TableConstraintCompare(contree);
                        comparecon.condition = parseCondition(contree.getChild(j));
                        this.tableConstrains.add(comparecon);
                    }
                }
            }
        }
        for(; i < tree.getChildCount(); i++)
        {
            if(tree.getChild(i) instanceof SQLiteParser.Federal_stmtContext)
            {
                ParseTree fedtree = tree.getChild(i).getChild(0);
                if(fedtree instanceof SQLiteParser.Fed_horizontal_stmtContext)
                {
                    ColumnDefinition coldef = getColumnDefinitionByName(fedtree.getChild(2).getText());
                    if(coldef == null)
                        throw new ContextException("Column Definition not found");
                    FedHorizontal hori = new FedHorizontal(coldef);
                    ParseTree attr = fedtree.getChild(4); // fed_horizontal_attr_list
                    for(int k = 0; k < attr.getChildCount(); k++)
                    {
                        if(attr.getChild(k) instanceof SQLiteParser.Fed_horizontal_attrContext)
                        {
                            String attrstr = attr.getChild(k).getText();
                            if(attrstr.startsWith("'"))
                            {
                                attrstr = attrstr.replace("'","");
                                hori.intervall.add(attrstr);
                            }
                            else hori.intervall.add(Integer.parseInt(attrstr));
                        }
                    }
                    fedStatement = hori;
                }
                else if(fedtree instanceof SQLiteParser.Fed_vertical_stmtContext)
                {
                    FedVertical vert = new FedVertical();
                    for(int k = 1; k < fedtree.getChildCount();k++)
                    {
                        if(fedtree.getChild(k) instanceof SQLiteParser.Fed_vertical_attrContext)
                        {
                            ParseTree portion = fedtree.getChild(k);
                            List<ColumnDefinition> dislist = new ArrayList<>();
                            for(int n = 0; n < portion.getChildCount(); n++)
                            {
                                if(portion.getChild(n) instanceof SQLiteParser.Column_nameContext)
                                {
                                    ColumnDefinition coldef = getColumnDefinitionByName(portion.getChild(n).getText());
                                    if(coldef == null)
                                        throw new ContextException("Column not found in Fed definition");
                                    dislist.add(coldef);
                                }
                            }
                            vert.distributionLists.add(dislist);
                        }
                    }
                    fedStatement = vert;
                }
            }
        }
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
                    ColumnDefinition coldef = getColumnDefinitionByName(expr.getText());
                    if(coldef == null)
                        throw new ContextException("Column Definition not found");
                    return new ColumnDefinitionDescriptor(coldef);
                }
            default:
                throw new ContextException("Unexpected expression in where clause");
        }
    }
    
    public ColumnDefinition getColumnDefinitionByName(String name)
    {
        for (ColumnDefinition col : this.columnDefinitions) {
            if(col.name.equals(name))
                return col;
        }
        return null;
    }
    
    public class ColumnDefinition extends Statement
    {
        private String name;
        private Class type;
        private int typeLength;

        public ColumnDefinition(ParseTree tree) throws ContextException {
            super(tree);
            name = tree.getChild(0).getText();
            if(tree.getChild(1) != null)
            {
                String strtype = tree.getChild(1).getChild(0).getText();
                strtype = strtype.toLowerCase();
                switch(strtype)
                {
                    case "varchar": type = String.class;
                    break;
                    case "integer": type = Integer.class;
                    break;
                    default:
                        throw new ContextException("Unknown type");
                }
                if(tree.getChild(1).getChild(2) != null)
                    typeLength = Integer.parseInt(tree.getChild(1).getChild(2).getText());
            }
        }

        public String getName() {
            return name;
        }

        public Class getType() {
            return type;
        }

        public int getTypeLength() {
            return typeLength;
        }
    }
    
    public class TableConstraint extends Statement
    {
        private String name;
        
        public TableConstraint(ParseTree tree) {
            super(tree);
        }

        public String getName() {
            return name;
        }
    }
    
    public class TableConstraintPrimaryKey extends TableConstraint
    {
        private List<ColumnDefinition> primaryKeys;
        
        public TableConstraintPrimaryKey(ParseTree tree) {
            super(tree);
            this.primaryKeys = new ArrayList<>();
        }

        public List<ColumnDefinition> getPrimaryKeys() {
            return primaryKeys;
        }
    }
    
    public class TableConstraintForeignKey extends TableConstraint
    {
        private ColumnDefinition from;
        private Object referenceTo;
        
        public TableConstraintForeignKey(ParseTree tree) {
            super(tree);
        }

        public ColumnDefinition getFrom() {
            return from;
        }

        public Object getReferenceTo() {
            return referenceTo;
        }
    }
    
    public class TableConstraintNullConstraint extends TableConstraint
    {
        private boolean isNotNullSet;
        private ColumnDefinition forColumn;
        
        public TableConstraintNullConstraint(ParseTree tree, 
                ColumnDefinition forColumn) {
            super(tree);
            this.forColumn = forColumn;
        }

        public ColumnDefinition getForColumn() {
            return forColumn;
        }

        public boolean isIsNotNullSet() {
            return isNotNullSet;
        }
    }
    
    public class TableConstraintCompare extends TableConstraint
    {
        private Condition condition;
        
        public TableConstraintCompare(ParseTree tree) {
            super(tree);
        }

        public Condition getCondition() {
            return condition;
        }
    }
    
    public class TableConstraintBetween extends TableConstraint
    {
        private ColumnDefinition forColumn;
        private Object min;
        private Object max;
        
        public TableConstraintBetween(ParseTree tree, 
                ColumnDefinition forColumn) {
            super(tree);
            this.forColumn = forColumn;
        }

        public ColumnDefinition getForColumn() {
            return forColumn;
        }

        public Object getMax() {
            return max;
        }

        public Object getMin() {
            return min;
        }
    }
    
    public class FedHorizontal
    {
        private ColumnDefinition column;
        private List<Object> intervall;
        
        private FedHorizontal(ColumnDefinition column)
        {
            this.column = column;
            intervall = new ArrayList<>();
        }

        public ColumnDefinition getColumn() {
            return column;
        }

        public List<Object> getIntervall() {
            return intervall;
        }
        
        
    }
    
    public class FedVertical
    {
        private List<List<ColumnDefinition>> distributionLists;
        
        private FedVertical()
        {
            distributionLists = new ArrayList<>();
        }

        public List<List<ColumnDefinition>> getDistributionLists() {
            return distributionLists;
        }
    }
}
