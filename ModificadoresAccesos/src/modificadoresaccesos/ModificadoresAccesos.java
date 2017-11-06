
package modificadoresaccesos;

public class ModificadoresAccesos {

    public static void main(String[] args) {
       // System.out.println(isEarlier({new int {10,30}, new int{11, 00}));
       int [] a= {10,50};
       int [] b= {10,40};
       
        System.out.println(isEarlier(a,b));
    }
static boolean isEarlier(int[] time1, int[] time2) {
    
    
  if ( (time1[0]==time2[0]) && (time1[1]<time2[1]) &&  (time1[1]!=time2[1] )){

  return true;
  }
  return false;
}

    
}
