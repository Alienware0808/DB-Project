package Conditions;

import FederalDB.FedException;
import MetaData.ColumnDefinition;
import ResultSetManagment.FedResultSetExtendedInterface;
import java.util.ArrayList;
import java.util.List;
import javafx.collections.transformation.SortedList;

/**
 *
 * @author Tobias Habermann
 */
public class HavingCompare
{

    public final CompareType type;
    private int rightValue;

    public HavingCompare(CompareType type, int rightValue)
    {
        this.type = type;
        this.rightValue = rightValue;
    }

    public HavingCompare(CompareType type)
    {
        this.type = type;
    }

    public boolean execute(int count)
    {
        switch (type)
        {
            case EQUAL: return count == rightValue;
            case NOT_EQUAL: return count != rightValue;
            case GREATER: return count > rightValue;
            case LESSER: return count < rightValue;
            case GREATER_OR_EQUAL: return count >= rightValue;
            case LESSER_OR_EQUAL: return count <= rightValue;
            default: return true;
        }
    }
}
