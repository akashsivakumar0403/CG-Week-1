import java.util.Scanner;

class SpringSeason{
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		String month=scn.nextLine();
		int date=scn.nextInt();
		if(month.equals("March")){
			if(date>=20){
				System.out.print("It's a Spring Season");
			}else{
				System.out.print("Not a Spring Season ");
			}
		}else if(month.equals("April") || month.equals("May")){
			System.out.print("It's a Spring Season");
		}else if(month.equals("June")){
			if(date<=20){
				System.out.print("It's a Spring Season");
			}else{
			System.out.print("Not a Spring Season ");
			}
		}else{
			System.out.print("Not a Spring Season ");
		}
	}
}