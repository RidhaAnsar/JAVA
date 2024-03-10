import java.io.*;
class Employee_engineer {
    public void display() {
        System.out.println("Name of class is Employee.");
    }

    public void calcSalary() {
        System.out.println("Salary of employee is 10000.");
    }
}

class Engineer extends Employee {
    @Override
    public void calcSalary() {
        System.out.println("Salary of employee is 20000.");
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an Engineer object using the Employee reference
        Employee employee = new Engineer();

        // Call the display method of Employee class
        employee.display();

        // Call the calcSalary method of Engineer class
        employee.calcSalary();
    }
}
