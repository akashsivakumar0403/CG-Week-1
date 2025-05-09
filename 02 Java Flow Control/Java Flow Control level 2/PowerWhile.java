import java.util.Scanner;

class Power{
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		int number=scn.nextInt(),result=1,power=scn.nextInt(),count=1;
		if(number>=0){
			while(count<=power){
				result*=number;
				count++;
			}
		}
		System.out.printf("%d to the power %d = %d",number,power,result);
	}
}