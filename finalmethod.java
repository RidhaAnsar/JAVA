//final method
import java.io.*;
class cbase {
public final void disp() {
System.out.println("final method in disp class"); }
public void show() {
System.out.println("show method in base class"); } }
class cderived extends cbase {
public void show() {
super.show();
System.out.println("show method in DC");
}}
public class finalmethod {
public static void main(String args[]) {
cderived obj=new cderived();
obj.disp();
obj.show();
}}