/*
 * Diese Klasse verwaltet die Metadaten welche genutzt
    werden um die horizontale oder vertikale Verteilung 
    auf die Datenbanken zu ermöglichen.
 */
package MetaData;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 *
 * @author Franz Weidmann
 */
public class MetaDataManager {
    private MetaDataSet metaDataSet;
    
    public MetaDataManager(String metaDataFilePath){
        String metaFileString;
        try{
            metaFileString = Files.lines(Paths.get(metaDataFilePath), StandardCharsets.UTF_8).toString();
        }catch(Exception e){
            System.out.println("There is no metaData File. Dummy String is returned.");
            metaFileString = "{'DataSet':{'table1':{'Type':'h','attr1':'age','attr2':'22', 'attr3':'77'}, 'table2':{'Type':'h', attr1':'age','attr2':'22', 'attr3':'77'}}}";
        }
        metaDataSet = new GsonBuilder().create().fromJson(metaFileString, MetaDataSet.class);
        
        System.out.println("MetaData read: "+metaDataSet.toString());
    }
    
    // Creates a new MetaData entry
    // parameter is string which contains 
    // all relevant values seperated by ".@."
    // indices:
    // 0 -> tablename, 1 -> pKey, 2 -> type, 3 -> attr1
    // 4 -> attr2, 5 -> attr3
    public void newMetaData(String distribution, String[][] fKeys, String[] checks){
        String[] ps = distribution.split(".@.");
        MetaDataEntry mdE = new MetaDataEntry();
        mdE.pKey = ps[1];
        mdE.Type = ps[2];
        mdE.Attr1 = ps[3];
        mdE.Attr2 = ps[4];
        mdE.Attr3 = ps[5];
        mdE.ForeignKeys = fKeys;
        mdE.Checks = checks;
        
        metaDataSet.addEntry(ps[0], mdE);
    }
    
    public void deleteMetaData(String tableName){
        metaDataSet.deleteEntry(tableName);
    }
    
    // returns array which describes the distribution
    // of the table on the three databases
    // array:
    // [0] = type
    // [1] = db1, [2] = db2, [3] = db3
    // values are either for horizontal the colum name plus min and
    // max integer values or for vertical the colum names
    // 5 -> foreignKeys as a String:= (columName, foreignTablename, foreignPKey)
    // 6 -> checks, String seperated by comma
    public String[][] getDistribution(String tableName){
        MetaDataEntry mdE = metaDataSet.getEntry(tableName);
        
        String attr1 = mdE.Type.equals("h") ? getMinMaxValues(1, mdE) : mdE.Attr1;
        String attr2 = mdE.Type.equals("h") ? getMinMaxValues(2, mdE) : mdE.Attr2;
        String attr3 = mdE.Type.equals("h") ? getMinMaxValues(3, mdE) : mdE.Attr3;

        String[] fKeys = new String[mdE.ForeignKeys.length];
        for(int i=0; i < mdE.ForeignKeys.length;i++){
            fKeys[i] = mdE.ForeignKeys[i][0]+","+mdE.ForeignKeys[i][1]+","+mdE.ForeignKeys[i][2];
        }
                
        String[][] distr = new String[][]{
            {mdE.Type},
            {attr1, attr2, attr3},
            fKeys,
            mdE.Checks
        };
        return distr;
    }
    
    private String getMinMaxValues(int index, MetaDataEntry entry){
        String minMax;
        
        switch(index){
            case 1:
                minMax = entry.Attr1+",0,"+entry.Attr2;
                break;
            case 2:
                minMax = entry.Attr1+","+entry.Attr2+","+entry.Attr3;
                break;
            case 3:
                minMax = entry.Attr1+","+entry.Attr3+","+"9999999999999999";
                break;
            default:
                minMax = null;
        }
        
        return minMax;
    }
    
    // to save the JavaObject of the metaData onto the file
    public void saveMetaData(String metaDataFilePath) throws Exception {
        String metaDataString = new GsonBuilder().create().toJson(metaDataSet);
        FileWriter fileWriter = new FileWriter(metaDataFilePath);
        PrintWriter printWriter = new PrintWriter(fileWriter);
        printWriter.print(metaDataString);
        printWriter.close();
        System.out.println("MetaData successfully saved to "+metaDataFilePath+"!");
    }
}
