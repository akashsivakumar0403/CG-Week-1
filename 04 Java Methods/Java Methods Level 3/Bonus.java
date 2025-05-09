public class Bonus{
    public static int[][] generateEmployeeData(int numEmployees) {
        int[][] data = new int[numEmployees][2];
        for (int i = 0; i < numEmployees; i++) {
            int salary = (int) (Math.random()*(99999-10000)+10000);
            int years = (int) (Math.random()*(10-0));
            data[i][0] = salary;
            data[i][1] = years;
        }
        return data;
    }
    public static double[][] calculateBonusAndNewSalary(int[][] employeeData) {
        int numEmployees = employeeData.length;
        double[][] updatedData = new double[numEmployees][2];

        for (int i = 0; i < numEmployees; i++) {
            int salary = employeeData[i][0];
            int years = employeeData[i][1];
            double bonus = years > 5 ? 0.05 * salary : 0.02 * salary;
            double newSalary = salary + bonus;

            updatedData[i][0] = Math.round(bonus * 100.0) / 100.0;
            updatedData[i][1] = Math.round(newSalary * 100.0) / 100.0;
        }
        return updatedData;
    }
    public static void displaySummary(int[][] employeeData, double[][] updatedData) {
        double totalOldSalary = 0, totalBonus = 0, totalNewSalary = 0;

        System.out.println("ID\tSalary\t\tYears\tBonus\t\tNew Salary");
        for (int i = 0; i < employeeData.length; i++) {
            int oldSalary = employeeData[i][0];
            int years = employeeData[i][1];
            double bonus = updatedData[i][0];
            double newSalary = updatedData[i][1];

            System.out.println((i + 1) + "\t" + oldSalary + "\t\t" + years + "\t\t" +
                    bonus + "\t\t" + newSalary);

            totalOldSalary += oldSalary;
            totalBonus += bonus;
            totalNewSalary += newSalary;
        }

        System.out.println("\n----- Totals -----");
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total Bonus: " + totalBonus);
        System.out.println("Total New Salary: " + totalNewSalary);
    }

    public static void main(String[] args) {
        int numEmployees = 10;
        int[][] employeeData = generateEmployeeData(numEmployees);
        double[][] updatedData = calculateBonusAndNewSalary(employeeData);
        displaySummary(employeeData, updatedData);
    }
}
