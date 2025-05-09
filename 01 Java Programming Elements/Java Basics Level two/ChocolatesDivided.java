import java.util.Scanner;

class ChocolatesDivided{
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		int chocolates=scn.nextInt(), children=scn.nextInt();
		int chocolatesDivided=chocolates/children;
		int remainingChocolates=chocolates%children;
		System.out.printf("The number of chocolates each child gets is %d and the number of remaining chocolates are %d",chocolatesDivided,remainingChocolates);
		scn.close();
	}
}