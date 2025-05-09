import java.util.Scanner;
public class UnitConverter {
    public static double convertKmToMiles(double km) {
        return km * 0.621371;
    }
    public static double convertMilesToKM(double miles){
        return miles * 1.60934;
    }
    public static double convertMetersToFeet(double meters) {
        return meters * 3.28084;
    }
    public static double convertFeetToMeters(double feet) {
        return feet * 0.3048;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the distances");
        double km = sc.nextDouble(),miles=sc.nextDouble(),meters=sc.nextDouble(),feet=sc.nextDouble();
        UnitConverter unitConverter = new UnitConverter();

        // Call the method to convert km to miles
        double milesConverted = unitConverter.convertKmToMiles(km),kmConverted=unitConverter.convertMilesToKM(miles),feetConverted=unitConverter.convertMetersToFeet(meters),metersConverted=unitConverter.convertFeetToMeters(feet);
        System.out.println("KM to Miles is "+milesConverted);
        System.out.println("Miles to KM is "+kmConverted);
        System.out.println("Meters to feet "+feetConverted);
        System.out.println("Feet to Meters "+metersConverted);
        sc.close();
    }
}
