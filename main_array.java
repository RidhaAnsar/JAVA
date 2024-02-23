
import java.io.*;
public class main_array
{
	public static void main(String[] args) {
    	int a[],n,i;
    	DataInputStream din = new DataInputStream(System.in);
    	try {
    	    System.out.println("Enter n");
    	    n = Integer.parseInt(din.readLine());
    	    a = new int[n];
    	    for(i = 0;i < n;i++)
    	    {
    	        System.out.println("Enter a[" + i + "]");
    	        a[i] = Integer.parseInt(din.readLine());
    	    }
    	    for(i=0;i < n;i++)
    	    {
    	        System.out.println(a[i]);
    	    }
    	} 
	catch(Exception e) {
		System.out.println(e);
    	}
	}
}