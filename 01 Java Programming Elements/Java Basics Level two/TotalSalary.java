import java.util.Scanner;

class TotalSalary{
	public static void main(String[] args){
		Scanner scn= new Scanner(System.in);
		int salary=scn.nextInt(), bonus=scn.nextInt();
		System.out.printf("The salary is INR %d and bonus is INR %d. Hence Total Income is INR %d", salary, bonus, salary+bonus);
		scn.close();
	}
}