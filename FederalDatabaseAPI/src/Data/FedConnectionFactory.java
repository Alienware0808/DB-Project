/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import FederalDB.FedConnection;
import FederalDB.FedConnectionEntry;
import FederalDB.FedException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Admin
 */
public final class FedConnectionFactory
{

    private static List<FedConnectionEntry> connections = Collections.synchronizedList(new ArrayList());

    public static void init(FedConnection copy) throws FedException
    {
        for (int i = 0; i < 12; i++)
        {
            connections.add(new FedConnectionEntry(new FedConnection(copy)));
        }
    }

    public static FedConnection give()
    {
        while (true)
        {
            synchronized (connections)
            {
                for (FedConnectionEntry con : connections)
                {
                    if (!con.isUsed)
                    {
                        con.isUsed = true;
                        return con.con;
                    }
                }
            }
            System.err.println("All Connections in use");
        }
    }

    public static void free(FedConnection connection)
    {
        synchronized (connections)
        {
            for (FedConnectionEntry con : connections)
            {
                if (con.con == connection)
                {
                    con.isUsed = false;
                }
            }
        }
    }
}
