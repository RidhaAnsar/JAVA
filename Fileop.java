import java.io.*;
class Fileop
{
	public static void main(String args[])
	{
		FileOutputStream f= new FileOutputStream("E:\\mscjava/test.txt");
		System.out.println("Enter data ...stop with#");
		while(true)
		{
			DataInputStream dis=new DataInputStream(System.in);
			String d=dis.readLine();
			if (d.equals("#"))
			break;
			else
			{
				f.write(d.getBytes());
				//f.write("r\n".getBytes());
			}
		}
	}
}