import java.util.Scanner;

public class FrequencyNested {

    public static String[] findCharacterFrequencies(String text) {
        char[] chars = text.toCharArray();
        int[] frequency = new int[chars.length];

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '0') continue;
            frequency[i] = 1;

            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    frequency[i]++;
                    chars[j] = '0';
                }
            }
        }

        int uniqueCount = 0;
        for (int freq : frequency) {
            if (freq > 0) uniqueCount++;
        }

        String[] result = new String[uniqueCount];
        int index = 0;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') {
                result[index++] = "Character: " + chars[i] + " | Frequency: " + frequency[i];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        String[] frequencies = findCharacterFrequencies(input);
        System.out.println("Character Frequencies:");
        for (String entry : frequencies) {
            System.out.println(entry);
        }
        scanner.close();
    }
}
