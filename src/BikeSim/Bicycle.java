package BikeSim;

public class Bicycle {
    // Blueprint to create a Bicycle object

    // Attributes
    private String color;
    private int gear;
    private double maxVelocity;

    // Constructor: what gets called to build the Bike
    Bicycle() {
        color = "Pink";
        gear = 1;
        maxVelocity = 20;
    }
    Bicycle(String c, int g, double mV){    // String color, int gear, double maxVelocity
        this.color = c;
        this.gear = g;
        this.maxVelocity = mV;
    }

    // Getters and Setters (Accessors and Mutators)


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public double getMaxVelocity() {
        return maxVelocity;
    }

    public void setMaxVelocity(double maxVelocity) {
        this.maxVelocity = maxVelocity;
    }

    // Helper Methods
    public void brake(){
        System.out.println("I'm braking...");
    }

    public void jump(){
        System.out.println("JUMP");
    }

    public void turn(String dir){
        System.out.println("I'm turning " + dir);
    }

}
