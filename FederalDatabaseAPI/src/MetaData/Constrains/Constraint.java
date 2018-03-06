/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MetaData.Constrains;

import Conditions.Condition;
import FederalDB.FedConnection;
import MetaData.ColumnDefinition;
import MetaData.ColumnValue;
import java.util.ArrayList;
import java.util.List;
import org.codehaus.jackson.annotate.JsonSubTypes;
import org.codehaus.jackson.annotate.JsonSubTypes.Type;
import org.codehaus.jackson.annotate.JsonTypeInfo;
import org.codehaus.jackson.annotate.JsonTypeInfo.Id;

/**
 *
 * @author Franz Weidmann
 */
@JsonTypeInfo(use = Id.CLASS,
              include = JsonTypeInfo.As.PROPERTY,
              property = "type")
@JsonSubTypes({
    @Type(value = PrimaryKeyConstraint.class),
    @Type(value = ForeignKeyConstraint.class),
    @Type(value = CheckConstraint.class),
    })
public abstract class Constraint  implements java.io.Serializable
{

    public ArrayList<ColumnDefinition> columns;

    public Constraint()
    {
        columns = new ArrayList<>();
    }

    public abstract boolean checkInsert(FedConnection fedConnection, List<ColumnValue> values)
            throws Exception;

    public abstract boolean checkDelete(FedConnection fedConnection, List<ColumnValue> values)
            throws Exception;

    public abstract boolean checkUpdate(FedConnection fedConnection, List<ColumnValue> values, Condition where)
            throws Exception;
}
