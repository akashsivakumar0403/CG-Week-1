import java.util.Scanner;

class Countdown{
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		int countdown=scn.nextInt(),n= countdown;
		while(n>0){
		System.out.print(n+" ");
		n--;
		}
		scn.close();
	}
}