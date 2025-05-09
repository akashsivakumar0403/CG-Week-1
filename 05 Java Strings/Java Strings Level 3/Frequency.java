import java.util.Scanner;

public class Frequency {

    public static String[][] findCharacterFrequency(String text) {
        int[] frequency = new int[256];
        int length = getStringLength(text);

        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            frequency[currentChar]++;
        }

        int uniqueCount = 0;
        for (int i = 0; i < length; i++) {
            if (frequency[text.charAt(i)] != 0) {
                uniqueCount++;
                frequency[text.charAt(i)] = 0;
            }
        }

        String[][] result = new String[uniqueCount][2];
        int index = 0;
        frequency = new int[256];

        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            frequency[currentChar]++;
        }

        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            if (frequency[currentChar] != 0) {
                result[index][0] = String.valueOf(currentChar);
                result[index][1] = String.valueOf(frequency[currentChar]);
                frequency[currentChar] = 0;
                index++;
            }
        }

        return result;
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

    public static void displayCharacterFrequency(String[][] result) {
        System.out.println("Character  Frequency");
        for (int i = 0; i < result.length; i++) {
            System.out.println("    " + result[i][0] + "          " + result[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String text = sc.nextLine();

        String[][] result = findCharacterFrequency(text);
        displayCharacterFrequency(result);
    }
}
