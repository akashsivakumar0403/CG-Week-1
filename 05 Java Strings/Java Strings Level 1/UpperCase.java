import java.util.Scanner;
public class UpperCase {
    public String upperCase(String string){
        String substring="";
        for(int i=0;i<string.length();i++){
            char temp=string.charAt(i);
            if(temp>=97 && temp<=122) {
                substring += (char) (temp - 32);
            }else{
                substring += temp;
            }
        }
        return substring;
    }
    public boolean compare(String string1, String string2){
        if(string1.equals(string2)){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter String");
        String string=scn.nextLine();
        UpperCase obj=new UpperCase();
        String uppercase=obj.upperCase(string), uppercase2=string.toUpperCase();
        System.out.println("Using uppercase method :"+uppercase);
        System.out.println("Using .toUpper() method :"+uppercase2);
        System.out.println("Comparing both methods we get :"+obj.compare(uppercase,uppercase2));
        scn.close();
    }
}
