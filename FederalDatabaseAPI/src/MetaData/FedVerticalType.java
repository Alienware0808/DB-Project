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
public class FedVerticalType extends FedType {
    public List<List<CreateStatement.CreateColumnDefinition>> DistributionList;
    
    public FedVerticalType()
    {
        DistributionList = new ArrayList<>();
    }
}
