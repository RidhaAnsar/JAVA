import java.util.Scanner;
interface Shape 
{
    double calculateArea();
}
class Triangle implements Shape 
{
    private double base;
    private double height;
    public Triangle(double base, double height) 
    {
        this.base = base;
        this.height = height;
    }
    @Override
    public double calculateArea() 
    {
        return 0.5 * base * height;
    }
}
public class triangle_polymorphism
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the base of the triangle: ");
        double base = scanner.nextDouble();
        System.out.println("Enter the height of the triangle: ");
        double height = scanner.nextDouble();
        Shape triangle = new Triangle(base, height);
        double area = triangle.calculateArea();
        System.out.println("Area of the Triangle: " + area);
        scanner.close();
    }
}