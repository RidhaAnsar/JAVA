// Parent class
class Animal {
    private String name;
    private int age;

    // Constructor
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter and setter methods for encapsulation
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Method to display animal information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Method to define animal sound
    public void makeSound() {
        System.out.println("Animal makes a sound.");
    }
}

// Child class inheriting from Animal
class Dog extends Animal {
    private String breed;

    // Constructor
    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    // Method to display dog information, overrides displayInfo method in parent class
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call displayInfo method of parent class
        System.out.println("Breed: " + breed);
    }

    // Method to define dog sound, overrides makeSound method in parent class
    @Override
    public void makeSound() {
        System.out.println("Woof woof!");
    }
}

public class OOPExample {
    public static void main(String[] args) {
        // Create objects of Animal and Dog classes
        Animal animal = new Animal("Generic Animal", 5);
        Dog dog = new Dog("Buddy", 3, "Labrador");

        // Call methods
        System.out.println("Animal Info:");
        animal.displayInfo();
        animal.makeSound();

        System.out.println(); // Add a blank line for clarity

        System.out.println("Dog Info:");
        dog.displayInfo();
        dog.makeSound();
    }
}
