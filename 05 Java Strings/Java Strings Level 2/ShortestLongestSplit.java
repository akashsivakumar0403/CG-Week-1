import java.util.Scanner;

public class ShortestLongestSplit {
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

    public static int[] findShortestLongest(String[][] wordArray) {
        int shortest = Integer.parseInt(wordArray[0][1]);
        int longest = shortest;
        for (int i = 1; i < wordArray.length; i++) {
            int length = Integer.parseInt(wordArray[i][1]);
            if (length < shortest) {
                shortest = length;
            }
            if (length > longest) {
                longest = length;
            }
        }
        return new int[]{shortest, longest};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] words = splitUsingCharAt(str);
        String[][] wordLengthArray = generateWordLengthArray(words);
        int[] result = findShortestLongest(wordLengthArray);
        System.out.println("Shortest: " + result[0]);
        System.out.println("Longest: " + result[1]);
    }
}
