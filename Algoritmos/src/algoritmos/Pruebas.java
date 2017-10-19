
package algoritmos;

/**
 *
 * @author mario
 */
public class Pruebas {
    
    
    public static void main(String[] args) {
    //Calcular la distancia de entre dos puntos de forma no lineal    
    double x1=1;
    double y1=1;
    
    double x2=9.5;
    double y2=6.5;
    
    //double a=x2;
    //double b=y1;
    
    double d1, d2;
    
    //d1=Math.sqrt(Math.pow(Math.abs(x1-a),2)+Math.pow(Math.abs(y2-b),2));
    //d2=Math.sqrt(Math.pow(Math.abs(x2-a),2)+Math.pow(Math.abs(y1-b),2));
    
    //d1= Math.sqrt(Math.pow(x1-a,2)+Math.pow(y1-b,2));
    //d2= Math.sqrt(Math.pow(x2-a,2)+Math.pow(y2-b,2));
    
    //d1= Math.sqrt(Math.pow(x1-a,2))+Math.sqrt(Math.pow(y2-b,2));
    
    d1= Math.sqrt(Math.pow(x1-x2,2))+Math.sqrt(Math.pow(y1-y2,2));
    
    System.out.println(d1);
    
    }
            
}
