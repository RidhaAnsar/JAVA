import java.io.*;
class person {
int age;
String name; 

public person() {
age=0;
name=" ";
}
public person (int a, String n)  {
age=a;
name=n;
}
public void disp() {
System.out.println("Name:"+name+ "age:"+age);
}
}
class teacher extends person {
String subject;
public teacher(int a,String n, String s)  {
 super(a,n);
 subject=s;
}
public void disp() {
System.out.println("subject:"+subject);
}
}
public class funoverloading_super {
    public static void main(String args[]) {
    person p=new person(20, "ABC");
    teacher t=new teacher(30, "XYZ", "MATHS");
    t.disp();
    p.disp();
}
}