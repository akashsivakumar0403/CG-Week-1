import java.util.Scanner;

class Perimeter{
	public static void main(String[] args){
		Scanner scn= new Scanner(System.in);
		double perimeter=scn.nextDouble();
		double sides=perimeter/4.0;
		System.out.printf("The length of the side is %.2f whose perimeter is %.2f",sides,perimeter);
		scn.close();
	}
}