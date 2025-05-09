import java.util.Scanner;
import java.lang.Math;

public class NumberChecker2 {

    public static int digitCount(int number) {
        int count = 0;
        while (number > 0) {
            number /= 10;
            count++;
        }
        return count;
    }

    public static int[] storeDigits(int number, int size) {
        int[] digits = new int[size];
        for (int i = size - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    public static int sumOfSquares(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }

    public static boolean isHarshad(int number, int[] digits) {
        int sum = sumOfDigits(digits);
        return number % sum == 0;
    }

    public static int[][] digitFrequency(int[] digits) {
        int[][] freq = new int[10][2];
        for (int i = 0; i < 10; i++) {
            freq[i][0] = i;
            freq[i][1] = 0;
        }
        for (int digit : digits) {
            freq[digit][1]++;
        }
        return freq;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scn.nextInt();

        int count = digitCount(number);
        int[] digits = storeDigits(number, count);

        int sum = sumOfDigits(digits);
        int squareSum = sumOfSquares(digits);
        boolean isHarshad = isHarshad(number, digits);
        int[][] frequency = digitFrequency(digits);

        System.out.println("Number of digits: " + count);
        System.out.println("Digits:");
        for (int digit : digits) {
            System.out.print(digit + " ");
        }
        System.out.println("\nSum of digits: " + sum);
        System.out.println("Sum of squares of digits: " + squareSum);
        System.out.println("Is Harshad Number? " + (isHarshad ? "Yes" : "No"));

        System.out.println("Digit Frequencies:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i][1] > 0) {
                System.out.println(frequency[i][0] + ": " + frequency[i][1] + " times");
            }
        }
    }
}
