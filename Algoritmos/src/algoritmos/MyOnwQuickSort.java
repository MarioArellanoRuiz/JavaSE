package algoritmos;

/**
 *
 * @author mario
 */
public class MyOnwQuickSort {

    public static void main(String[] args) {
        int[] vector = {1, 8, 3, 6, 6, 15, 11};
        quickSort(vector, 0, vector.length - 1);
        for (int i : vector) {
            System.out.println(i);
        }
    }

    static void quickSort(int[] vector, int izquierda, int derecha) {
        int i=izquierda;
        int j=derecha;
        int pivote=vector[0];
        int auxiliar;
        do{
            while(vector[i]<pivote) i++;
            
            while(vector[j]>pivote) j--;
            
            if(i<=j){
                auxiliar = vector[j];
                vector[j] = vector[i];
                vector[i] = auxiliar;
                i++;
                j--;
            }
        }while(i<=j);
        if(izquierda<j){
            quickSort(vector, izquierda, j);
        }
        if(j>derecha){
            quickSort(vector, j, derecha);
        }
       
        
    }
}
