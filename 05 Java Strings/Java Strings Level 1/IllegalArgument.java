import java.util.Scanner;

public class IllegalArgument{

    public static void generateException(String input) {
        String result = input.substring(5, 2);
        System.out.println(result);
    }
    public static void handleException(String input) {
        try {
            String result = input.substring(5, 2);
            System.out.println(result);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException\n"+e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught a RuntimeException\n"+ e.getMessage());
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();
        //generateException(userInput);
        handleException(userInput);
    }
}
