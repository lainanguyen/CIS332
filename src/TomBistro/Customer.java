package TomBistro;

public class Customer extends Person {
//    Customer is now a CHILD of the PARENT class Person
//    So it brings in all attributes and methods of Person class
    private double moneySaved;
    private String favMenuItem;

    // CONSTRUCTOR: Is called when you want to create/construct this object
    // Specifically when the keyword 'new' is used
    Customer(double ms, String fmi, String n, int a, String em){
        // Decide on mandatory items
        // Everything else is default
        super(n, a, em);
        this.moneySaved = ms;
        this.favMenuItem = "Water";
    }
}

