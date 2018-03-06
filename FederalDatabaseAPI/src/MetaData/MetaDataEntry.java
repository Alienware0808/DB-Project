package MetaData;

import MetaData.Constrains.PrimaryKeyConstraint;
import MetaData.Constrains.Constraint;
import java.util.ArrayList;
import java.util.List;
import parser.AnalysedStatements.CreateColumnDefinition;

/**
 *
 * @author Franz Weidmann
 */
public class MetaDataEntry  implements java.io.Serializable
{

    public String TableName;
    public List<CreateColumnDefinition> Columns;
    public List<Constraint> constraints;
    public FedType FedType;

    public MetaDataEntry()
    {
        Columns = new ArrayList<>();
        constraints = new ArrayList<>();
    }

    public MetaDataEntry(String TableName,
            List<CreateColumnDefinition> Columns,
            List<Constraint> constraints, FedType FedType)
    {
        this.TableName = TableName;
        this.Columns = Columns;
        this.constraints = constraints;
        this.FedType = FedType;
    }

    public PrimaryKeyConstraint getPrimaryKeyConstraint()
    {
        for (Constraint c : constraints)
        {
            if (c instanceof PrimaryKeyConstraint)
            {
                return (PrimaryKeyConstraint) c;
            }
        }
        return null;
    }
}
