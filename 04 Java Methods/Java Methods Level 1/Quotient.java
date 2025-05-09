import java.util.Scanner;

class Quotient{
	public static void findRemainderAndQuotient(int number,int divisor){
		int quotient=number/divisor, remainder=number%divisor;
		System.out.println("Quotient is "+quotient+" and remainder is "+remainder);
	}
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter number and divisor");
		int number=scn.nextInt(), divisor=scn.nextInt();
		Quotient quotient=new Quotient();
		quotient.findRemainderAndQuotient(number,divisor);
		scn.close();
	}
}