/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SuperMercado;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author mario
 */
public class EstructurasDatos {
    public static void main(String[] args) {
        
        //hashMap
        HashMap<Integer, String> miMapa = new HashMap<>();
        miMapa.put(100, "Chana");
        miMapa.put(101, "Juana");
        miMapa.put(102, "Primitivo");
        
        
        for (Map.Entry<Integer, String> entry : miMapa.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+" "+value);
        }
        
        //Hastable
        
        Hashtable<Integer,String> miTabla = new Hashtable();
        miTabla.put(100, "Chana");
        miTabla.put(101, "Juana");
        miTabla.put(102, "Primitivo");
        
        for (Map.Entry<Integer, String> entry : miTabla.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+" "+value);
            
        }
        
        Scanner s = new Scanner(System.in);
        System.out.println("Introdusca algo:");                
        int a = s.nextInt();
        assert a >=60:"Estas chavo";
        
        
    }
    
}
