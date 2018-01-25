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
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestMETA {
    public static void main(String[] args){
        System.out.println("Starting MetaData test...");
        
        MetaDataManager MM = new MetaDataManager("C:/users/Smile/Desktop/metaDaten.json");
        try {
            String[][] fKeys = {{"age","ageR", "12"},{"age", "ageRR", "22"}};
            String[] checks = {"greater than 1"};
            MetaDataEntry mdE = new MetaDataEntry("1", "h", "age", "22", "44", fKey, checks);
            MM.saveMetaData("C:/users/Smile/Desktop/metaDaten.json");
        } catch (Exception ex) {
            System.out.println("Error saving MetaManager! "+ex.toString());
        }
        
        System.out.println("Finished MetaData test...");

    }
}
