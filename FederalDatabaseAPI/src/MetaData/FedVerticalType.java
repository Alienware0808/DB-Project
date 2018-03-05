/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MetaData;

import java.util.ArrayList;
import java.util.List;
import parser.AnalysedStatements.CreateStatement;

/**
 *
 * @author Admin
 */
public class FedVerticalType extends FedType
{
    public List<List<CreateStatement.CreateColumnDefinition>> DistributionList;

    public FedVerticalType(List<List<CreateStatement.CreateColumnDefinition>> DistributionList)
    {
        this.DistributionList = DistributionList;
    }

    public int getDatabaseForColumn(ColumnDefinition coldef)
    {
        for (int i = 0; i < DistributionList.size(); i++)
        {
            for (CreateStatement.CreateColumnDefinition crcol : DistributionList.get(i))
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
