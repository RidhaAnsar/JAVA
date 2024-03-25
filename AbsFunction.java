public class AbsFunction {
    public static int abs(int num) {
        return Math.abs(num);
    }

    public static void main(String[] args) {
        int num = -10;
        int absNum = abs(num);
        System.out.println("Absolute value of " + num + " is " + absNum); // Output: Absolute value of -10 is 10
    }
}
