import java.util.Scanner;

class Bonus{
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		double[] salary=new double[10], year=new double[10], newSalary=new double[10], bonus=new double[10];
		double totalBonus=0,totalOldSalary=0,totalNewSalary=0;
		for(int i=0;i<10;i++){
			double tempSalary=scn.nextDouble(), tempYear=scn.nextDouble();
			if(tempSalary>0 && tempYear>0){
				salary[i]=tempSalary;
				totalOldSalary+=salary[i];
				year[i]=tempYear;
				if(year[i]>5){
					bonus[i]=0.05*salary[i];
					newSalary[i]=salary[i]+bonus[i];
					totalNewSalary+=newSalary[i];
					totalBonus+=bonus[i];
				}else{
					bonus[i]=0.02*salary[i];
					newSalary[i]=salary[i]+bonus[i];
					totalNewSalary+=newSalary[i];
					totalBonus+=bonus[i];					
				}
			}else{
				System.out.println("Error, enter again");
				i--;
			}
		}
		System.out.printf("Total bonus = %.2f\nTotal Old Salary = %.2f\nTotal New Salary = %.2f",totalBonus,totalOldSalary,totalNewSalary);
		scn.close();
	}
	
}