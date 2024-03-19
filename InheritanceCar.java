// Superclass
class Vehicle {
    private String brand;
    private int year;

    // Constructor
    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    // Method
    public void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
    }
}

// Subclass inheriting from Vehicle
class Car extends Vehicle {
    private int mileage;

    // Constructor
    public Car(String brand, int year, int mileage) {
        super(brand, year); // Call superclass constructor
        this.mileage = mileage;
    }

    // Method
    public void displayCarDetails() {
        display(); // Call superclass method
        System.out.println("Mileage: " + mileage + " miles");
    }
}

public class InheritanceCar {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", 2020, 5000);
        myCar.displayCarDetails();
    }
}
