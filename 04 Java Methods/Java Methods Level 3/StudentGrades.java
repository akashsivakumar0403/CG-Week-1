import java.util.Scanner;
public class StudentGrades{
    public static int[][] generateScores(int students) {
        int[][] scores = new int[students][3];
        for (int i = 0; i < students; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = (int) (Math.random()*(100)+0);
            }
        }
        return scores;
    }
    public static double[][] calculateResults(int[][] scores) {
        int students = scores.length;
        double[][] results = new double[students][3];

        for (int i = 0; i < students; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = total / 3.0;
            results[i][0] = Math.round(total * 100.0) / 100.0;
            results[i][1] = Math.round(average * 100.0) / 100.0;
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return results;
    }
    public static String getGrade(double percentage) {
        if (percentage >= 80) {
            return "A";
        }else if (percentage >= 70) {
            return "B";
        }else if (percentage >= 60) {
            return "C";
        }else if (percentage >= 50) {
            return "D";
        }else if (percentage >= 40) {
            return "E";
        }else {
            return "R";
        }
    }
    public static void displayScorecard(int[][] scores, double[][] results) {
        System.out.println("ID\tPhysics\tChem\tMath\tTotal\tAverage\tPercentage\tGrade");
        for (int i = 0; i < scores.length; i++) {
            System.out.print((i + 1) + "\t");
            for (int j = 0; j < 3; j++) {
                System.out.print(scores[i][j] + "\t\t");
            }
            System.out.print((int)results[i][0] + "\t\t");
            System.out.print(results[i][1] + "\t\t");
            System.out.print(results[i][2] + "\t\t");
            System.out.println(getGrade(results[i][2]));
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int students = scanner.nextInt();

        int[][] scores = generateScores(students);
        double[][] results = calculateResults(scores);
        displayScorecard(scores, results);

        scanner.close();
    }
}
