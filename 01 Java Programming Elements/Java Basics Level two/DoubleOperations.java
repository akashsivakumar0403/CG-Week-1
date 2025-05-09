import java.util.Scanner;

class DoubleOperations{
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		double a=scn.nextDouble();
		double b=scn.nextDouble();
		double c=scn.nextDouble();
		System.out.printf("The results of Int Operations are %f, %f, %f, and %f",a+b*c,a*b+c,c+a/b,a%b+c);
		scn.close();
	}
}