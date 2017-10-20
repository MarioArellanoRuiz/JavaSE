
package algoritmos;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author mario
 */
public class ExpresionesRegulares {
    public static void main(String[] args) {
    
        System.out.println(validar("maaa@GMAIL5.com".toLowerCase()));
        
    }
    static boolean validar(String input){
 
        Pattern p= Pattern.compile("[a-z]+[0-9]*[-]*[_]*@[a-z]+.com");
        Matcher m = p.matcher(input);
        return m.matches();
    }
    
}
