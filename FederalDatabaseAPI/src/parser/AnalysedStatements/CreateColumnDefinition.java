package parser.AnalysedStatements;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.antlr.v4.runtime.tree.ParseTree;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import parser.AnalysedStatements.Statement;
import parser.ContextException;
import parser.Walker;

@JsonIgnoreProperties({"tree", "text"})
public class CreateColumnDefinition extends MetaData.ColumnDefinition  implements java.io.Serializable
{
    public static final int TYPE_INT = 0;
    public static final int TYPE_VARCHAR = 1;
    private int type;
    private int typeLength;
    private transient ParseTree tree;

    public CreateColumnDefinition()
    {
    }
    
    public CreateColumnDefinition(String name, String tableName, int type, int typeLength)
    {
        super(name, tableName);
        this.type = type;
        this.typeLength = typeLength;
    }

    public CreateColumnDefinition(ParseTree tree, String tableName) throws ContextException
    {
        super();
        this.tree = tree;
        name = tree.getChild(0).getText();
        this.tableName = tableName;
        if (tree.getChild(1) != null)
        {
            String strtype = tree.getChild(1).getChild(0).getText();
            strtype = strtype.toLowerCase();
            switch (strtype)
            {
                case "varchar":
                    type = TYPE_VARCHAR;
                    break;
                case "integer":
                    type = TYPE_INT;
                    break;
                default:
                    throw new ContextException("Unknown type");
            }
            if (tree.getChild(1).getChild(2) != null)
            {
                typeLength = Integer.parseInt(tree.getChild(1).getChild(2).getText());
            }
        }
    }

    public int getType()
    {
        return type;
    }

    public int getTypeLength()
    {
        return typeLength;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setTableName(String tableName)
    {
        this.tableName = tableName;
    }

    public void setType(int type)
    {
        this.type = type;
    }

    public void setTypeLength(int typeLength)
    {
        this.typeLength = typeLength;
    }

    public String getText()
    {
        String sql = "";
        Walker walker = new Walker(tree, new Walker.IEvents()
        {
            @Override
            public Object nodeFound(ParseTree tree, Object workValue) throws Exception
            {
                return workValue;
            }

            @Override
            public Object finalNodeFound(ParseTree tree, Object workValue) throws Exception
            {
                workValue += tree.getText() + " ";
                return workValue;
            }

            @Override
            public Object finalLiteraFound(String text, Object workValue) throws Exception
            {
                //workValue += tree.getText() + " ";
                return workValue;
            }
        });
        walker.workValue = sql;
        try
        {
            walker.run();
        } catch (Exception ex)
        {
            Logger.getLogger(Statement.class.getName()).log(Level.SEVERE, null, ex);
        }
        return walker.workValue.toString();
    }
}