import java.util.Scanner;

class OddEven{
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		int number=scn.nextInt();
		int[] odd=new int[(number/2)+1], even=new int[(number/2)+1];
		if(number>0){
			int evenCount=-1,oddCount=-1;			
			for(int i=1;i<=number;i++){
				if(i%2==0){
					evenCount++;
					even[evenCount]=i;
				}else{
					oddCount++;
					odd[oddCount]=i;			
				}
			}
			for(int i=0;i<(number/2);i++){
				System.out.print("Odd "+odd[i]+" Even "+even[i]+"\n");
			}
		}else{
			System.out.print("Invalid");
		}
	}
}