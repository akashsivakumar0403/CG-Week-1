import java.util.Scanner;

public class NumberChecker5 {

    public static int[] findFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) count++;
        }

        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) factors[index++] = i;
        }

        return factors;
    }

    public static int greatestFactor(int[] factors) {
        int max = Integer.MIN_VALUE;
        for (int factor : factors) {
            if (factor > max) max = factor;
        }
        return max;
    }

    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int f : factors) sum += f;
        return sum;
    }

    public static long productOfFactors(int[] factors) {
        long product = 1;
        for (int f : factors) product *= f;
        return product;
    }

    public static double productOfCubesOfFactors(int[] factors) {
        double product = 1;
        for (int f : factors) {
            product *= Math.pow(f, 3);
        }
        return product;
    }

    public static boolean isPerfectNumber(int number, int[] factors) {
        int sum = 0;
        for (int i = 0; i < factors.length - 1; i++) {  // Exclude the number itself
            sum += factors[i];
        }
        return sum == number;
    }

    public static boolean isAbundantNumber(int number, int[] factors) {
        int sum = 0;
        for (int i = 0; i < factors.length - 1; i++) {
            sum += factors[i];
        }
        return sum > number;
    }

    public static boolean isDeficientNumber(int number, int[] factors) {
        int sum = 0;
        for (int i = 0; i < factors.length - 1; i++) {
            sum += factors[i];
        }
        return sum < number;
    }

    public static boolean isStrongNumber(int number) {
        int sum = 0;
        int temp = number;
        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == number;
    }

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) fact *= i;
        return fact;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scn.nextInt();

        int[] factors = findFactors(number);

        System.out.print("Factors: ");
        for (int f : factors) System.out.print(f + " ");
        System.out.println();

        System.out.println("Greatest Factor: " +greatestFactor(factors));
        System.out.println("Sum of Factors: " + sumOfFactors(factors));
        System.out.println("Product of Factors: " + productOfFactors(factors));
        System.out.println("Product of Cubes of Factors: " + productOfCubesOfFactors(factors));
        System.out.println("Is Perfect Number? " + (isPerfectNumber(number, factors) ? "Yes" : "No"));
        System.out.println("Is Abundant Number? " + (isAbundantNumber(number, factors) ? "Yes" : "No"));
        System.out.println("Is Deficient Number? " + (isDeficientNumber(number, factors) ? "Yes" : "No"));
        System.out.println("Is Strong Number? " + (isStrongNumber(number) ? "Yes" : "No"));
    }
}
