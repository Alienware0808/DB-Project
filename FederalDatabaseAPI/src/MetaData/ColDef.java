/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MetaData;

/**
 *
 * @author Franz Weidmann
 */
public class ColDef {
    public String colName;
    public String tableName;
    public Object value;
    
    public ColDef(String cN, String tN, Object val){
        colName = cN;
        tableName = tN;
        value = val;
    }
}
