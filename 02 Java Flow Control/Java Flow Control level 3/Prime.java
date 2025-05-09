import java.util.Scanner;

class Prime{
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		int number=scn.nextInt(),count=0;
		for(int i=2;i<number;i++){
			if(number%i==0){
				count++;
			}
		}
		if(count==0){
			System.out.print("Prime");
		}else{
			System.out.print("Not prime");
		}
	}
}