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
public class FedConnectionEntry
{
    public boolean isUsed;
    public FedConnection con;

    public FedConnectionEntry(FedConnection con)
    {
        this.con = con;
    }
}
