import java.util.Scanner;

class Reverse{
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		int number=scn.nextInt(),originalNumber=number,count=0;
		while(number>0){
			count++;
			number/=10;
		}
		number=originalNumber;
		int[] array=new int[count];
		for(int i=count-1;i>=0;i--){
			array[i]=number%10;
			number/=10;
		}
		for(int i=count-1;i>=0;i--){
			System.out.print(array[i]);
		}
	}
}