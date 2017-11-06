
package PracticaCarros;

public class Car {

    /**
     * @return the velocity
     */
    public int getVelocity() {
        return velocity;
    }

    /**
     * @param velocity the velocity to set
     */
    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }

    /**
     * @return the wheels
     */
    public Wheel[] getWheels() {
        return wheels;
    }

    /**
     * @param wheels the wheels to set
     */
    public void setWheels(Wheel[] wheels) {
        this.wheels = wheels;
    }
    private int velocity;
    private Wheel[] wheels;
    
}
