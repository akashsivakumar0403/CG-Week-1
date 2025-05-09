import java.util.Scanner;

class Athlete{
	public double roundsToComplete(double side1,double side2,double side3){
		return 5000/(side1+side2+side3);
	}
	
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter sides of park");
		double side1=scn.nextDouble(),side2=scn.nextDouble(),side3=scn.nextDouble();
		Athlete athlete=new Athlete();
		double totalRounds=athlete.roundsToComplete(side1,side2,side3);
		System.out.print("Total rounds needed is "+totalRounds);
		scn.close();
	}
}