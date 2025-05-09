import java.util.Scanner;

class KMtoMilesUser{
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		double KM=scn.nextDouble();
		double Miles=1.6*KM;
		System.out.print("The total miles is "+Miles+" miles for the given "+KM+" kms");
		scn.close();
	}
}