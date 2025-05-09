import java.util.Scanner;
public class LowerCase {
    public String lowerCase(String string){
        String substring="";
        for(int i=0;i<string.length();i++){
            char temp=string.charAt(i);
            if(temp>=65 && temp<=90) {
                substring += (char) (temp + 32);
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
        LowerCase obj=new LowerCase();
        String lowercase=obj.lowerCase(string), lowercase2=string.toLowerCase();
        System.out.println("Using lowercase method :"+lowercase);
        System.out.println("Using .toLower() method :"+lowercase2);
        System.out.println("Comparing both methods we get :"+obj.compare(lowercase,lowercase2));
        scn.close();
    }
}
