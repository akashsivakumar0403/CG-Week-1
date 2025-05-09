import java.util.Scanner;

class Handshake{
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		int numberOfStudents=scn.nextInt();
		int possibleHandshakes=(numberOfStudents * (numberOfStudents - 1)) / 2;
		System.out.printf("Total number of handshakes possible for %d number of students is %d", numberOfStudents, possibleHandshakes);
		scn.close();
	}
}