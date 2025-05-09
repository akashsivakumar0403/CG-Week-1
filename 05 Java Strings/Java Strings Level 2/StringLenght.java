import java.util.Scanner;

public class StringLenght {
    public int stringLength(String user){
        int count=0;
        while(true){
            count++;
            try{
                user.charAt(count-1);
            } catch (Exception e) {
                count--;
                break;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String user=scn.next();
        StringLenght obj=new StringLenght();
        System.out.println("lenght(): "+user.length());
        System.out.println("Length method: "+obj.stringLength(user));
    }
}
