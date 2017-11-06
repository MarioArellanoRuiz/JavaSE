/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

 */


package SuperMercado;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;
import java.util.function.Consumer;

/**
 *
 * @author mario
 */
@SuppressWarnings("all")
public class Main {
    public static void main(String[] args) {
        Refrigerador refri = new Refrigerador();
        refri.setTemperatura(4);
        CajaFrutas cajaFruta = new CajaFrutas();
        
        Papaya[] papayas= new Papaya[4];
        Sandia[] sandias= new Sandia[5];
        Banana[] bananas= new Banana[3];
        
        Papaya papaya = new Papaya();
        Sandia sandia = new Sandia();
        Banana banana = new Banana();
        
        
        for (int i = 0; i < papayas.length; i++) {
         papaya.setSemillas(i);
         papaya.setColor("Color Papaya");
         papaya.setExpiracion(i);
         papayas[i]=papaya;
        }
        for (int i = 0; i < sandias.length; i++) {
         sandia.setColor("verde");
         sandia.setExpiracion(i);
         sandias[i]=sandia;
        }
        for (int i = 0; i < bananas.length; i++) {
         banana.setColor("Amarilla");
         banana.setExpiracion(i);
         bananas[i]=banana;   
        }
        
        cajaFruta.setBananas(bananas);
        cajaFruta.setSandias(sandias);
        cajaFruta.setPapayas(papayas);
        
        refri.setCajaFrutas(cajaFruta);
        
        Zanahoria[] zanahorias = new Zanahoria[3];
        Chayote[] chayotes=new Chayote[5];
        Chayote chayote = new Chayote();
        Zanahoria zanahoria=new Zanahoria();
          
        
        
        for (int i = 0; i < zanahorias.length; i++) {
            zanahoria.setColor("Anaranjada");
            zanahoria.setExpiracion(i);
            zanahorias[i]=zanahoria;
        }
              
        for (int i = 0; i < chayotes.length; i++) {
            chayote.setColor("verde");
            chayote.setExpiracion(i);
            chayotes[i]=chayote;
        }
               
        
        CajaVerduras cajaVerduras = new CajaVerduras();
        cajaVerduras.setChayotes(chayotes);
        cajaVerduras.setZanahorias(zanahorias);
        
       // refri.getCajaFrutas().mostrarFrutas();
        refri.setCajaVerduras(cajaVerduras);
      //  refri.getCajaVerduras().mostrarVerduras();
        
       List<Papaya> listaPapayas = new ArrayList<>();
       
       listaPapayas.add(new Papaya());
        for (int i = 0; i < 1000; i++) {
            Papaya p = new Papaya();
            p.setExpiracion(i);
            listaPapayas.add(p);
        }
        
        System.out.println(listaPapayas.size());
        
       /* listaPapayas.forEach(new Consumer<Papaya>() {
            
              int contador = 0;
            public void accept(Papaya miPapaya) {
           contador ++; System.out.println(contador);}
        }); */
        
        Iterator<Papaya> iterator = listaPapayas.iterator();
        int contador=0;
        while(iterator.hasNext()){
            //System.out.println(contador++);
            System.out.println(iterator.next().getExpiracion());
            
        }
        
       Vector<Chayote> miVector = new Vector(100);
        miVector.add(new Chayote());
        System.out.println(miVector.elementAt(0));
        //miVector.add(new Chayote());
        Enumeration<Chayote> en = miVector.elements();
        while(en.hasMoreElements()){
            System.out.println(en.nextElement().getNumeroEspinas());
        }
        
        Scanner s = new Scanner(System.in);
        System.out.println("Introdusca algo:");                
        int a = s.nextInt();
        assert a >=60:"Estas chavo";
        System.out.println("After "+a);
        
    }
    
    
    
}
