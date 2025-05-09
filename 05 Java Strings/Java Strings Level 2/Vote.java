public class Vote {
    public static int[] generateAges(int n) {
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            ages[i] = (int) (Math.random()*(100-1)+1);
        }
        return ages;
    }

    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);
            result[i][1] = (ages[i] >= 18) ? "Can Vote" : "Cannot Vote";
        }
        return result;
    }

    public static void main(String[] args) {
        int[] ages = generateAges(10);
        String[][] result = checkVotingEligibility(ages);
        for (String[] row : result) {
            System.out.println(row[0] + " - " + row[1]);
        }
    }
}
