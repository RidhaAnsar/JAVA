abstract class Shape {
    double parameter1;
    double parameter2;
    
    Shape(double parameter1, double parameter2) {
        this.parameter1 = parameter1;
        this.parameter2 = parameter2;
    }
    
    abstract double area();
    
    void printArea() {
        System.out.println("Area: " + area());
    }
}

class Rectangle extends Shape {
    Rectangle(double width, double length) {
        super(width, length);
    }
    
    @Override
    double area() {
        return parameter1 * parameter2;
    }
}

class Triangle extends Shape {
    Triangle(double base, double height) {
        super(base, height);
    }
    
    @Override
    double area() {
        return 0.5 * parameter1 * parameter2;
    }
}

class Circle extends Shape {
    Circle(double radius) {
        super(radius, 0); // 0 as the second parameter for circle
    }
    
    @Override
    double area() {
        return Math.PI * parameter1 * parameter1;
    }
}

public class abstractclassmain {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 10);
        Triangle triangle = new Triangle(3, 4);
        Circle circle = new Circle(7);
        
        rectangle.printArea();
        triangle.printArea();
        circle.printArea();
    }
}
