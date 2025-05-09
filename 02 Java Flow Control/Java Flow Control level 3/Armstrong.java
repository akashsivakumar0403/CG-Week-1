import java.util.Scanner;
class Armstrong{
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		int number=scn.nextInt(),originalNumber=number,remainder=0,total=0;
		while(number>0){
			remainder=(number-(number%10))/10;
			total+=(number%10)*(number%10)*(number%10);
			number=remainder;
		}
		if(total==originalNumber){
			System.out.print(originalNumber+" is an Armstrong number");
		}else{
			System.out.print(originalNumber+" is not an Armstrong number");
		}
		scn.close();
	}
}