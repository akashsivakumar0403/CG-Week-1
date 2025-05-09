import java.util.Scanner;

public class UnitConverter2{
    public static double convertYardsToFeet(double yards) {
        return yards * 3;
    }
    public static double convertFeetToYards(double feet) {
        return feet * 0.333333;
    }
    public static double convertMetersToInches(double meters) {
        return meters * 39.3701;
    }
    public static double convertInchesToMeters(double inches) {
        return inches * 0.0254;
    }
    public static double convertInchesToCentimeters(double inches) {
        return inches * 2.54;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter distances for conversion:");
        double yards = sc.nextDouble(), feet = sc.nextDouble(), meters = sc.nextDouble(), inches = sc.nextDouble();
        double feetConverted = convertYardsToFeet(yards),yardsConverted = convertFeetToYards(feet),inchesConverted = convertMetersToInches(meters),metersConverted = convertInchesToMeters(inches),cmConverted = convertInchesToCentimeters(inches);
        System.out.println("Yards to Feet: " + feetConverted);
        System.out.println("Feet to Yards: " + yardsConverted);
        System.out.println("Meters to Inches: " + inchesConverted);
        System.out.println("Inches to Meters: " + metersConverted);
        System.out.println("Inches to Centimeters: " + cmConverted);
        sc.close();
    }
}
