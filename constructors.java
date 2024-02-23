
import java.io.*;
class person {
    int age;
    String name;

public person() {
    age= 0;
    name=" ";
}
public person(int a, String n) {
    age=a;
    name=n;
}
public void disp(){

    System.out.println("Name:"+name+ "Age:"+age);
}
}
public class constructors{
    public static void main(String args[]){
        person p, q;
        p=new person();
        q=new person(21, "abc");
        p.disp();
        q.disp();
    }
}