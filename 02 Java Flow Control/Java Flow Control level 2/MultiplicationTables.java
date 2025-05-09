import java.util.Scanner;

class MultiplicationTables{
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		int number=scn.nextInt();
		for(int i=6;i<=9;i++){
			System.out.printf("%d * %d = %d\n",number,i,i*number);
		}
		scn.close();
	}
}