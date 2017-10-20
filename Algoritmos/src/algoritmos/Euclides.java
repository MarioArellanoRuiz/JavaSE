/*
 Algoritmo para calcular el maxixmo comun divisor
 */
package algoritmos;

/**
 *
 * @author mario
 */
public class Euclides {
    
    public static int maximoComunDivisor(int a, int b){
        int[] arr;
        
        int max= Math.max(a, b);
        int min=Math.min(a, b);
        
       
        int residuo;
        int dividendo=max;
        int divisor=min;
        
        do{
            
            residuo=dividendo%divisor;
            dividendo=divisor;
            divisor=residuo;
            
        }while(residuo!=0);
        
         int mcd=dividendo;
        
        return mcd;
    } 
    
    public static void main(String[] args) {
        System.out.println(maximoComunDivisor(5, 10));
        System.out.println((40*4)/maximoComunDivisor(5, 10));
        
    }
    
}
