import java.util.Scanner;

class PoundtoKG{
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		double pounds=scn.nextDouble();
		double KG=pounds*2.2;
		System.out.printf("The weight of the person in pounds is %.2f and in kg is %.2f",pounds,KG);
		scn.close();
	}
}