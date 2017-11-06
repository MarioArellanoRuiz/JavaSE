/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sumadecadenas;

/**
 *
 * @author mario
 */
public class CalculadoraDeCadenas {
    
    public Integer addString(String cadena){
        int n=0;
        
        if(!cadena.isEmpty()){
            char coma = ',';
            char puntoYComa = ';';
            char barra = '\\';
            for (int i = 0; i < cadena.length(); i++) {
                if(Character.isDigit(cadena.charAt(i))&& Integer.parseInt(String.valueOf(cadena.charAt(i)))>=0){
                    
                    n+= Integer.parseInt(String.valueOf(cadena.charAt(i)));
                }
            }
            return n;
        }else{
            return n+1;
        }
        
        
    }
    public Integer addString2(String cadena){
        
        String [] arreglo = cadena.split(",");
        int n=0;
        for (String arreglo1 : arreglo) {
            if (arreglo1.matches("[0-4]")) {
                n += Integer.parseInt(arreglo1);
            }else 
                return 0;
        }
        return n;
    }
}
