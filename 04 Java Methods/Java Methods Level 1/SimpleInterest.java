import java.util.Scanner;

class SimpleInterest{
	public double simpleInterest(double principal,double time,double rate){
		return (principal*time*rate)/100;
	}
	
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter principal, time and rate");
		double principal=scn.nextDouble(),time=scn.nextDouble(),rate=scn.nextDouble();
		SimpleInterest simpleInterest=new SimpleInterest();
		double calculated=simpleInterest.simpleInterest(principal,time,rate);
		System.out.printf("The Simple Interest is %.2f for Principal %.2f, Rate of Interest %.2f and Time %.2f",calculated,principal,time,rate);
		scn.close();
	}
}