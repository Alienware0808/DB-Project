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

public abstract class Constraints {
    public ArrayList<ColDef> constraints;
    
    public Constraints(){
        
    }
    
    public void addColDef(ColDef cd){
        constraints.add(cd);
    }
    
    // TODO: with what value to delete an entry?
    public boolean removeColDef(ColDef cd){
        return constraints.remove(cd);
    }
    
    public abstract boolean check(FedConnection fc, ArrayList<ColDef> cList);
    
    
}
