import java.io.*;
public class Complex {
    private double real;
    private double imaginary;

    // Constructor
    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }


    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }

    // Method to add two complex numbers
    public Complex sum(Complex otherComplex) {
        double realSum = this.real + otherComplex.real;
        double imaginarySum = this.imaginary + otherComplex.imaginary;
        return new Complex(realSum, imaginarySum);
    }


    public static void main(String[] args) {
        // Creating complex numbers
        Complex complex1 = new Complex(3.5, 2.7);
        Complex complex2 = new Complex(1.2, -4.1);
        Complex result = complex1.sum(complex2);


        System.out.println("Result of addition: " + result.getReal() + " + " + result.getImaginary() + "i");
    }
}
