package hackerrank;

import java.util.Scanner;

public class HackerRank {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        int c = s.nextInt();
        //System.out.println(c);
        String cadena;
        //cadena = s.nextLine();

        for (int i = 0; i < c; i++) {
            String cad1 = "";
            String cad2 = "";
            cadena = s.next();

            for (int j = 0; j < cadena.length(); j++) {
                if (j % 2 == 0) {
                    cad1 += cadena.charAt(j);
                } else {
                    cad2 += cadena.charAt(j);
                }
            }
            System.out.println(cad1 + " " + cad2);
            System.out.println(" ma rio ".trim());
        }
        
   

    }
}
