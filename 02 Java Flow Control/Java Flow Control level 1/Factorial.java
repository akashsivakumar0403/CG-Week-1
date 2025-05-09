import java.util.Scanner;

class Factorial{
	public static void main(String[] args){
		Scanner scn= new Scanner(System.in);
		int factorial=scn.nextInt(),total=1,count=1;
		if(factorial<=0){
			System.out.print("Enter a positive integer");
		}else{
			while(count<=factorial){
			total*=count;
			count++;
			}
		}
			scn.close();
			System.out.print("Factorial is "+total);
	}
}