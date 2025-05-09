import java.util.Scanner;

class Calculator{
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		int number1=scn.nextInt();
		int number2=scn.nextInt();
		double Divide=(double)number1/(double)number2;
		int Multiply=number1*number2, Addition=number1+number2, Subtraction=number1-number2;
		System.out.printf("The addition, subtraction, multiplication and division value of 2 numbers %d and %d is %d, %d, %d, and %f",number1,number2,Addition,Subtraction,Multiply,Divide);
		scn.close();
	}
}