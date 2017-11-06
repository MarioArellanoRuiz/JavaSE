
package algoritmos;

import java.util.Stack;

public class Pilas {
    public static void main(String[] args) {
        System.out.println(equilibrar("({})"));
    }
    
    static boolean equilibrar(String cadena){
        int contador=0;    
        boolean b;
        Stack parentesis = new Stack();
        Stack corchetes = new Stack();
        Stack llaves = new Stack();
        Stack pila = new Stack();
       
        while(contador < cadena.length()){
            switch(cadena.charAt(contador)){
                
                case '(':
                        parentesis.add('(');
                        break;
                    
                case '[':    
                        corchetes.add('[');
                        break;
                        
                case '{':    
                        llaves.add('{');
                        break;
                        
                case ')':
                        if((corchetes.empty()&&llaves.empty()&&!parentesis.empty())||(char)parentesis.peek()==')')parentesis.pop();else return false;
                        break;
                    
                case ']':    
                        if((parentesis.empty()&&llaves.empty()&&!parentesis.empty())||(char)corchetes.peek()==']')corchetes.pop();else return false;
                        break;
                        
                 case '}':    
                        if((corchetes.empty()&&parentesis.empty()&&!parentesis.empty())||(char)llaves.peek()=='}')llaves.pop();else return false;
                        break;
            }
            contador++;
        }
        return parentesis.empty()&&corchetes.empty()&&corchetes.empty();
    }
    
}
