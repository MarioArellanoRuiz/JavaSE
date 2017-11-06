
package codefights;

public class FirtsDuplicate {
    public static void main(String[] args) {
        int a[]={1,1,2,5};
        //System.out.println(firstDuplicate(a));
        System.out.println(firtsDuplicate2(a));
    }
    
static int firstDuplicate(int[] a) {
    int index=-1;
    int limite=a.length;
    loop: for (int i = 0; i < limite-1 ; i++) {
        for (int j = i+1; j < limite; j++) {
            if(a[i]==a[j]){
               
                if(index>j||index==-1){index=j;limite=j;continue loop;}                
            }
        }
        
    }    
if(index!=-1)
    return a[index];
else
    return -1;
}

static int firtsDuplicate2(int []a){
    
    int[] b;
    b= new int[1_000_000];
    
    for (int i = 0; i < a.length; i++) {
            if(b[a[i]]==0){
               b[a[i]]=a[i];
        }else{
            return a[i];
        }
    }
   
   return -1;

}

}
