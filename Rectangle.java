public class Rectangle {
    private double length;
    private double width;

    // Default constructor
    public Rectangle() {
        length = 0;
        width = 0;
    }

    // Parameterized constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Method to calculate the perimeter of the rectangle
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    // Method to calculate the area of the rectangle
    public double calculateArea() {
        return length * width;
    }

    // Method to compare the area of two rectangles
    public int sameArea(Rectangle other) {
        double area1 = this.calculateArea();
        double area2 = other.calculateArea();

        if (area1 == area2) {
            return 1;
        } else {
            return 0;
        }
    }

    // Getter and setter methods
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(5, 4);
        Rectangle rectangle2 = new Rectangle(4, 5);

        System.out.println("Rectangle 1:");
        System.out.println("Area: " + rectangle1.calculateArea());
        System.out.println("Perimeter: " + rectangle1.calculatePerimeter());

        System.out.println("\nRectangle 2:");
        System.out.println("Area: " + rectangle2.calculateArea());
        System.out.println("Perimeter: " + rectangle2.calculatePerimeter());

        if (rectangle1.sameArea(rectangle2) == 1) {
            System.out.println("\nBoth rectangles have the same area.");
        } else {
            System.out.println("\nThe rectangles don't have the same area.");
        }
    }
}
