import java.util.Scanner;

class SumOfNumbers{
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int formula=(n*(n+1))/2,total=0;
		for(int i=0;i<=n;i++){
			total+=i;
		}
		System.out.printf("Total using formula is %d, and total using while loop is %d.",formula,total);
		scn.close();
	}
}