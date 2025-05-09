import java.util.Scanner;

class PositiveNegative{
	public void state(int n){
		if(n>0){
			System.out.print(1);
		}else if(n<0){
			System.out.print(-1);		
		}else{
			System.out.print(0);
		}
	}
	
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter number");
		int number=scn.nextInt();
		PositiveNegative positiveNegative=new PositiveNegative();
		positiveNegative.state(number);
	}
}