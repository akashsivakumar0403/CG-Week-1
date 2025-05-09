import java.util.Scanner;

class Abundant{
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		int number=scn.nextInt(),total=0;
		for(int i=1;i<number;i++){
			if(number%i==0){
				total+=i;
			}
		}
		if(total>number){
			System.out.print(number+" is an Abundant number");
		}else{
			System.out.print(number+" is not an Abundant number");
		}
	}
}