/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parser;

/**
 *
 * @author Tobias Habermann
 */
public class ContextException extends Exception {
    private String message;

    public ContextException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;//To change body of generated methods, choose Tools | Templates.
    }
    
    
}
