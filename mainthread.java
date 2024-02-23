import java.io.*;
class cthread extends Thread {
int m,n;
public cthread(int a, int b)
{
m=a;
n=b;
}
public void run()
{
while(m!=n) 
{
System.out.print("\t"+m);
if(m<n) 
m++;
else 
m--;
}
System.out.print("\t"+m);
}
}
class mainthread {
public static void main(String args[]) {
cthread t1,t2;
int m,n;
Thread p,q;
DataInputStream din=new DataInputStream(System.in);
try {
System.out.println("enter m:");
m=Integer.parseInt(din.readLine());
System.out.println("enter n:");
n=Integer.parseInt(din.readLine());
t1=new cthread(m,n);
t2=new cthread(n,m);
p=new Thread(t1);
q=new Thread(t2);
System.out.println("before thread");
p.start();
System.out.println("between thread");
q.start();
}
catch(Exception e)
{
System.out.println("error:"+e);
}
}
}