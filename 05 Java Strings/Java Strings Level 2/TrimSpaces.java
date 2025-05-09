import java.util.Scanner;

public class TrimSpaces {
    public static int[] trimSpaces(String str) {
        int start = 0, end = str.length() - 1;
        while (start <= end && str.charAt(start) == ' ') {
            start++;
        }
        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }
        return new int[]{start, end + 1};
    }
    public static String createSubstring(String str, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += str.charAt(i);
        }
        return result;
    }
    public static boolean compareUsingCharAt(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int[] trimIndexes = trimSpaces(str);
        String trimmedCharAt = createSubstring(str, trimIndexes[0], trimIndexes[1]);
        String trimmedBuiltIn = str.trim();
        boolean result = compareUsingCharAt(trimmedCharAt, trimmedBuiltIn);
        System.out.println(result);
    }
}
