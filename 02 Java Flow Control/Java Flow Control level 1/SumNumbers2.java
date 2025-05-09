import java.util.Scanner;

class SumNumbers2{
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		double total=0, entered=scn.nextDouble();
		
		while(true){
			if(entered<=0){
				break;
			}else{
				total+=entered;
				entered=scn.nextDouble();
			}
		}
		System.out.print(total);
		scn.close();
	}
}