import java.util.Scanner;

class HeightConvert{
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		int CM=scn.nextInt();
		double Inches=(double) CM/2.54;
		double Feet=Inches/12;
		System.out.print("Your Height in cm is "+CM+" while in feet is "+Feet+" and inches is "+Inches);
		scn.close();
	}
}