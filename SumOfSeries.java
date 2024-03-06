import java.io.*;
public class SumOfSeries {

public static void main(String[] args) {

int n, sum = 0;
int i = 1;
int tempSum = 0;
DataInputStream din=new DataInputStream(System.in);
try {
System.out.println("enter n:");
n = Integer.parseInt(din.readLine());
while (i <= n) {
tempSum += i;
sum += tempSum;
i++;
}
}
catch(Exception e)
{
System.out.println("error:"+e);
}

System.out.println("The sum of the series is: " + sum);
}}