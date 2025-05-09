import java.util.Scanner;

class IntOperations{
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		int a=scn.nextInt();
		int b=scn.nextInt();
		int c=scn.nextInt();
		System.out.printf("The results of Int Operations are %d, %d, %d, and %d",a+b*c,a*b+c,c+a/b,a%b+c);
		scn.close();
	}
}