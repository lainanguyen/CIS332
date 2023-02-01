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

    // Methods
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
