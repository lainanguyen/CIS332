package Homework;

public class Flower {
    public static void main(String[] args) {
        Flower flower = new Flower("Carnations", 5, 10f);

        System.out.println("The names of the flowers are " + flower.getFlower());
        System.out.println("There are " + flower.getPetals() + " petals in each flower.");
        System.out.println("The price of these flowers are " + flower.getPrice() + " dollars.");
    }

    String flower;
    int petals;
    double price;

    public Flower(String flower, int petals, double price) {

        this.flower = flower;
        this.petals = petals;
        this.price = price;
    }

    public String getFlower() {
        return flower;
    }

    public void setFlower(String flower) {
        this.flower = flower;
    }

    public int getPetals() {
        return petals;
    }

    public void setPetals(int petals) {
        this.petals = petals;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

}

