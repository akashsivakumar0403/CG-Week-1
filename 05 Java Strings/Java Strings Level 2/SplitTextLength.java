import java.util.Scanner;

public class SplitTextLength {
    public static String[] splitUsingCharAt(String str) {
        int spaceCount = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                spaceCount++;
            }
        }
        int[] spaceIndexes = new int[spaceCount];
        int index = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                spaceIndexes[index++] = i;
            }
        }
        String[] words = new String[spaceCount + 1];
        int start = 0;
        for (int i = 0; i < spaceCount; i++) {
            words[i] = str.substring(start, spaceIndexes[i]);
            start = spaceIndexes[i] + 1;
        }
        words[spaceCount] = str.substring(start);
        return words;
    }

    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }

    public static String[][] generateWordLengthArray(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] words = splitUsingCharAt(str);
        String[][] wordLengthArray = generateWordLengthArray(words);
        for (int i = 0; i < wordLengthArray.length; i++) {
            System.out.println(wordLengthArray[i][0] + " " + Integer.parseInt(wordLengthArray[i][1]));
        }
    }
}
