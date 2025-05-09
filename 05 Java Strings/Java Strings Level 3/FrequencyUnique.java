import java.util.Scanner;

public class FrequencyUnique {

    public static char[] findUniqueCharacters(String text) {
        String uniqueChars = "";

        for (int i = 0; i < text.length(); i++) {
            char current = text.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < text.length(); j++) {
                if (i != j && current == text.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                uniqueChars += current;
            }
        }

        return uniqueChars.toCharArray();
    }

    public static String[][] findCharacterFrequencies(String text) {
        int[] frequency = new int[256];

        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }

        char[] uniqueChars = findUniqueCharacters(text);
        String[][] result = new String[uniqueChars.length][2];

        for (int i = 0; i < uniqueChars.length; i++) {
            result[i][0] = String.valueOf(uniqueChars[i]);
            result[i][1] = String.valueOf(frequency[uniqueChars[i]]);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String[][] frequencies = findCharacterFrequencies(input);

        System.out.println("Character Frequencies:");
        for (String[] entry : frequencies) {
            System.out.println("Character: " + entry[0] + " | Frequency: " + entry[1]);
        }

        scanner.close();
    }
}