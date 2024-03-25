public class SqrtFunction {
    public static double sqrt(double num) {
        return Math.sqrt(num);
    }

    public static void main(String[] args) {
        double num = 25.0;
        double squareRoot = sqrt(num);
        System.out.println("Square root of " + num + " is " + squareRoot); // Output: Square root of 25.0 is 5.0
    }
}
