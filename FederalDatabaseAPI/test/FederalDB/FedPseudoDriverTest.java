/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FederalDB;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author svwer
 */
public class FedPseudoDriverTest
{
    
    public FedPseudoDriverTest()
    {
    }
    
    @BeforeClass
    public static void setUpClass()
    {
    }
    
    @AfterClass
    public static void tearDownClass()
    {
    }
    
    @Before
    public void setUp()
    {
    }
    
    @After
    public void tearDown()
    {
    }

    /**
     * Test of main method, of class FedPseudoDriver.
     */
    @org.junit.Test
    public void testMain()
    {
        System.out.println("main");
        String[] args = null;
        FedPseudoDriver.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getConnection method, of class FedPseudoDriver.
     */
    @org.junit.Test
    public void testGetConnection()
    {
        System.out.println("getConnection");
        String username = "";
        String password = "";
        FedPseudoDriver instance = new FedPseudoDriver();
        FedConnection expResult = null;
        FedConnection result = instance.getConnection(username, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
