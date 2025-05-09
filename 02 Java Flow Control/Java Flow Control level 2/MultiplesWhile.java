import java.util.Scanner;

class MultiplesWhile{
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		int number=scn.nextInt(),count=100;
		if(number>=0){
			while(count>=1){
				if(count%number==0){
					System.out.println(count);
				}
				count--;
			}
		}
	}
}