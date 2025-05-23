import java.util.Scanner;

public class NumberChecker4 {

    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    public static boolean isNeon(int number) {
        int square = number * number;
        int sum = 0;
        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == number;
    }

    public static boolean isSpy(int number) {
        int sum = 0, product = 1, digit;
        while (number > 0) {
            digit = number % 10;
            sum += digit;
            product *= digit;
            number /= 10;
        }
        return sum == product;
    }

    public static boolean isAutomorphic(int number) {
        int square = number * number;
        String numStr = String.valueOf(number);
        String squareStr = String.valueOf(square);
        return squareStr.endsWith(numStr);
    }

    public static boolean isBuzz(int number) {
        return number % 7 == 0 || number % 10 == 7;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scn.nextInt();

        System.out.println("Is Prime Number? " + (isPrime(number) ? "Yes" : "No"));
        System.out.println("Is Neon Number? " + (isNeon(number) ? "Yes" : "No"));
        System.out.println("Is Spy Number? " + (isSpy(number) ? "Yes" : "No"));
        System.out.println("Is Automorphic Number? " + (isAutomorphic(number) ? "Yes" : "No"));
        System.out.println("Is Buzz Number? " + (isBuzz(number) ? "Yes" : "No"));
    }
}
