/*
 This class saves all metaDataEntries in a hashmap
with the tablename as its key
 */
package MetaData;

import java.util.HashMap;

/**
 *
 * @author Franz Weidmann
 */
public class MetaDataSet implements java.io.Serializable
{

    /**
     * Do not access!
     */
    public HashMap<String, MetaDataEntry> hashMap;

    public MetaDataSet()
    {
        hashMap = new HashMap<String, MetaDataEntry>();
    }

    public void addEntry(String tableName, MetaDataEntry mdE)
            throws Exception
    {
        if (!hashMap.containsKey(tableName.toLowerCase()))
        {
            hashMap.put(tableName.toLowerCase(), mdE);
        } else
        {
            throw new Exception("Metadata Entry already exists");
        }
    }

    public void deleteEntry(String tableName)
            throws Exception
    {
        MetaDataEntry mdE = hashMap.remove(tableName.toLowerCase());
        if (mdE == null)
        {
            throw new Exception("Metadata Entry not found");
        }
    }

    public MetaDataEntry getEntry(String tableName)
    {
        return hashMap.get(tableName.toLowerCase());
    }

    @Override
    public String toString()
    {
        return hashMap.toString();
    }
}
