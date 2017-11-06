
package Streams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //readFile("/home/mario/Documents/document.txt");
        //FileMethods.readFile("/home/mario/Documents/document.txt");
        //FileMethods.readFileManual("/home/mario/Documents/document.txt");
        FileMethods.escribiendoArchivo("/home/mario/Documents/document2.txt");
        FileMethods.serializarObjeto("/home/mario/Documents/document3.txt");
    }
    
    
}
