/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MetaDummy;

/**
 * Dummy Class for the metadata
 * @author Tobias Habermann
 */
public class TableDescription {
    private String name;
    private Object database;

    public TableDescription(String name) {
        this.name = name.toLowerCase();
    }

    public String getName() {
        return name;
    }
    
    
}
