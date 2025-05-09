import java.util.Scanner;

class Numbers5 {
    public static boolean isPositive(int number) {
        return number >= 0;
    }
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
    public static int compare(int number1, int number2) {
        if (number1 > number2) return 1;
        else if (number1 < number2) return -1;
        return 0;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("Enter numbers");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scn.nextInt();
        }
        for (int i = 0; i < numbers.length; i++) {
            if (isPositive(numbers[i])) {
                System.out.print(numbers[i] + " Positive ");
                System.out.println(isEven(numbers[i]) ? "Even" : "Odd");
            } else {
                System.out.println(numbers[i] + " is Negative");
            }
        }

        int result = compare(numbers[0], numbers[numbers.length - 1]);
        if (result == 1) {
            System.out.println("First number is greater than last number");
        }
        else if (result == -1) {
            System.out.println("First number is less than last number");
        }
        else {
            System.out.println("First and last numbers are equal");
        }scn.close();
    }
}
