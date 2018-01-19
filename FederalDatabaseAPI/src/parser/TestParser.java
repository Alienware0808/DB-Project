/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parser;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tobias Habermann
 */
public class TestParser {
    public static void main(String[] args) {
        
        // seLeCt * from mytable;create table lol (name varchar);update loltable set name = 'asd' where id = 10
        // 
        try {
            SQLStatement.parseString("alter session set nls_date_format = 'DD-MON-YYYY';");
        } catch (Exception ex) {
            Logger.getLogger(TestParser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
