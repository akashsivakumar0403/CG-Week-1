import java.util.Scanner;

class SwapNumbers{
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		int variable1=scn.nextInt(), variable2=scn.nextInt();
		int temperorary=variable1;
		variable1=variable2;
		variable2=temperorary;
		System.out.printf("The swapped numbers are  %d and %d",variable1,variable2);
		scn.close();
	}
}