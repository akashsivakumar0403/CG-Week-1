import java.util.Scanner;

class SumNumbers{
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		double total=0, entered=scn.nextDouble();
		
		while(entered!=0.0){
			total+=entered;
			entered=scn.nextDouble();
		}
		System.out.print(total);
		scn.close();
	}
}