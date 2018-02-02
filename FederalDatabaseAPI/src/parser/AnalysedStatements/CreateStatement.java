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
import MetaData.MetaDataEntry;
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
            if(Statement.IsTerminalNode(tree.getChild(i), SQLiteParser.K_IF)) // Dann würde K_NOT und K_EXISTS kommen ...
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
                ColumnDefinition coldef = new ColumnDefinition(tree.getChild(i), tableName);
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
                    foreignkey.referenceToTable = MetaData.MetaDataManager.MetaManager.getMetaData(contree.getChild(j).getText());
                    j++; // skip tablename
                    j++; // skip "("
                    foreignkey.referenceToColumn = contree.getChild(j).getText();
                    this.tableConstrains.add(foreignkey);
                }
                if(IsTerminalNode(contree.getChild(j), SQLiteParser.K_CHECK))
                {
                    j++; // skip "CHECK" 
                    j++; // skip "("
                    ParseTree expr = contree.getChild(j);
                    if(IsTerminalNode(expr.getChild(1), SQLiteParser.K_BETWEEN))
                    {
                        ColumnDefinition coldef = getColumnDefinitionByName(expr.getChild(0).getText());
                        if(coldef == null)
                            throw new ContextException("Column Definition not found in between statement");
                        TableConstraintBetween between = new TableConstraintBetween(contree, coldef);
                        between.min = expr.getChild(2).getText();
                        between.max = expr.getChild(4).getText();
                        try
                        {
                            between.min = Integer.parseInt(between.min.toString());
                            between.max = Integer.parseInt(between.max.toString());
                        }catch (Exception ex)
                        {}
                        this.tableConstrains.add(between);
                    }
                    if(IsTerminalNode(expr.getChild(1), SQLiteParser.K_IS))
                    {
                        ColumnDefinition coldef = getColumnDefinitionByName(expr.getChild(0).getText());
                        if(coldef == null)
                            throw new ContextException("Column Definition not found in null statement");
                        TableConstraintNullConstraint nullcon = new TableConstraintNullConstraint(contree, coldef);
                        
                        nullcon.isNotNullSet = IsTerminalNode(expr.getChild(2), SQLiteParser.K_NOT);
                        this.tableConstrains.add(nullcon);
                    }
                    else
                    {
                        TableConstraintCompare comparecon = new TableConstraintCompare(contree);
                        comparecon.condition = parseCondition(expr);
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
    
    public interface IColumnDefinition
    {
        public String getName();
        public String getTableName();
    }
    
    public class ForeignColumnDefinition implements IColumnDefinition
    {
        private String name;
        private String tableName;

        public ForeignColumnDefinition(String name, String tableName) {
            this.name = name;
            this.tableName = tableName;
        }

        public String getName() {
            return name;
        }

        public String getTableName() {
            return tableName;
        }
    }
    
    public class ColumnDefinition extends Statement implements IColumnDefinition
    {
        private String name;
        private String tableName;
        private Class type;
        private int typeLength;

        public ColumnDefinition(ParseTree tree, String tableName) throws ContextException {
            super(tree);
            name = tree.getChild(0).getText();
            this.tableName = tableName;
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

        public String getTableName() {
            return tableName;
        }

        public Class getType() {
            return type;
        }

        public int getTypeLength() {
            return typeLength;
        }
    }
    
    public abstract class TableConstraint extends Statement
    {
        private String name;
        public abstract boolean getCanBeLocal();
        public abstract List<IColumnDefinition> getColumns();
        
        public TableConstraint(ParseTree tree) {
            super(tree);
        }

        public String getName() {
            return name;
        }
    }
    
    public class TableConstraintPrimaryKey extends TableConstraint
    {
        private List<IColumnDefinition> primaryKeys;
        
        public TableConstraintPrimaryKey(ParseTree tree) {
            super(tree);
            this.primaryKeys = new ArrayList<>();
        }

        public List<IColumnDefinition> getPrimaryKeys() {
            return primaryKeys;
        }

        @Override
        public boolean getCanBeLocal() {
            return false;
        }

        @Override
        public List<IColumnDefinition> getColumns() {
            return primaryKeys;
        }
    }
    
    public class TableConstraintForeignKey extends TableConstraint
    {
        private ColumnDefinition from;
        private MetaDataEntry referenceToTable;
        private String referenceToColumn;
        
        public TableConstraintForeignKey(ParseTree tree) {
            super(tree);
        }

        public ColumnDefinition getFrom() {
            return from;
        }

        public Object getReferenceTo() {
            return referenceToTable;
        }
        
        @Override
        public boolean getCanBeLocal() {
            return false;
        }
        
        @Override
        public List<IColumnDefinition> getColumns() {
            List<IColumnDefinition> cols = new ArrayList<>();
            cols.add(from);
            ForeignColumnDefinition fcol = new ForeignColumnDefinition(referenceToTable.TableName, referenceToColumn);
            cols.add(fcol);// TODO mach mal hier das in ein ColumnDefinition objekt
            return cols;
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
        
        @Override
        public boolean getCanBeLocal() {
            return true;
        }

        @Override
        public List<IColumnDefinition> getColumns() {
            List<IColumnDefinition> cols = new ArrayList<>();
            cols.add(forColumn);
            return cols;
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

        @Override
        public boolean getCanBeLocal() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public List<IColumnDefinition> getColumns() {
            return null;
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
        
        @Override
        public boolean getCanBeLocal() {
            return true;
        }

        @Override
        public List<IColumnDefinition> getColumns() {
            List<IColumnDefinition> cols = new ArrayList<>();
            cols.add(forColumn);
            return cols;
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
