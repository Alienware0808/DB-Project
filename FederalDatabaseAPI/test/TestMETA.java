/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Franz Weidmann
 */

import MetaData.*;

public class TestMETA {
    public static void main(String[] args){
        System.out.println("Starting MetaData test...");
        String metaDataPath = "C:/users/Smile/Desktop/metaDaten.json";
        MetaDataManager MM = new MetaDataManager(metaDataPath);
        String[][] fKeys = {{"age","ageR", "12"},{"age", "ageRR", "22"}};
        String[] checks = {"greater than 1"};
        String[] attrs = {"age", "22", "44"};
        MM.newMetaData("Person", new MetaDataEntry("1", "h", attrs, fKeys, checks));
        MM.newMetaData("Animal", new MetaDataEntry("2", "h", attrs, fKeys, checks));
        
        System.out.println(MM.getMetaData("Animal").toString());
        MM.deleteMetaData("Animal");
        
        try {
            MM.saveMetaData();
        } catch (Exception ex) {
            System.out.println("Error saving MetaManager! "+ex.getMessage());
        }
        
        System.out.println("Finished MetaData test...");

    }
}
