import java.util.Scanner;

// Custom exception class for invalid age
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

// Student class
class Student {
    private int rollNo;
    private String name;
    private int age;
    private String course;

    // Constructor
    public Student(int rollNo, String name, int age, String course) throws InvalidAgeException {
        this.rollNo = rollNo;
        this.name = name;
        // Check if age is within the valid range (15 to 21)
        if (age < 15 || age > 21) {
            throw new InvalidAgeException("Age must be between 15 and 21");
        }
        this.age = age;
        this.course = course;
    }

    // Method to display student information
    public void displayInfo() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }
}

public class stud_exception_handling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for student details
        System.out.print("Enter Roll No: ");
        int rollNo = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter Course: ");
        String course = scanner.nextLine();

        try {
            // Create a student object
            Student student = new Student(rollNo, name, age, course);
            // Display student information
            student.displayInfo();
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}
