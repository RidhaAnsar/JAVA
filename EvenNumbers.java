import java.io.*;
public class EvenNumbers 
{
    static void displayEvenNumbers(int n) 
    {
        System.out.println("Even numbers up to " + n + ":");
        for (int i = 2; i <= n; i += 2) 
	{
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) 
    {
	DataInputStream din;
	int n;
        din = new DataInputStream(System.in);
	try
	{
	System.out.print("Enter the value of 'n': ");
        n = Integer.parseInt(din.readLine());
        displayEvenNumbers(n);
	}
    	catch (Exception e) 
    	{
        	System.out.println("Error: " + e);
    	}
    }
}
