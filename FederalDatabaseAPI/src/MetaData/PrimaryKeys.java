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
public class PrimaryKeys extends Constraints {
    
    
    @Override
    public boolean check(FedConnection fc, ArrayList<ColDef> cList){
        return true;
    }

}
