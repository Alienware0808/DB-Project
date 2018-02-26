/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MetaData.Constrains;

import FederalDB.FedConnection;
import MetaData.ColumnDefinition;
import MetaData.ColumnValue;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Franz Weidmann
 */

public abstract class Constraint {
    public ArrayList<ColumnDefinition> columns;
    
    public Constraint(){
        columns = new ArrayList<>();
    }
    
    public abstract boolean check(FedConnection fedConnection, List<ColumnValue> values)
            throws Exception;
}
