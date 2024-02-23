import java.io.*;
class complex{
float r, i;
public void read(){
DataInputStream din=new DataInputStream(System.in);
try{
System.out.println("enter the value of r:");
r=Float.parseFloat(din.readLine());
System.out.println("enter the value of i:");
i=Float.parseFloat(din.readLine());
}
catch(Exception e)
{
System.out.println("error:"+e);
}
}
public void disp()
{
System.out.println("r="+r+ "i="+i);
}
public complex add(complex q)
{
complex t=new complex();
t.r=r+q.r;
t.i=i+q.i;
return t;
}
public complex prod(complex q)
{
complex t=new complex();
t.r=r*q.r-i*q.i;
t.i=r*q.i-i*q.r;
return t;
}
}
class complexnumbers
{
public static void main(String args[])
{
complex p,q,r;
p=new complex();
q=new complex();
p.read();
q.read();
System.out.println("sum:);
r=p.add(q);
p.disp();
q.disp();
r.disp();
System.out.println("Product");
r=p.prod(q);
p.disp();
q.disp();
r.disp();
}
}
