import java.util.Scanner;
class PositiveNegative{
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		int number=scn.nextInt();
		if(number<0){
			System.out.printf("Negative");
		}else if(number>0){
			System.out.printf("Positive");		
		}else{
			System.out.printf("Zero");		
		}
		scn.close();
	}
}