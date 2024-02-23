import java.io.*;
public class greater
{
public static void main(String[] args) {
DataInputStream din = new DataInputStream(System.in);
int a, b,c;

try {
System.out.println("\nEnter 3 Numbers: ");
a = Integer.parseInt(din.readLine());
b = Integer.parseInt(din.readLine());
c = Integer.parseInt(din.readLine());
if (a > b && a > c)
System.out.println("\na is greater");
if (b > a && b > c)
System.out.println("\nb is greater");
if (c > a && c > b)
System.out.println("\nc is greater");

} catch (Exception e) {
System.out.println("Error " + e);
}}}