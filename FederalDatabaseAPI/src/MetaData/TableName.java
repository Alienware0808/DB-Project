/*
 This is the key for the metaData hasmap
 */
package MetaData;

/**
 *
 * @author Franz Weidmann
 */
public class TableName {
    
    private String tableName;
    
    public TableName(String tableName){
        this.tableName = tableName.toLowerCase();
    }
    
    @Override
    public int hashCode(){
        return tableName.hashCode();
    }
    
    @Override
    public boolean equals(Object obj){
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        TableName other = (TableName) obj;
        return tableName.equals(other.tableName);
    }
}
