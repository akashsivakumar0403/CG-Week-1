import java.util.Scanner;

class OddOrEven{
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		int number=scn.nextInt();
		for(int i=1;i<=number;i++){
			if(i%2==0){
				System.out.print(i+" Even\n");
			}else{
				System.out.print(i+" Odd\n");
			}
		}
		scn.close();
	}
}