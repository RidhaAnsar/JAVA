import java.util.Scanner;

public class remainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the dividend: ");
        int dividend = scanner.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = scanner.nextInt();

        if (isRemainderZero(dividend, divisor)) {
            System.out.println("The remainder of " + dividend + " divided by " + divisor + " is 0.");
        } else {
            System.out.println("The remainder of " + dividend + " divided by " + divisor + " is not 0.");
        }

        scanner.close();
    }

    // Function to check if the remainder of dividend divided by divisor is zero
    public static boolean isRemainderZero(int dividend, int divisor) {
        return dividend % divisor == 0;
    }
}
