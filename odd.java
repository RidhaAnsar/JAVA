import java.util.Scanner;

public class odd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isOdd(number)) {
            System.out.println(number + " is odd.");
        } else {
            System.out.println(number + " is not odd.");
        }

        scanner.close();
    }

    // Function to check if a number is odd
    public static boolean isOdd(int num) {
        return num % 2 != 0;
    }
}
