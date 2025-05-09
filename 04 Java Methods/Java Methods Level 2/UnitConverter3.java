import java.util.Scanner;

public class UnitConverter3{
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
    public static double convertPoundsToKilograms(double pounds) {
        return pounds * 0.453592;
    }
    public static double convertKilogramsToPounds(double kilograms) {
        return kilograms * 2.20462;
    }
    public static double convertGallonsToLiters(double gallons) {
        return gallons * 3.78541;
    }
    public static double convertLitersToGallons(double liters) {
        return liters * 0.264172;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values for conversion:");
        double fahrenheit = sc.nextDouble(), celsius = sc.nextDouble(),pounds = sc.nextDouble(), kilograms = sc.nextDouble(),gallons = sc.nextDouble(), liters = sc.nextDouble();
        double celsiusConverted = convertFahrenheitToCelsius(fahrenheit),fahrenheitConverted = convertCelsiusToFahrenheit(celsius),kilogramsConverted = convertPoundsToKilograms(pounds),poundsConverted = convertKilogramsToPounds(kilograms),litersConverted = convertGallonsToLiters(gallons),gallonsConverted = convertLitersToGallons(liters);
        System.out.println("Fahrenheit to Celsius: " + celsiusConverted);
        System.out.println("Celsius to Fahrenheit: " + fahrenheitConverted);
        System.out.println("Pounds to Kilograms: " + kilogramsConverted);
        System.out.println("Kilograms to Pounds: " + poundsConverted);
        System.out.println("Gallons to Liters: " + litersConverted);
        System.out.println("Liters to Gallons: " + gallonsConverted);
        sc.close();
    }
}
