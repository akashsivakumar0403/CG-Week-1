import java.util.Scanner;

class Multiples{
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		int number=scn.nextInt();
		if(number>=0){
			for(int i=100;i>=1;i--){
				if(i%number==0){
					System.out.println(i);
				}
			}
		}
	}
}