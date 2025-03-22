import java.util.Scanner;

public class NumberException {
    public static void generateException(String text) {
        int number = Integer.parseInt(text);
        System.out.println(number);
    }
    public static void handleException(String text) {
        try {
            int number = Integer.parseInt(text);
            System.out.println("Converted number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException\n"+ e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught a RuntimeException\n"+ e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String userInput = scanner.nextLine();
        //generateException(userInput);
        handleException(userInput);
    }
}
