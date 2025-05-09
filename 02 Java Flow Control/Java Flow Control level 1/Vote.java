import java.util.Scanner;
class Vote{
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		int age=scn.nextInt();
		String canVote="No";
		if(age>=18){
			System.out.printf("The person's age is %d and can vote.",age);
		}else{
			System.out.printf("The person's age is %d and cannot vote.",age);
		}
		scn.close();
	}
}