import java.io.*;
class person {
int age;
String name;

public person(int a, String n) {
	age=a;
	name=n;
}
public void disp()  {
	System.out.println("name:"+name);
	System.out.println("age:"+age);
}}
class teacher extends person {
String subject;
public teacher(int a, String n, String s) {
super(a,n);
	subject=s;
}

public void disp() {
super.disp();
	System.out.println("subject:"+subject);
} }

public class mainp{
public static void main(String args[]) {
person p=new person(25, "kappi");
teacher t=new teacher(26, "soso", "english");
p.disp();
t.disp();
}
}