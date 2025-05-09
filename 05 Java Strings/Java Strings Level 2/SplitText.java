import java.util.Scanner;
class SplitText {
    public String[] splitUsingCharAt(String str) {
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
    public boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SplitText obj=new SplitText();
        String str = sc.nextLine();
        String[] wordsCharAt = obj.splitUsingCharAt(str);
        String[] wordsBuiltIn = str.split(" ");
        for(String i:wordsCharAt){
            System.out.println(i);
        }
        for(String i: wordsBuiltIn){
            System.out.println(i);
        }
        boolean result = obj.compareArrays(wordsCharAt, wordsBuiltIn);
        System.out.println(result);
    }
}
