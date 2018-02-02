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
    public PrimaryKeys pKey;
    public String Type;
    public String Attr1;
    public String Attr2;
    public String Attr3;
    public String TableName;
    public ForeignKeys ForeignKeys;
    public Checks Checks;
    
    // contructor for empty object
    public MetaDataEntry(){}
    
    // constructor when all values are available
    public MetaDataEntry(PrimaryKeys pKey, String type, String[] entry, ForeignKeys FKs, Checks checks){
        this.pKey = pKey;
        Type = type;
        Attr1 = entry[0];
        Attr2 = entry[1];
        Attr3 = entry[2];
        
        ForeignKeys = FKs;
        Checks = checks;
    }
    
    // constructor when all values are available except foreign keys
    public MetaDataEntry(PrimaryKeys pKey, String type, String[] entry, Checks checks){
        this.pKey = pKey;
        Type = type;
        Attr1 = entry[0];
        Attr2 = entry[1];
        Attr3 = entry[2];
        
        ForeignKeys = null;
        Checks = checks;
    }
    
    // constructor when all values are available except checks
    public MetaDataEntry(PrimaryKeys pKey, String type, String[] entry, ForeignKeys FKs){
        this.pKey = pKey;
        Type = type;
        Attr1 = entry[0];
        Attr2 = entry[1];
        Attr3 = entry[2];
        
        ForeignKeys = FKs;
        Checks = null;
    }
    
    // constructor when all values are available except foreign keys and checks
    public MetaDataEntry(PrimaryKeys pKey, String type, String[] entry){
        this.pKey = pKey;
        Type = type;
        Attr1 = entry[0];
        Attr2 = entry[1];
        Attr3 = entry[2];
        
        ForeignKeys = null;
        Checks = null;
    }
}
