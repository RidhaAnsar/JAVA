import java.io.*;
class student {
   int age;
   String name;
  
public void reads {
DataInputStream din=new DataInputStream(System.in);
try {
     System.out.println("Enter name:");
      name=din.readLine();
      System.out.println("enter age:");
     age=Integer.parseInt(din.readLine());
    }
catch(Exception e) {
System.out.println("error:"+e);
 }
}
public void disps  {
	System.out.println("Name:"+name+ "age:"+age);
 }
}

class teacher extends student {
String sub;
 public void readt  {
DataInputStream din=new DataInputStream(System.in);
try {
   System.out.println("Enter subject:");
   sub=din.readLine();
   }
catch(Exception e)
{
System.out.println("error:"+e);
}
}
public class inheritenceexample {
    public static void main(String[] args) {
        student s = new student();
        teacher t = new teacher();
        s.readp();
        t.readp();
        t.readt();
        s.dispp();
        t.dispp();
        t.dispt();

    }

}