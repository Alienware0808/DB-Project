/*
 This class defines the entry of a metadata according to this rules:
Structure:
(ID, TABLENAME, TYPE, ATTR1, ATTR2, ATTR3)

Horizontal: TYPE=Type of entry, ATTR1=Rowname, ATTR2=Value1, ATTR3=Value2

Example: HORIZONTAL(Age(80,90))
=> TYPE=0, ATTR1="Age", ATTR2="80", ATTR3="90"

Vertical: TYPE=Type of entry, ATTR1=Rowname(s)1, ATTR2=Rowname(s)2, ATTR3=Rowname(s)3

Example: VERTICAL((ID,AGE), (HOUSENUMBER, COUNTY), (DATE, STEET))
=> TYPE=1, ATTR1="ID, AGE", ATTR2="HOUSENUMBER, COUNTY", ATTR3="DATE, STEET"
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
    
    // contructor for empty object
    public MetaDataEntry(){}
    
    // constructor when all values are available
    public MetaDataEntry(String pKey, String type, String[] entry, String[][] FKs, String[] checks){
        this.pKey = pKey;
        Type = type;
        Attr1 = entry[0];
        Attr2 = entry[1];
        Attr3 = entry[2];
        
        ForeignKeys = FKs;
        Checks = checks;
    }
    
    // constructor when all values are available except foreign keys
    public MetaDataEntry(String pKey, String type, String[] entry, String[] checks){
        this.pKey = pKey;
        Type = type;
        Attr1 = entry[0];
        Attr2 = entry[1];
        Attr3 = entry[2];
        
        ForeignKeys = null;
        Checks = checks;
    }
    
    // constructor when all values are available except checks
    public MetaDataEntry(String pKey, String type, String[] entry, String[][] FKs){
        this.pKey = pKey;
        Type = type;
        Attr1 = entry[0];
        Attr2 = entry[1];
        Attr3 = entry[2];
        
        ForeignKeys = FKs;
        Checks = null;
    }
    
    // constructor when all values are available except foreign keys and checks
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
