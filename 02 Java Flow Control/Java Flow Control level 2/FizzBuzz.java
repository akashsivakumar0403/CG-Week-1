import java.util.Scanner;

class FizzBuzz{
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		int number=scn.nextInt();
		if(number>=0){
			if(number%3==0){
				if(number%5==0){
					for(int i=1;i<=number;i++){
						System.out.println("FizzBuzz");
					}
				}else{
					for(int i=1;i<=number;i++){
						System.out.println("Fizz");
					}
				}
			}else if(number%5==0){
				if(number%3==0){
					for(int i=1;i<=number;i++){
						System.out.println("FizzBuzz");
					}
				}else{
					for(int i=1;i<=number;i++){
						System.out.println("Buzz");
					}
				}
			}else{
				for(int i=1;i<=number;i++){
						System.out.println(i);
					}	
			}
		}
	}
}