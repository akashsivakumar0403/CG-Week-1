import java.util.Scanner;
public class LeapYear {
    public void leapYear(int year){
        if((year>=1852)&&((year%4==0 && year%100!=0) || (year%4==0 && (year%100==0 && year%400==0)))){
            System.out.print(year+" is a leap year");
        }else{
            System.out.print(year+ " is not a leap year");
        }
    }
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter year");
        int year=scn.nextInt();
        LeapYear obj=new LeapYear();
        obj.leapYear(year);
        scn.close();
    }
}
