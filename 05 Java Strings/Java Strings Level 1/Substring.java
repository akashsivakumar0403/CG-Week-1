import java.util.Scanner;
public class Substring {
    public String substring(int start,int end,String string){
        String substring="";
        for(int i=start;i<end;i++){
            char temp=string.charAt(i);
            substring+=temp;
        }
        return substring;
    }
    public boolean compare(String substring1, String substring2){
        if(substring1.equals(substring2)){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter String");
        String string=scn.nextLine();
        System.out.println("Enter start and end index");
        int start=scn.nextInt(),end=scn.nextInt();
        Substring obj=new Substring();
        String substring1=obj.substring(start,end,string);
        String substring2=string.substring(start,end);
        System.out.println("Using substring method :"+substring1);
        System.out.println("Using .substring() :"+substring2);
        System.out.println("Comparing both methods we get :"+obj.compare(substring1,substring2));
        scn.close();
    }
}
