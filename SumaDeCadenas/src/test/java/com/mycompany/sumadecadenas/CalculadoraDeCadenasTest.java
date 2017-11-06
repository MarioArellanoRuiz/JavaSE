/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sumadecadenas;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mario
 */
public class CalculadoraDeCadenasTest {
    
    public CalculadoraDeCadenasTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of addString method, of class CalculadoraDeCadenas.
     */
    @Test
    public void testAddString() {
        System.out.println("addString");
        String cadena = "x,4";
        CalculadoraDeCadenas instance = new CalculadoraDeCadenas();
        Integer expResult = 8;
        Integer result = instance.addString(cadena);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
