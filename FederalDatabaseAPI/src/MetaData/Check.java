/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MetaData;

import FederalDB.FedConnection;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Franz Weidmann
 */
public class Check extends Constraint {
    
    
    @Override
    public boolean check(FedConnection fc, List<ColumnValue> cList){
        return true;
    }

}
