import java.util.Scanner;

class DivisibleBy5{
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		int number=scn.nextInt();
		if(number%5==0){
			System.out.printf("Is the number %d divisible by 5? Yes",number);
		}else{
			System.out.printf("Is the number %d divisible by 5? No",number);
		}
		scn.close();
	}
}