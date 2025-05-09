import java.util.Scanner;

public class IndexException {
    public static void generateException(String input) {
        char ch = input.charAt(input.length()+1);
        System.out.println(ch);
    }
    public static void handleException(String input) {
        try {
            char ch = input.charAt(input.length()+1);
            System.out.println(ch);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException\n"+e.getMessage());
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput = scn.nextLine();
        //generateException(userInput);
        handleException(userInput);
    }
}
