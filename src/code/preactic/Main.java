package code.preactic;

// Abstraction: Define an abstract class
abstract class Vehicle {
    private String brand; // Encapsulation: private field

    // Getter and Setter for encapsulated field
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    // Abstract method to be implemented by subclasses
    abstract void drive();

    // Concrete method shared by all subclasses
    void honk() {
        System.out.println("The vehicle honks!");
    }
}

// Inheritance: Car class inherits Vehicle
class Cars extends Vehicle {
    private final int doors;

    // Constructor
    public Cars(String brand, int doors) {
        setBrand(brand); // Using encapsulation (setter)
        this.doors = doors;
    }

    // Overriding the abstract method (Polymorphism: runtime)
    @Override
    void drive() {
        System.out.println(getBrand() + " car with " + doors + " doors is driving.");
    }
}

// Inheritance: Bike class inherits Vehicle
class Bike extends Vehicle {
    private final boolean hasCarrier;

    // Constructor
    public Bike(String brand, boolean hasCarrier) {
        setBrand(brand); // Using encapsulation (setter)
        this.hasCarrier = hasCarrier;
    }

    // Overriding the abstract method (Polymorphism: runtime)
    @Override
    void drive() {
        System.out.println(getBrand() + " bike is driving. Carrier: " + (hasCarrier ? "Yes" : "No"));
    }
}

public class Main {
    public static void main(String[] args) {
        // Polymorphism: Using Vehicle reference to call subclass methods
        Vehicle car = new Cars("Toyota", 4);
        car.drive(); // Calls Car's drive() method
        car.honk();  // Calls shared method from Vehicle class

        Vehicle bike = new Bike("Yamaha", true);
        bike.drive(); // Calls Bike's drive() method
        bike.honk();  // Calls shared method from Vehicle class
    }
}

