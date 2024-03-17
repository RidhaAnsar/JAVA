import java.util.Scanner;

class AgeOutOfRangeException extends Exception {
    public AgeOutOfRangeException(String message) {
        super(message);
    }
}

public class Student_Exceptionhandling {
    private int rollNo;
    private String name;
    private int age;
    private String course;

    public Student(int rollNo, String name, int age, String course) throws AgeOutOfRangeException {
        if (age < 15 || age > 21) {
            throw new AgeOutOfRangeException("Age should be between 15 and 21.");
        }
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter Roll No:");
            int rollNo = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.println("Enter Name:");
            String name = scanner.nextLine();
            System.out.println("Enter Age:");
            int age = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.println("Enter Course:");
            String course = scanner.nextLine();

            Student student = new Student(rollNo, name, age, course);
            System.out.println("Student created successfully:");
            System.out.println("Roll No: " + student.rollNo);
            System.out.println("Name: " + student.name);
            System.out.println("Age: " + student.age);
            System.out.println("Course: " + student.course);

        } catch (AgeOutOfRangeException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
