import java.util.Scanner;

class LeapYear{
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		int year=scn.nextInt();
		if(year>=1852){
			if(year%4==0){
				if(year%100==0){
					if(year%400==0){
						System.out.print(year+" is a leap year");
					}else{
						System.out.print(year+ " is not a leap year");
					}
				}else{
					System.out.print(year+" is a leap year");
				}
			}else{
				System.out.print(year+ " is not a leap year");
			}
		}else{
			System.out.print(year+ " is not a leap year");
		}
	}
}