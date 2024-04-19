import java.io.*;

class FahrenheitToCelsius {
    public static void main(String args[]) {
        int f;
        int c;

        try {
            DataInputStream din = new DataInputStream(System.in);
            System.out.println("Enter f:");
            f = Integer.parseInt(din.readLine());
            c = (f - 32) * 5 / 9;
            System.out.println("Temperature in Celsius: " + c);
        } catch (Exception e) {
            System.out.println("An error occurred: " + e);
        }
    }
}
