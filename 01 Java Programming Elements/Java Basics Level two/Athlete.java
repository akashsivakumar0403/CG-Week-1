import java.util.Scanner;

class Athlete{
	public static void main(String[] args){
		Scanner scn= new Scanner(System.in);
		double side1=scn.nextDouble(), side2=scn.nextDouble(), side3=scn.nextDouble();
		double possibleLaps=5000/(side1+side2+side3);
		System.out.printf("The total number of rounds the athlete will run is %.1f to complete 5 km",possibleLaps);
		scn.close();
	}
}