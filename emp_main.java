// Parent class
class Employee {
    private String name;
    private double salary;

    // Constructor
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Getters
    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

// Subclass inheriting from Employee
class Manager extends Employee {
    private String department;

    // Constructor
    public Manager(String name, double salary, String department) {
        super(name, salary); // Call superclass constructor
        this.department = department;
    }

    // Getter
    public String getDepartment() {
        return department;
    }

    // Overriding method to display manager details
    @Override
    public void displayDetails() {
        super.displayDetails(); // Call superclass method
        System.out.println("Department: " + department);
    }
}

public class emp_main {
    public static void main(String[] args) {
        // Create an Employee object
        Employee emp = new Employee("John Doe", 50000);
        System.out.println("Employee Details:");
        emp.displayDetails();
        System.out.println();

        // Create a Manager object
        Manager manager = new Manager("Jane Smith", 70000, "Marketing");
        System.out.println("Manager Details:");
        manager.displayDetails();
    }
}
