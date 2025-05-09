import java.util.Scanner;

class Power{
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		int number=scn.nextInt(),result=1,power=scn.nextInt();
		if(number>=0){
			for(int i=1;i<=power;i++){
				result*=number;
			}
		}
		System.out.printf("%d to the power %d = %d",number,power,result);
	}
}