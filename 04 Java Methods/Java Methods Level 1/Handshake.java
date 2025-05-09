import java.util.Scanner;

class Handshake{
	public int handshake(int number){
		return (number*(number-1))/2;
	}
	
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter number of students");
		int number=scn.nextInt();
		Handshake handshake=new Handshake();
		int possibleHandshakes=handshake.handshake(number);
		System.out.println("Total number of possible handshakes is "+possibleHandshakes);
		scn.close();
	}
}