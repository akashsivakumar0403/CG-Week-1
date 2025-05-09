import java.util.Scanner;

class Bonus{
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		double salary=scn.nextDouble(), years=scn.nextDouble(),bonus=0;
		if(years>5){
			bonus=0.05*salary;
		}
		System.out.printf("Bonus is %.2f, and total is %.2f",bonus,bonus+salary);
	}
}