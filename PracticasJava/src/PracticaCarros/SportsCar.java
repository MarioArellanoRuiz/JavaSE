/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticaCarros;

/**
 *
 * @author mario
 */
public class SportsCar extends Car{
    float aerodinamicalCoef;

    public void setAerodinamicalCoef(float aerodinamicalCoef) {
        this.aerodinamicalCoef = aerodinamicalCoef;
    }

    public float getAerodinamicalCoef() {
        return aerodinamicalCoef;
    }
    public void run(){
        System.out.println("Runing..");
    }
}
