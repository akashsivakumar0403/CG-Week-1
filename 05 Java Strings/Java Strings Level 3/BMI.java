import java.util.Scanner;
public class BMI {
    public static double[][] getInput(int numPersons) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[numPersons][2];
        for (int i = 0; i < numPersons; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            data[i][0] = sc.nextDouble();
            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            data[i][1] = sc.nextDouble();
        }
        return data;
    }

    public static String[][] calculateBMIAndStatus(double[][] data) {
        String[][] result = new String[data.length][4];
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightInMeters = data[i][1] / 100.0;
            double bmi = weight / (heightInMeters * heightInMeters);
            result[i][0] = String.valueOf(data[i][0]);
            result[i][1] = String.valueOf(data[i][1]);
            result[i][2] = String.format("%.2f", bmi);
            result[i][3] = getBMIStatus(bmi);
        }
        return result;
    }
    public static String getBMIStatus(double bmi) {
        if (bmi <= 18.4) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            return "Normal";
        } else if (bmi >= 25.0 && bmi <= 39.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }
    public static void displayResults(String[][] results) {
        System.out.printf("%-8s %-8s %-8s %-12s\n", "Weight", "Height", "BMI", "Status");
        for (String[] row : results) {
            System.out.printf("%-8s %-8s %-8s %-12s\n", row[0], row[1], row[2], row[3]);
        }
    }
    public static void main(String[] args) {
        int numPersons = 10;
        double[][] data = getInput(numPersons);
        String[][] results = calculateBMIAndStatus(data);
        displayResults(results);
    }
}
