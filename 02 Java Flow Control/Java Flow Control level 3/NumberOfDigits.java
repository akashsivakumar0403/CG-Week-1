import java.util.Scanner;
class NumberOfDigits{
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		int number=scn.nextInt(),originalNumber=number,remainder=0,total=0;
		while(number>0){
			remainder=(number-(number%10))/10;
			total++;
			number=remainder;
		}
		System.out.print(total+" digits in number "+originalNumber);
		scn.close();
	}
}