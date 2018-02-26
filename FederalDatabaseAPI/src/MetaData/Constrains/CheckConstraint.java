/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MetaData.Constrains;

import FederalDB.FedConnection;
import MetaData.ColumnValue;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Franz Weidmann
 */
public class CheckConstraint extends Constraint {
    
    @Override
    public boolean check(FedConnection fedConnection, List<ColumnValue> columnValues){
        return true;
    }

}
