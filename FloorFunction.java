public class FloorFunction {
    public static double floor(double num) {
        return Math.floor(num);
    }

    public static void main(String[] args) {
        double num = 3.14;
        double roundedNum = floor(num);
        System.out.println("Floor of " + num + " is " + roundedNum); // Output: Floor of 3.14 is 3.0
    }
}
