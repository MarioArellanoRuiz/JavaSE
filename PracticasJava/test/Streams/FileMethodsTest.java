/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Streams;

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
public class FileMethodsTest {
    
    public FileMethodsTest() {
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
     * Test of readFile method, of class FileMethods.
     */
    @Test
    public void testReadFile() throws Exception {
        System.out.println("readFile");
        String archivo = "/home/mario/Documents/document2.txt";
        FileMethods.readFile(archivo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readFileManual method, of class FileMethods.
     */
    @Test
    public void testReadFileManual() throws Exception {
        System.out.println("readFileManual");
        String archivo = "/home/mario/Documents/document2.txt";
        FileMethods.readFileManual(archivo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of escribiendoArchivo method, of class FileMethods.
     */
    @Test
    public void testEscribiendoArchivo() {
        System.out.println("escribiendoArchivo");
        String archivo = "/home/mario/Documents/document2.txt";
        FileMethods.escribiendoArchivo(archivo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of serializarObjeto method, of class FileMethods.
     */
    @Test
    public void testSerializarObjeto() {
        System.out.println("serializarObjeto");
        String archivo = "";
        FileMethods.serializarObjeto(archivo);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
