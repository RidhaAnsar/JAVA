import java.util.Scanner;
import java.io.*;
interface Shape {
    void disp();
    double calc();
}

class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void disp() {
        System.out.println("Circle");
    }

    @Override
    public double calc() {
        return Math.PI * radius * radius;
    }
}

class Rectangle implements Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void disp() {
        System.out.println("Rectangle");
    }

    @Override
    public double calc() {
        return length * width;
    }
}

public class Main_volume {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose shape: 1. Circle  2. Rectangle");
        int choice = scanner.nextInt();

        Shape shape;
        if (choice == 1) {
            System.out.print("Enter radius of the circle: ");
            shape = new Circle(scanner.nextDouble());
        } else if (choice == 2) {
            System.out.print("Enter length of the rectangle: ");
            double length = scanner.nextDouble();
            System.out.print("Enter width of the rectangle: ");
            shape = new Rectangle(length, scanner.nextDouble());
        } else {
            System.out.println("Invalid choice!");
            return;
        }

        shape.disp();
        System.out.println("Volume: " + shape.calc());

        scanner.close();
    }
}
