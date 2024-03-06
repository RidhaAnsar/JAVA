import java.io.*;
public class num
{
public static void main(String[] args) {
System.out.println("Ridha ansar");
int m,n;
DataInputStream din = new DataInputStream(System.in);
try{
System.out.println("enter m:");
m=Integer.parseInt(din.readLine());
System.out.println("enter n:");
n=Integer.parseInt(din.readLine());
System.out.println("Number from " +m+" to" +n);
while(m<=n)
{
System.out.println(m);
m++;
}

}
catch(Exception e)
{
System.out.println("error:"+e);
}
}
}