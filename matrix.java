3 3 4
import java.io.*;
public class matrix
{
public static void main(String[] args) {
System.out.println("ridha ansar");
int[][] a = { { 1, 2, 3 },
{ 2, 1, 1 } };
for (int i = 0; i < 2; i++) {
for (int j = 0; j < 3; j++) {
System.out.print(a[i][j] + " ");
}
System.out.print("| ");
int row = 0;
for (int j = 0; j < 3; j++) {
row += a[i][j];
}
System.out.println(row);
}
System.out.println("....");
for (int j = 0; j < 3; j++) {
int col = 0;

for (int i = 0; i < 2; i++) {
col += a[i][j];
}
System.out.print(col + " ");
}
}
}