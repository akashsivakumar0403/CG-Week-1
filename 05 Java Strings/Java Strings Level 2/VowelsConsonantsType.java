import java.util.Scanner;
public class VowelsConsonantsType{
    public static String checkCharacterType(char ch) {
        ch = (ch >= 'A' && ch <= 'Z') ? (char) (ch + 32) : ch;
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }
        return "Not a Letter";
    }
    public static String[][] analyzeString(String str) {
        String[][] result = new String[str.length()][2];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            result[i][0] = String.valueOf(ch);
            result[i][1] = checkCharacterType(ch);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String[][] result = analyzeString(str);
        for (String[] row : result) {
            System.out.println(row[0] + " - " + row[1]);
        }
    }
}
