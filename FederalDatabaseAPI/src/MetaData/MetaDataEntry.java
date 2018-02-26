package MetaData;

import MetaData.Constrains.PrimaryKeyConstraint;
import MetaData.Constrains.Constraint;
import java.util.ArrayList;
import java.util.List;
import parser.AnalysedStatements.CreateStatement;

/**
 *
 * @author Franz Weidmann
 */
public class MetaDataEntry {

    public String TableName;
    public List<CreateStatement.CreateColumnDefinition> Columns;
    public PrimaryKeyConstraint PrimaryKeyContraint;
    public List<Constraint> constraints;
    public FedType FedType;

    public MetaDataEntry() {
        Columns = new ArrayList<>();
        constraints = new ArrayList<>();
    }

    public MetaDataEntry(String TableName,
            List<CreateStatement.CreateColumnDefinition> Columns, 
            PrimaryKeyConstraint PrimaryKeyContraint,
            List<Constraint> constraints, FedType FedType) {
        this.TableName = TableName;
        this.Columns = Columns;
        this.PrimaryKeyContraint = PrimaryKeyContraint;
        this.constraints = constraints;
        this.FedType = FedType;
    }
}
