import java.io.*;
class person {
int age;
String name; 
}
public person() {
age=0;
name=" ";
}
public person (int a, String n)  {
age=a;
name=n;
}
public void disp() {
System.out.prinntln("Name:"+name+ "age:"+age);
}
class teacher extends person {
String subject;
public teacher(int a,String n, String s)  {
 sub=s;
}
public void disp {
System.out.println("subject:+subject):
}

public class funcoverloading{
    public static void main(String args[]) {
    p=new person(20, "ABC");
    q=new teacher(30, "XYZ", "MATHS");
    p.disp();
    t.disp();
}
}