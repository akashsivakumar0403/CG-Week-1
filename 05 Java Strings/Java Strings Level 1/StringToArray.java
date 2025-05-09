import java.util.Scanner;

public class StringToArray {
    public char[] stringToArray(String string){
        char[] array=new char[string.length()];
        for(int i=0;i<string.length();i++){
            array[i]=string.charAt(i);
        }
        return array;
    }
    public boolean compare(char[] array1,char[] array2){
        int count=0;
        for(int i=0;i<array1.length;i++) {
            if (array1[i] != array2[i]) {
                count++;
            }
            if(count!=0){
                return false;
            }else{
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter string");
        String string=scn.nextLine();
        StringToArray obj=new StringToArray();
        char[] array1=obj.stringToArray(string);
        char[] array2=string.toCharArray();
        System.out.println(obj.compare(array1,array2));
        scn.close();
    }
}
