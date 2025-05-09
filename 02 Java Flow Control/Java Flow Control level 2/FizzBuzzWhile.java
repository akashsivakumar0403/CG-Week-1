import java.util.Scanner;

class FizzBuzz{
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		int number=scn.nextInt(),count=1;
		if(number>=0){
			if(number%3==0){
				if(number%5==0){
					while(count<=number){
						System.out.println("FizzBuzz");
						count++;
					}
				}else{
					while(count<=number){
						System.out.println("Fizz");
						count++;
					}
				}
			}else if(number%5==0){
				if(number%3==0){
					while(count<=number){
						System.out.println("FizzBuzz");
						count++;
					}
				}else{
					while(count<=number){
						System.out.println("Buzz");
						count++;
					}
				}
			}else{
				while(count<=number){
						System.out.println(count);
						count++;
					}	
			}
		}
	}
}