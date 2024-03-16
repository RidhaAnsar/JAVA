// Interface for operations
interface Operations {
    double PI = 3.14; // Constant for PI

    double area();   // Method to calculate area
    double volume(); // Method to calculate volume
}

// Cylinder class implementing the Operations interface
class Cylinder implements Operations {
    double height;
    double radius;

    // Constructor with height and radius
    public Cylinder(double height, double radius) {
        this.height = height;
        this.radius = radius;
    }

    // Method to calculate the surface area of the cylinder
    @Override
    public double area() {
        return 2 * PI * radius * (radius + height);
    }

    // Method to calculate the volume of the cylinder
    @Override
    public double volume() {
        return PI * radius * radius * height;
    }
}

// Main class for testing the Cylinder class
public class operation {
    public static void main(String[] args) {
        // Create a Cylinder object with height 5 and radius 2
        Cylinder cylinder = new Cylinder(5, 2);

        // Calculate and print area and volume of the cylinder
        System.out.println("Area of the cylinder: " + cylinder.area());
        System.out.println("Volume of the cylinder: " + cylinder.volume());
    }
}
