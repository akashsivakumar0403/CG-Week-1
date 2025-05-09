import java.util.Scanner;

class SumOfNumbers{
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int formula=(n*(n+1))/2;
		int loop=0,total=0;
		while(loop<=n){
			total+=loop;
			loop++;
		}
		System.out.printf("Total using formula is %d, and total using while loop is %d.",formula,total);
		scn.close();
	}
}