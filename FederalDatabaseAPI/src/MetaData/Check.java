/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MetaData;

import FederalDB.FedConnection;
import java.util.ArrayList;

/**
 *
 * @author Franz Weidmann
 */
public class Check extends Constraint {
    
    
    @Override
    public boolean check(FedConnection fc, ArrayList<ColumnValue> cList){
        return true;
    }

}
