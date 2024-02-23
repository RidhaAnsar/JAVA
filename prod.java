import java.io.*;
public class prod
{
public static void main(String[] args) {
System.out.print("Ridha Ansar");
DataInputStream din = new DataInputStream(System.in);
int a, b;
try {
System.out.print("\nEnter 1st Number: ");
a = Integer.parseInt(din.readLine());
System.out.print("Enter 2nd Number: ");
b = Integer.parseInt(din.readLine());
System.out.println("Product of " + a + " and " + b + " is " + (a * b));
} catch (Exception e) {
System.out.println("Error " + e);
}
}

}