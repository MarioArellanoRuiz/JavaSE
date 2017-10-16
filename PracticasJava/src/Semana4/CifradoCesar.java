
package Semana4;

public class CifradoCesar {
    public enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
    THURSDAY, FRIDAY, SATURDAY 
}
    public static void main(String[] args) {
        
        String alfabeto= "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
        String cad= "CadenaCesar";
        int espacio=3;
        for (int i = 0; i < cad.length(); i++) {
            cad=cad.replace(cad.charAt(i), alfabeto.charAt(i+espacio));
        }
        System.out.println(cad);
        
        //probando condiciones
        boolean x=true; 
        boolean az=false;
        
        System.out.println(x==az);
        if(x==az){
            
        }
        
        if(true){
            System.out.println("1");
        }else if(true){
            System.out.println("2");
        }else if(true){
            System.out.println("3");
        }
               
        
    }
}
