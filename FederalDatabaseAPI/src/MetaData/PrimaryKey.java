/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MetaData;

import Data.FedHelper;
import FederalDB.FedConnection;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Franz Weidmann
 */
public class PrimaryKey extends Constraint {
    
    
    @Override
    public boolean check(FedConnection fedConnection, List<ColumnValue> values){
        return true;
    }

}
