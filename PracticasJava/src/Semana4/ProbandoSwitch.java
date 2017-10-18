
package Semana4;

import java.util.Scanner;

public class ProbandoSwitch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        switch(s){
            case "Chona":
                System.out.println("Chona!");
                break;
            case "Juana":
                System.out.println("Juna!");
                break;
            case "Lola":
                System.out.println("Lola!");
                break;
            default:
                System.out.println("Opcion Invalida");
                break;
                
        }
    }
}
