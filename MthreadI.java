import java.io.*;
class cthread implements Runnable {
int n;
public cthread(int a)
{
n=a;
}
public void run() {
int i;
for(i=1;i<=n;i++)  {
System.out.print("\ti="+i);
}
}
}
class MthreadI {
public static void main(String args[])
{
cthread t1,t2;
Thread p,q;
t1=new cthread(100);
t2=new cthread(150);
p=new Thread(t1);
q=new Thread(t2);
System.out.println("before thread");
p.start();
System.out.println("between thread");
q.start();
System.out.println("after thread");
}
}
