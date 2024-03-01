import java.util.Scanner;
// A simple container class to hold a single float value
class FloatContainer 
{
    float value;
    FloatContainer(float value) 
    {
        this.value = value;
    }
}
public class square_root

{
    // Function to calculate the square root using call by reference
    static void calculateSquareRoot(FloatContainer container) 
    {
        container.value = (float) Math.sqrt(container.value);
    }
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("SAM V S ");
        // Input the value for which you want to find the square root
        System.out.println("Enter a number to find its square root: ");
        float inputValue = scanner.nextFloat();
        // Create a FloatContainer object to hold the value
        FloatContainer valueContainer = new FloatContainer(inputValue);
        // Call the function to calculate square root using call by reference-like behavior
        calculateSquareRoot(valueContainer);
        // Display the result
        System.out.println("Square root: " + valueContainer.value);
        scanner.close();
    }
}
