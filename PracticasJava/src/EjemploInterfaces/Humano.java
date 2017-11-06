/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemploInterfaces;

/**
 *
 * @author mario
 */
public class Humano implements RunnableIterface{
String name;
    @Override
    public void run() {
        System.out.println("Humano Corriendo");
    }
    
}
