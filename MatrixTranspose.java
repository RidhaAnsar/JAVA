import java.util.Scanner;

public class MatrixTranspose {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input matrix dimensions
        System.out.print("Enter the number of rows in the matrix: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns in the matrix: ");
        int columns = scanner.nextInt();
        
        int[][] matrix = new int[rows][columns];
        
        // Input matrix elements
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        
        // Display the original matrix
        System.out.println("Original Matrix:");
        displayMatrix(matrix);
        
        // Find and display the transpose of the matrix
        int[][] transpose = findTranspose(matrix);
        System.out.println("Transpose of the Matrix:");
        displayMatrix(transpose);
        
        scanner.close();
    }
    
    // Method to find the transpose of a matrix
    public static int[][] findTranspose(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        
        int[][] transpose = new int[columns][rows];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        
        return transpose;
    }
    
    // Method to display a matrix
    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
