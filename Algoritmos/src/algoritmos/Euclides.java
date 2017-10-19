/*
 Algoritmo para calcular el maxixmo comun divisor
 */
package algoritmos;

/**
 *
 * @author mario
 */
public class Euclides {
    
    public int[] maximoComunDivisor(int a, int b){
        int[] arr;
        
        int max= Math.max(a, b);
        int min=Math.min(a, b);
        int res=0;
        int mcd;
        do{
            
            mcd=max/min;
            
        }while(res!=0);
        
        return null;
    }    
    
}
