import java.util.Scanner;

class QuotientandReminder{
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		double number1=scn.nextDouble();
		double number2=scn.nextDouble();
		double quotient=number1/number2, modulo=number1%number2;
		System.out.printf("The Quotient is %.0f and Reminder is %.0f of two number %.0f and %.0f",quotient,modulo,number1,number2);
		scn.close();
	}
}