import java.util.Scanner;

class SimpleInterest {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int principal=scn.nextInt(),time=scn.nextInt(),rate=scn.nextInt();
		int simpleInterest=(principal*time*rate)/100;
		System.out.printf("The Simple Interest is %d for Principal %d, Rate of Interest %d and Time %d",simpleInterest,principal,rate,time);
		scn.close();
	}
}
