import java.util.Scanner;

public class CompareStrings {
    public boolean characterAt(String word, String word2) {
        word = word.trim();
        word2 = word2.trim();
        int count = 0;
        if (word.length() != word2.length()) {
            return false;
        } else {
            int length = word.length();
            for (int i = 0; i < length; i++) {
                if (word.charAt(i) != word2.charAt(i)) {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter string 1 and 2");
        String string1=scn.nextLine();
        String string2=scn.nextLine();
        CompareStrings obj=new CompareStrings();
        System.out.println("Using charAt() method: "+obj.characterAt(string1,string2));
        System.out.println(string1.equals("Using .equals(): "+string2));
        scn.close();
    }
}
