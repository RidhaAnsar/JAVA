import java.io.*;

class TransposeMatrix {
    public static void main(String args[]) {
        int r, c;
        int i, j;
        DataInputStream din = new DataInputStream(System.in);
        try {

            System.out.println("Enter rows:");
            r = Integer.parseInt(din.readLine());

            System.out.println("Enter columns:");
            c = Integer.parseInt(din.readLine());

            int matrix[][] = new int[r][c];
            int transpose[][] = new int[c][r]; // Corrected the size of transpose matrix

            // Input matrix elements
            System.out.println("Enter matrix elements:");
            for (i = 0; i < r; i++) {
                for (j = 0; j < c; j++) {
                    matrix[i][j] = Integer.parseInt(din.readLine());
                }
            }

            // Compute transpose
            for (i = 0; i < r; i++) {
                for (j = 0; j < c; j++) {
                    transpose[j][i] = matrix[i][j];
                }
            }

            // Print original matrix
            System.out.println("Original Matrix:");
            for (i = 0; i < r; i++) {
                for (j = 0; j < c; j++)
                    System.out.print("\t" + matrix[i][j]);

                System.out.println();
            }

            // Print transpose matrix
            System.out.println("Transpose Matrix:");
            for (i = 0; i < c; i++) {
                for (j = 0; j < r; j++) {
                    System.out.print("\t" + transpose[i][j]);
                }
                System.out.println();
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
