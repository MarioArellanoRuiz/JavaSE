
package algoritmos;
//Ordenamiento Burbuja
import java.util.Scanner;

public class Burbuja {
    public static void main(String[] args) {
        ordenarArray();
    }
 static public void ordenarArray(){
              
        
        int [] array={1,10,8,6,10,17,2};
        int temporal;
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-1; j++) {
                
                if(array[j]>array[j+1]){
                    temporal = array[j+1];
                    array[j+1]=array[j];
                    array[j]=temporal;  
                }  
                          
            }
            
        }
        for (int i : array) {
            System.out.println(i);
        }
 }
}
