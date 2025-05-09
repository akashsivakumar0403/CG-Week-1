import java.util.Scanner;
import java.lang.Math;

public class Grade{
    public static int[][] generateScores(int students) {
        int[][] scores = new int[students][3];
        for (int i = 0; i < students; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = (int) (Math.random() * (99 - 10 + 1) + 10); // Ensuring 2-digit scores
            }
        }
        return scores;
    }

    // Method to compute total, average, and percentage
    public static double[][] computeResults(int[][] scores) {
        int students = scores.length;
        double[][] results = new double[students][3];

        for (int i = 0; i < students; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0; // Rounding to 2 decimal places
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return results;
    }

    // Method to display results in tabular format
    public static void displayScorecard(int[][] scores, double[][] results) {
        System.out.println("\nScorecard");
        System.out.println("Student\tPhysics\tChemistry\tMath\tTotal\tAverage\tPercentage");
        for (int i = 0; i < scores.length; i++) {
            System.out.print("S" + (i + 1) + "\t");
            for (int j = 0; j < 3; j++) {
                System.out.print(scores[i][j] + "\t");
            }
            System.out.printf("%.0f\t%.2f\t%.2f%%\n", results[i][0], results[i][1], results[i][2]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int students = sc.nextInt();

        int[][] scores = generateScores(students);
        double[][] results = computeResults(scores);
        displayScorecard(scores, results);

        sc.close();
    }
}
