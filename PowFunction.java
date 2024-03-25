public class PowFunction {
    public static double pow(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    public static void main(String[] args) {
        double base = 2.0;
        double exponent = 3.0;
        double result = pow(base, exponent);
        System.out.println(base + " raised to the power of " + exponent + " is " + result); // Output: 2.0 raised to the power of 3.0 is 8.0
    }
}
