import java.util.Scanner;
public class float
{
    // Function to swap two float numbers using call by value
    static void swap(float num1, float num2) 
    {
        System.out.println("Before swapping: num1 = " + num1 + ", num2 = " + num2);
        // Swapping logic
        float temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("After swapping: num1 = " + num1 + ", num2 = " + num2);
    }
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        // Input the values of num1 and num2
        System.out.println("Enter the value of num1: ");
        float number1 = scanner.nextFloat();
        System.out.println("Enter the value of num2: ");
        float number2 = scanner.nextFloat();
        // Calling the swap function
        swap(number1, number2);
        // Original values remain unchanged after the function call
        System.out.println("Outside the function: num1 = " + number1 + ", num2 = " + number2);
        scanner.close();
    }
}
