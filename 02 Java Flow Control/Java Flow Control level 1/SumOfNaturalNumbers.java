import java.util.Scanner;

class SumOfNaturalNumbers{
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		int number=scn.nextInt(),total;
		if(number<=0){
			System.out.printf("The number %d is not a natural number",number);
		}else{
			total=(number*(number+1))/2;
			System.out.printf("The sum of %d natural numbers is %d",number,total);
		}
		scn.close();
	}
}