/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SuperMercado;

/**
 *
 * @author mario
 */
public class ProbandoEnums {
    public enum miEmumeration{LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO}
    public static void main(String[] args) {
        System.out.println(miEmumeration.DOMINGO);
        
        for (miEmumeration s: miEmumeration.values()) {
            System.out.println(s);
        }
        
    }
    
}
