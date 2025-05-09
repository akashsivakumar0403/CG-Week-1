import java.util.Scanner;

class GreatestFactors{
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		int number=scn.nextInt();
		for(int i=number-1;i>=1;i--){
			if(number%i==0){
				System.out.println(i);
				break;
			}
		}
		scn.close();
	}
}