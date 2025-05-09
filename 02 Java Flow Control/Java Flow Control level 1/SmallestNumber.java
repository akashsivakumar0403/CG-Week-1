import java.util.Scanner;
class SmallestNumber{
	public static void main(String[] args){
		Scanner scn= new Scanner(System.in);
		int number1=scn.nextInt(), number2=scn.nextInt(), number3=scn.nextInt();
		if(number1<number2 && number1<number3){
			System.out.print("Is the first number the smallest? Yes");
		}else{
			System.out.print("Is the first number the smallest? No");			
		}
	}
}