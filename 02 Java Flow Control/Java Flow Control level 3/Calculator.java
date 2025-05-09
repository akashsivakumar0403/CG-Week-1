import java.util.Scanner;

class Calculator{
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		double first=scn.nextDouble(), second=scn.nextDouble(),calc=0;
		scn.nextLine();
		String op=scn.nextLine();
		switch(op){
			case "+":
				calc=first+second;
				break;
			case "-":
				calc=first-second;
				break;
			case "*":
				calc=first*second;
				break;
			case "/":
				calc=first/second;
				break;
		}
		System.out.printf("%.1f %s %.1f = %.1f",first,op,second,calc);
	}
}