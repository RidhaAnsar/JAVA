import java.io.*;
interface Operations {
    double PI = 3.14;

    double area();

    double volume();
}

class Cylinder implements Operations {
    private double height;
    private double radius;

    public Cylinder(double height, double radius) {
        this.height = height;
        this.radius = radius;
    }

    @Override
    public double area() {
        return 2 * PI * radius * (radius + height);
    }

    @Override
    public double volume() {
        return PI * radius * radius * height;
    }
}

public class area_operation {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(5, 2);

        System.out.println("Area of the cylinder: " + cylinder.area());
        System.out.println("Volume of the cylinder: " + cylinder.volume());
    }
}
