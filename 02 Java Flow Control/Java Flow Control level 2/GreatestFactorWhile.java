import java.util.Scanner;

class GreatestFactorsWhile{
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		int number=scn.nextInt(),count=number-1,greatestFactor=0;
		while(count>=1){
			if(number%count==0){
				greatestFactor=count;
				break;
			}
			count--;
		}
		System.out.print(greatestFactor);
		scn.close();
	}
}