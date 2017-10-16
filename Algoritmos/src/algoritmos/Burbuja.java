
package algoritmos;
//Ordenamiento Burbuja
import java.util.Scanner;

public class Burbuja {
    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in);
        String option = lector.nextLine();
        System.out.println(option);
        
        
        int [] array={1,10,8,6,10,17,2};
        int temporal;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                
                if(array[i]<array[j]){
                    temporal = array[i];
                    array[i]=array[j];
                    array[j]=temporal;  
                }  
                          
            }
            
        }
        for (int i : array) {
            System.out.println(i);
        }
        
    }
 
}
