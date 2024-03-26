import java.util.Scanner;

public class divisible {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        if (isDivisible(num1, num2)) {
            System.out.println(num1 + " is divisible by " + num2);
        } else {
            System.out.println(num1 + " is not divisible by " + num2);
        }

        scanner.close();
    }

    // Function to check if num1 is divisible by num2
    public static boolean isDivisible(int num1, int num2) {
        return num1 % num2 == 0;
    }
}
