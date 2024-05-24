import java.util.Scanner;

public class ReplaceSubstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the original string: ");
        String original = scanner.nextLine();
        System.out.print("Enter the substring to replace: ");
        String toReplace = scanner.nextLine();
        System.out.print("Enter the replacement substring: ");
        String replacement = scanner.nextLine();
        String result = original.replace(toReplace, replacement);
        System.out.println("Resulting string: " + result);
    }
}
