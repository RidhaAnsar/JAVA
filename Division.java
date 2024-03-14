import java.io.DataInputStream;
import java.io.IOException;

public class Division {
    public static void main(String args[]) throws IOException {
        DataInputStream din = new DataInputStream(System.in);
        
        System.out.println("Enter first number:");
        int a = Integer.parseInt(din.readLine());
        
        System.out.println("Enter second number:");
        int b = Integer.parseInt(din.readLine());
        
        if (b == 0) {
            System.out.println("Error: Division by zero");
        } else {
            System.out.println("Division: " + (a / b));
        }
        
        din.close();
    }
}
