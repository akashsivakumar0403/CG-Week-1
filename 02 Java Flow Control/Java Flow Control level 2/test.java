import java.util.Scanner;

class test{
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		String array[]=new String[10];
		for(int i=0;i<10;i++){
			array[i]=scn.nextLine();
		}
		for(int i=0;i<10;i++){
			System.out.println(array[i]);
		}
	}
}