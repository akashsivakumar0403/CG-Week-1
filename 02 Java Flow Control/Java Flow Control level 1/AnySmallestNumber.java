import java.util.Scanner;
class AnySmallestNumber{
	public static void main(String[] args){
		Scanner scn= new Scanner(System.in);
		int number1=scn.nextInt(), number2=scn.nextInt(), number3=scn.nextInt();
		String first="No",second="No", third="No";
		if(number1>number2 && number1>number3){
			first="Yes";
		}else if(number1<number2 && number2>number3){
			second="Yes";			
		}else if(number3>number2 && number3>number1){
			third="Yes";			
		}
		System.out.printf("Is the first number the largest? %s\nIs the second number the largest? %s\nIs the third number the largest? %s",first,second,third);
		scn.close();

	}
}