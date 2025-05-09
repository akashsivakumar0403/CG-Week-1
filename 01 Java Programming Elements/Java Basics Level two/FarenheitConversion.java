import java.util.Scanner;

class FarenheitConversion{
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		double farenheit=scn.nextDouble();
		double celciusResult=(farenheit-32)*(5/9);
		System.out.printf("The %.1f fahrenheit is %.1f celsius",farenheit,celciusResult);
		scn.close();
	}
}