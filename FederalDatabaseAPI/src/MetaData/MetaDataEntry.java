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
    public char Type;
    public String Attr1;
    public String Attr2;
    public String Attr3;
    
    public MetaDataEntry(){}
    
    public MetaDataEntry(char type, String[] entry){
        Type = type;
        Attr1 = entry[0];
        Attr2 = entry[1];
        Attr3 = entry[2];
    }
}
