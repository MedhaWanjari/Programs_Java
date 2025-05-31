package ex_18_O0Ps_constructors;

public class Car {
    String name;
    int year;
    String model;

    // Default Constructor

    Car(){
        name = "Unknown Car";
        model = "XXX";
        year = 0;
        System.out.println("DC");
    }
}
