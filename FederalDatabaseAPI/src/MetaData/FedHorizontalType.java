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
public class FedHorizontalType extends FedType {
    public CreateStatement.CreateColumnDefinition Column;
    public List<Object> PartationValues;

    public FedHorizontalType() {
        PartationValues = new ArrayList<>();
    }
}
