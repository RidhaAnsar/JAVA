public class CeilFunction {
    public static double ceil(double num) {
        return Math.ceil(num);
    }

    public static void main(String[] args) {
        double num = 3.14;
        double roundedNum = ceil(num);
        System.out.println("Ceiling of " + num + " is " + roundedNum); // Output: Ceiling of 3.14 is 4.0
    }
}
