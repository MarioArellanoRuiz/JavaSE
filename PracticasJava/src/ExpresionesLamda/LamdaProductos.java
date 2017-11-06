/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExpresionesLamda;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author mario
 */
public class LamdaProductos {
   
    public static void main(String[] args) {
        List<Producto> listaProdcuto=new ArrayList();
        
        listaProdcuto.add(new Producto(1, "Banana", 12.5f));
        listaProdcuto.add(new Producto(3, "Papaya", 24.5f));
        listaProdcuto.add(new Producto(2, "CocaCola", 11.5f));
        
        Collections.sort(listaProdcuto,(p1, p2) -> {
            return p1.nombre.compareTo(p2.nombre);
        });
        listaProdcuto.forEach(e->System.out.println(e.nombre+" "+e.precio));
    }
    
}
