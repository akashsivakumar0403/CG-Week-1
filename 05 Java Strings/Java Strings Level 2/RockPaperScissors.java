import java.util.Scanner;

class RockPaperScissors {
    public static String getComputerChoice() {
        String[] choices = {"rock", "paper", "scissors"};
        return choices[(int) (Math.random()*(2-0)+0)];
    }

    public static int[] determineWinner(String userChoice, String computerChoice) {
        if (userChoice.equals(computerChoice)) {
            return new int[]{0, 0};
        } else if ((userChoice.equals("rock") && computerChoice.equals("scissors")) ||
                (userChoice.equals("scissors") && computerChoice.equals("paper")) ||
                (userChoice.equals("paper") && computerChoice.equals("rock"))) {
            return new int[]{1, 0};
        }
        return new int[]{0, 1};
    }

    public static String[][] calculateStats(int userWins, int computerWins, int totalGames) {
        double userPercentage = (userWins * 100.0) / totalGames;
        double computerPercentage = (computerWins * 100.0) / totalGames;
        return new String[][]{
                {"Player Wins", String.valueOf(userWins)},
                {"Computer Wins", String.valueOf(computerWins)},
                {"Player Win %", String.format("%.2f", userPercentage)},
                {"Computer Win %", String.format("%.2f", computerPercentage)}
        };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userWins = 0, computerWins = 0;
        System.out.println("Enter number of games:");
        int games = sc.nextInt();
        for (int i = 0; i < games; i++) {
            System.out.println("Enter rock, paper, or scissors:");
            String userChoice = sc.next().toLowerCase();
            String computerChoice = getComputerChoice();
            int[] result = determineWinner(userChoice, computerChoice);
            userWins += result[0];
            computerWins += result[1];
            System.out.println("User: " + userChoice + " | Computer: " + computerChoice);
        }
        String[][] stats = calculateStats(userWins, computerWins, games);
        for (String[] row : stats) {
            System.out.println(row[0] + ": " + row[1]);
        }
    }
}
