// Abstract class
abstract class Animal {
    private String name;
    private int age;

    // Constructor
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Abstract method
    public abstract void makeSound();

    // Concrete method
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age + " years");
    }
}

// Concrete subclass
class Dog extends Animal {
    // Constructor
    public Dog(String name, int age) {
        super(name, age);
    }

    // Implementation of abstract method
    @Override
    public void makeSound() {
        System.out.println("Woof woof!");
    }
}

// Concrete subclass
class Cat extends Animal {
    // Constructor
    public Cat(String name, int age) {
        super(name, age);
    }

    // Implementation of abstract method
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}

public class AbstractClassExample {
    public static void main(String[] args) {
        // Creating objects of concrete subclasses
        Animal dog = new Dog("Buddy", 3);
        Animal cat = new Cat("Whiskers", 5);
        
        // Calling methods
        dog.displayInfo();
        dog.makeSound();
        
        System.out.println(); // Add a blank line for clarity
        
        cat.displayInfo();
        cat.makeSound();
    }
}
