import java.io.*;
public class swapping {
    public static void main(String args[]) throws IOException {
        int temp;
        DataInputStream din = new DataInputStream (System.in);
        System.out.println("enter a:");
        int a = Integer.parseInt(din.readLine());
        System.out.println("enter b:");
        int b = Integer.parseInt(din.readLine());
        System.out.println("a is"+a+ "b is"+b);
        System.out.println("After swapping:");
        temp=a;
        a=b;
        b=temp;
        System.out.println("a is"+a+ "b is"+b);
        
    }
}
