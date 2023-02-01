package BikeSim;

public class Level1 {
    public static void main(String[] args) {
        System.out.println("----------Loaded Level 1----------");

        // Creates a new Bicycle object from Bicycle class
        Bicycle defaultBike = new Bicycle();
        Bicycle speedDemonBike = new Bicycle("Black", 1, 30);

        defaultBike.turn("left");

        String myBikeColor = defaultBike.getColor();
        System.out.println(myBikeColor);

        System.out.println(defaultBike.getColor());
        defaultBike.setColor("Blue");
        System.out.println(defaultBike.getColor());

    }
}
