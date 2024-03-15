package package1;
import java.util.ArrayList;
import java.util.List;
public class PrimeFactorsCalculator {
public static List<Integer> calculatePrimeFactors(int number) {
List<Integer> primeFactors = new ArrayList<Integer>();
for (int i = 2; i <= number; i++) {
while (number % i == 0) {
primeFactors.add(i);
number /= i;
}
}
return primeFactors;
}
}

import package1.PrimeFactorsCalculator;
import java.util.List;
import java.util.Scanner;
public class PrimeFactorsApp {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter a number to find its prime factors: ");
int number = scanner.nextInt();
List<Integer> primeFactors = PrimeFactorsCalculator.calculatePrimeFactors(number);
System.out.println("Prime factors of " + number + ": " + primeFactors);
}
}
