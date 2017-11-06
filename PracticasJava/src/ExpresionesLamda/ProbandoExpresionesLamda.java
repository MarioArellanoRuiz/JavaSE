/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExpresionesLamda;

/**
 *
 * @author mario
 */
public class ProbandoExpresionesLamda {
    public static void main(String[] args) {
        
        Drawable d=new Drawable(){
        public void draw(){
        System.out.println("Drawing "+width);}
        };
        d.draw();
    }
}
