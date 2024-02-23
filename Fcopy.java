import java.io.*;
import java.util.*;
class FCopy {
public static void main(String args[]) {
FileInputStream fin;
FileOutputStream fout;
Scanner s = new Scanner(System.in);
String fname1,fname2;
try {
System.out.println("Enter the source file name");
fname1 = s.nextLine();
System.out.println("Enter the destination file name");
fname2 = s.nextLine();
fin = new FileInputStream(fname1);
fout = new FileOutputStream(fname2);
byte b[];
b = new byte[5];
int n = fin.read(b,0,5);
while(n != -1) {
fout.write(b,0,n);
n = fin.read(b,0,5);
}
fin.close();
fout.close(); }
catch(Exception e) {
System.out.println("Error " + e);
}
  }
}