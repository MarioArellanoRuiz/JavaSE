/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Streams;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.Month;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mario
 */
public class FileMethods {
    
    static public void readFile(String archivo) throws IOException {
        try {
            BufferedReader bfrd= new BufferedReader(
                    new FileReader(archivo)
            );
            
            String s= new String();
            String s2 =new String();
            while((s=bfrd.readLine())!=null){
                System.out.println(s);
        }
        } catch (IOException ex) {
        }
    }
    
    static public void readFileManual(String archivo) throws IOException {
        try {
            BufferedReader bfrd= new BufferedReader(
                    new FileReader(archivo)
            );
            System.out.println("Introdusca la lina que desea leer:");
            Scanner scaner = new Scanner(System.in);
            int line = scaner.nextInt()-1;
            Object[] a = bfrd.lines().toArray();
            System.out.println(a[line]);
            
        } catch (IOException ex) {
        }
    }
    
    static public void escribiendoArchivo(String archivo){
        String [] datos = {"Que", "Pedro", "Juan"};
        
        try {
            PrintWriter miPrintWriter = new PrintWriter(
                    new BufferedWriter(new FileWriter(archivo, true)));
            int lineaC = 1;
            
            for (int i = 0; i < datos.length; i++) {
                    //miPrintWriter.println(datos[i]);
                    //miPrintWriter.append(datos[i]);
                    //miPrintWriter.write(datos[i]+"\n");
                    miPrintWriter.append(datos[i]+"\n");
                    
                }
            miPrintWriter.close();
        } catch (IOException ex) {
            
        }
        
    }
    static void serializarObjeto(String archivo){
        try {
            FileOutputStream salida = new FileOutputStream(archivo);
            ObjectOutputStream oSt = new ObjectOutputStream(salida);
            oSt.writeObject(LocalDate.now());
            oSt.close();
            //LocalDate.of(0, Month.MARCH, 0);
           
        } catch (IOException ex) {
            
        }
        
    }
}
