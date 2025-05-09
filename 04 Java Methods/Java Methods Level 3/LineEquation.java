import java.util.Scanner;
import java.lang.Math;

public class LineEquation{
    public static double calculateDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }
    public static double[] calculateLineEquation(double x1, double y1, double x2, double y2) {
        double slope = (y2 - y1) / (x2 - x1);
        double intercept = y1 - slope * x1;
        return new double[]{slope, intercept};
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter x1, y1, and x2,y2");
        double x1 = scn.nextDouble(),y1 = scn.nextDouble(),x2 = scn.nextDouble(),y2 = scn.nextDouble();
        double distance = calculateDistance(x1, y1, x2, y2);
        System.out.printf("Euclidean Distance = %.3f\n",distance);
        if (x1 != x2) {
            double[] lineEquation = calculateLineEquation(x1, y1, x2, y2);
            System.out.println("Line Equation: y = " + lineEquation[0] + "x + " + lineEquation[1]);
        } else {
            System.out.println("Line is vertical. Equation: x = " + x1);
        }
        scn.close();
    }
}
