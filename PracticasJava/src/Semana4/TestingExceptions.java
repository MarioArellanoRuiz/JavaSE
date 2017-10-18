/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana4;

/**
 *
 * @author mario
 */
public class TestingExceptions {
    
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            try {
                throw new RuntimeException();
            } catch (RuntimeException e) {
                
            }finally{
                
            }
System.out.println("Se ejecuta de todos modos");
        }
    }
    
    
    
}
