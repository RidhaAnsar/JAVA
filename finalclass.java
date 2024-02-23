//final class
import java.io.*;
final class cbase {
public void disp() {
System.out.println("final method"); }
}
class cderived extends cbase {
public void disp() {
System.out.println("final method");
}
}
public class finalclass {
public static void main(String args[]) {
cderived obj=new cderived();
obj.disp(); } }