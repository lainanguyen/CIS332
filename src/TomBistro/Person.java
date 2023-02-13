package TomBistro;

public class Person {
    private String name;
    private int age;
    private String email;

    Person(String n, int a, String em){
        this.name = n;
        this.age = 0;
        email = "default@gmail.com";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
