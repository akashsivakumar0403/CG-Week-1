import java.util.Scanner;

class Numbers{
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		int numbers[]=new int[5];
		for(int i=0;i<numbers.length;i++){
				numbers[i]=scn.nextInt();
		}
		for(int i=0;i<numbers.length;i++){
				if(numbers[i]>0){
					System.out.print(numbers[i]+" Positive");
					if(numbers[i]%2==0){
						System.out.println(" Even");
					}else{
						System.out.println(" Odd");						
					}
				}else if(numbers[i]<0){
						System.out.println(numbers[i]+" Negative");					
				}else{
						System.out.println(numbers[i]+" Zero");					
				}
		}
		if(numbers[0]>numbers[4]){
			System.out.println("First number "+numbers[0]+" is larger than last number "+numbers[4]);
		}else if(numbers[0]==numbers[4]){
			System.out.println("First number "+numbers[0]+" is equal to last number "+numbers[4]);
		}else{
			System.out.println("First number "+numbers[0]+" is smaller than last number "+numbers[4]);
		}
	}
}