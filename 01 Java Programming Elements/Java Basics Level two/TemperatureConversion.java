import java.util.Scanner;

class TemperatureConversion{
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		double celcius=scn.nextDouble();
		double farenheitResult=(celcius*9/5)+32;
		System.out.printf("The %.1f celsius is %.1f fahrenheit",celcius,farenheitResult);
		scn.close();
	}
}