import java.util.StringTokenizer;
import java.util.Scanner;

public class IntegerSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user to enter a line of integers
        System.out.print("Enter a line of integers separated by spaces: ");
        String inputLine = scanner.nextLine();
        
        // Create a StringTokenizer to tokenize the input line
        StringTokenizer tokenizer = new StringTokenizer(inputLine);
        
        int sum = 0;
        System.out.println("Integers entered:");
        
        // Iterate through each token and display it
        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            try {
                int number = Integer.parseInt(token);
                System.out.println(number);
                sum += number;
            } catch (NumberFormatException e) {
                System.out.println("Invalid integer: " + token);
            }
        }
        
        // Display the sum of all integers
        System.out.println("Sum of all integers: " + sum);
        
        scanner.close();
    }
}
