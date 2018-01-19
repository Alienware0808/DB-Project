/*
 * Beinhaltet drei Attribute mit deren man die
    Verteilung der Tabelle auf die Datenbanken
    beschreiben kann.
 */
package MetaData;

/**
 *
 * @author Franz Weidmann
 */
public class MetaDataEntry {
    public String pKey;
    public String Type;
    public String Attr1;
    public String Attr2;
    public String Attr3;
    
    // Describes the foreign keys
    // Second String Array:
    // [x][0] -> Name of the colum
    // [x][1] -> Name of the referenced table
    // [x][2] -> Name of the referenced primary key
    public String[][] ForeignKeys;
    // String array of check strings
    public String[] Checks;
    
    public MetaDataEntry(){}
    
    public MetaDataEntry(String pKey, String type, String[] entry, String[][] FKs, String[] checks){
        this.pKey = pKey;
        Type = type;
        Attr1 = entry[0];
        Attr2 = entry[1];
        Attr3 = entry[2];
        
        ForeignKeys = FKs;
        Checks = checks;
    }
    
    
    public MetaDataEntry(String pKey, String type, String[] entry){
        this.pKey = pKey;
        Type = type;
        Attr1 = entry[0];
        Attr2 = entry[1];
        Attr3 = entry[2];
        
        ForeignKeys = null;
        Checks = null;
    }
}
