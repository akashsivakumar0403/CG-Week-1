import java.util.Scanner;

class FizzBuzz{
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		int number=scn.nextInt();
		if(number>=0){
			String[] array=new String[number];
			for(int i=1;i<=number;i++){
				if(number>=0){
					if(i%3==0){
						if(i%5==0){
							array[i-1]="FizzBuzz";
						}else{
							array[i-1]="Fizz";
						}
					}else if(i%5==0){
						if(i%3==0){
							array[i-1]="FizzBuzz";
						}else{
							array[i-1]="Buzz";
						}
					}else{
						array[i-1]=String.valueOf(i);	
					}
				}
			}
		for(int i=0;i<number;i++){
				System.out.println(array[i]);
		}
		}
	}
}