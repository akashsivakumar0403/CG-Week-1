import java.util.Scanner;

class FactorsWhile{
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		int number=scn.nextInt(),i=1;
		while(i<=number){
			if(number%i==0){
				System.out.println(i);
			}
			i++;
		}
		scn.close();
	}
}