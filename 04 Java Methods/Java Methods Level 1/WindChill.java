import java.util.Scanner;
import java.lang.Math;
class WindChill{
	public double windChill(double temperature, double windSpeed){
		return 35.74 + (0.6215 * temperature) + ((0.4275*temperature - 35.75)* Math.pow(windSpeed,0.16));
	}
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter temperature and wind speed");
		double temperature=scn.nextDouble(),windSpeed=scn.nextDouble();
		WindChill windChill=new WindChill();
		double calculatedWindChill=windChill.windChill(temperature,windSpeed);
		System.out.printf("Windchill is %.2f for a temperature of %.1f and windspeed of %.2f",calculatedWindChill,temperature,windSpeed);
		scn.close();
	}
}