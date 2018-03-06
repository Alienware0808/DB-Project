/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MetaData;

import java.util.ArrayList;
import java.util.List;
import parser.AnalysedStatements.CreateColumnDefinition;

/**
 *
 * @author Admin
 */
public class FedVerticalType extends FedType  implements java.io.Serializable
{
    public List<List<CreateColumnDefinition>> DistributionList;

    public FedVerticalType(List<List<CreateColumnDefinition>> DistributionList)
    {
        this.DistributionList = DistributionList;
    }

    public int getDatabaseForColumn(ColumnDefinition coldef)
    {
        for (int i = 0; i < DistributionList.size(); i++)
        {
            for (CreateColumnDefinition crcol : DistributionList.get(i))
            {
                if (crcol.equals(coldef))
                {
                    return i;
                }
            }
        }
        return -1;
    }

    @Override
    public int getDatabaseCount()
    {
        return DistributionList.size();
    }
    
    
}
