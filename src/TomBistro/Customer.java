package TomBistro;

public class Customer extends Person {
//    Customer is now a CHILD of the PARENT class Person
//    So it brings in all attributes and methods of Person class
    private double moneySaved;
    private String favMenuItem;

    Customer(){
        // Decide on mandatory items
        // Everything else is default
        super(name);
        this.moneySaved = 0;
        this.favMenuItem = "Water";
    }
}

