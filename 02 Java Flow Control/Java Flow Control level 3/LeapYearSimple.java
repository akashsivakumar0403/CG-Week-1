import java.util.Scanner;

class LeapYearSimple{
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		int year=scn.nextInt();
		if((year>=1852)&&((year%4==0 && year%100!=0) || (year%4==0 && (year%100==0 && year%400==0)))){
			System.out.print(year+" is a leap year");
		}else{
				System.out.print(year+ " is not a leap year");
			}
	}
}
