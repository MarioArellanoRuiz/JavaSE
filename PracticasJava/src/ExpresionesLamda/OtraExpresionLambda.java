/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExpresionesLamda;

import SuperMercado.Papaya;
import java.util.ArrayList;

/**
 *
 * @author mario
 */
public class OtraExpresionLambda {
    public static void main(String[] args) {
        ArrayList<Papaya> papayas = new ArrayList<>(); 
        for (int i = 0; i < 20; i++) {
            Papaya p = new Papaya();
            p.setSemillas(i);
            papayas.add(p);
        }
        
        papayas.forEach(n->{
            System.out.println(n.toString()+ " "+ n.getSemillas());
        });
        
    }
    
}
