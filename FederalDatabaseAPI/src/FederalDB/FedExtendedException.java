/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FederalDB;

/**
 *
 * @author Admin
 */
public class FedExtendedException extends FedException
{
    private String message;
    
    public FedExtendedException(String message, Throwable cause)
    {
        super(cause);
        this.message = message;
    }

    @Override
    public String getMessage()
    {
        return message + "\n\t\t" + super.getCause().toString(); 
    }

    @Override
    public String toString()
    {
        return message + "\n\t\t" + super.getCause().toString();
    }
}
