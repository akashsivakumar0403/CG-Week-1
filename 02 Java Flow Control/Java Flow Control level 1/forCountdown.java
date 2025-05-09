import java.util.Scanner;

class forCountdown{
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		int countdown=scn.nextInt();
		for(int i=countdown;i>0;i--){
		System.out.print(i+" ");
		}
		scn.close();
	}
}