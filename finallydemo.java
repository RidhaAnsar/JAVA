import java.io.*;
public class finallydemo {
public static void main(String args[])  {
  int a,b,c;
   String s;
DataInputStream din=new DataInputStream(System.in);
try {
   System.out.println("enter a:");
   s=din.readLine();
   a=Integer.parseInt(s);
   System.out.println("enter b:");
   s=din.readLine();
   b=Integer.parseInt(s);
   c=a+b;
  System.out.println("c="+c);
}
 catch(Exception e)
{
  System.out.println("error:"+e);
}
finally {
    System.out.println("i am always here");
}
}
}