import java.io.*;
class CThread extends Thread  {
int n;
public CThread(int a) {
n = a;
}
public void run() {
for(int i = 1;i <= n; i++) {
System.out.print("\ti= "+i);
}
}
}
class MThreadstart{
public static void main(String args[]) {
CThread t1,t2;
t1 = new CThread(100);
t2 = new CThread(150);
System.out.println("B4 Thread");
t1.start();
System.out.println("Between Thread");
t2.start(); 
System.out.println("After Thread");
}
}
