
package Semana4;


public class Suma {
    public static void main(String[] args) {
        
        int a=5;
        int b=5;
        int suma;
        suma = a+b;
        System.out.println(suma);
        
        float pi = (float) Math.PI;
        float c=10.589f;
        float resultado = pi*c;
        
        System.out.println(resultado);
        
        double x1 = ((-b)+(Math.sqrt(Math.pow(b, 2)-4*a*c)))/2*a;
        double x2 = ((-b)-(Math.sqrt(Math.pow(b, 2)-4*a*c)))/2*a;
        
        System.out.println(x1);
        System.out.println(x2);
       
    }
}
