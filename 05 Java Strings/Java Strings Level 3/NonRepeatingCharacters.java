import java.util.Scanner;
public class NonRepeatingCharacters {
    public static char findFirstNonRepeatingCharacter(String text) {
        int[] frequency = new int[256];
        int length = getStringLength(text);
        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            frequency[currentChar]++;
        }
        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            if (frequency[currentChar] == 1) {
                return currentChar;
            }
        }
        return '\0';
    }
    public static int getStringLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }
    public static void displayResult(char result) {
        if (result == '\0') {
            System.out.println("No non-repeating character found.");
        } else {
            System.out.println("The first non-repeating character is: " + result);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String text = sc.nextLine();
        char result = findFirstNonRepeatingCharacter(text);
        displayResult(result);
    }
}
