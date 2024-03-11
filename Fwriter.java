import java.io.*;
import java.util.*;
class Fwriter
{
	public static void main(String args[])
	{
		FileWriter fw;
		BufferedWriter bw;
		Scanner s=new Scanner (System.in);
		try
		{
			System.out.println("Enter a file");
			String fname=s.nextLine();
			
