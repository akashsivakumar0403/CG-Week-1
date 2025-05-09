import java.util.Scanner;

class FeetConverter{
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		double Feet=scn.nextDouble();
		double Yards=Feet/3;
		double Miles=Yards/1760;
		System.out.printf("Distance in yards is %.2f, miles is %.2f, while in feet is %.2f",Yards,Miles,Feet);
		scn.close();
	}
}