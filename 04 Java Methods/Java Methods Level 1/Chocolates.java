import java.util.Scanner;

class Chocolates{
	public static void divideChocolates(int children,int chocolates){
		int divided=chocolates/children, remainder=chocolates%children;
		System.out.println("Chocolates per child is "+divided+" and remainder is "+remainder);
	}
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter number of children and number of chocolates");
		int children=scn.nextInt(), chocolates=scn.nextInt();
		Chocolates quotient=new Chocolates();
		quotient.divideChocolates(children,chocolates);
		scn.close();
	}
}