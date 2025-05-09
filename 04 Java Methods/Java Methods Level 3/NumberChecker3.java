import java.util.Scanner;
import java.util.Arrays;

public class NumberChecker3 {

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

    public static int[] reverseArray(int[] original) {
        int[] reversed = new int[original.length];
        for (int i = 0; i < original.length; i++) {
            reversed[i] = original[original.length - 1 - i];
        }
        return reversed;
    }

    public static boolean arraysEqual(int[] arr1, int[] arr2) {
        return Arrays.equals(arr1, arr2);
    }

    public static boolean isPalindrome(int[] digits) {
        int[] reversed = reverseArray(digits);
        return arraysEqual(digits, reversed);
    }

    public static boolean isDuckNumber(int[] digits) {
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scn.nextInt();

        int count = digitCount(number);
        int[] digits = storeDigits(number, count);
        int[] reversedDigits = reverseArray(digits);
        boolean isPalin = isPalindrome(digits);
        boolean isDuck = isDuckNumber(digits);

        System.out.println("Number of digits: " + count);
        System.out.print("Original digits: ");
        for (int d : digits) System.out.print(d + " ");
        System.out.print("\nReversed digits: ");
        for (int d : reversedDigits) System.out.print(d + " ");
        System.out.println("\nIs Palindrome? " + (isPalin ? "Yes" : "No"));
        System.out.println("Is Duck Number? " + (isDuck ? "Yes" : "No"));
    }
}
