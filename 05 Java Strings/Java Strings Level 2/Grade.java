public class Grade {
    public static int[][] generateScores(int numberOfStudents) {
        int[][] scores = new int[numberOfStudents][3];
        for (int i = 0; i < numberOfStudents; i++) {
            scores[i][0] = (int) (Math.random()*100);
            scores[i][1] = (int) (Math.random()*100);
            scores[i][2] = (int) (Math.random()*100);
        }
        return scores;
    }
    public static double[][] calculateStats(int[][] scores){
        double[][] stats = new double[scores.length][3];
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = total / 3.0;
            double percentage = Math.round((avg * 100) / 100.0 * 100.0) / 100.0;
            stats[i][0] = total;
            stats[i][1] = Math.round(avg * 100.0) / 100.0;
            stats[i][2] = Math.round(percentage);
        }
        return stats;
    }
    public static String[] calculateGrades(double[][] stats) {
        String[] grades = new String[stats.length];
        for (int i = 0; i < stats.length; i++) {
            int perc = (int) stats[i][2];
            if (perc >= 80)
                grades[i] = "A";
            else if (perc >= 70)
                grades[i] = "B";
            else if (perc >= 60)
                grades[i] = "C";
            else if (perc >= 50)
                grades[i] = "D";
            else if (perc >= 40)
                grades[i] = "E";
            else
                grades[i] = "R";
        }
        return grades;
    }

    public static void displayScorecard(int[][] scores, double[][] stats, String[] grades) {
        System.out.printf("%-10s%-10s%-10s%-10s%-10s%-12s%-10s%-10s\n",
                "Student", "Physics", "Chemistry", "Math", "Total", "Average", "Percent", "Grade");
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("Student%-3d %-10d%-10d%-10d%-10.0f%-12.2f%-10.0f%-10s\n",
                    (i + 1),
                    scores[i][0], scores[i][1], scores[i][2],
                    stats[i][0], stats[i][1], stats[i][2],
                    grades[i]);
        }
    }

    public static void main(String[] args) {
        int students = 5;
        int[][] scores = generateScores(students);
        double[][] stats = calculateStats(scores);
        String[] grades = calculateGrades(stats);
        displayScorecard(scores, stats, grades);
    }
}
