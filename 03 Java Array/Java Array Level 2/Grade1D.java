import java.util.Scanner;

class StudentGrades{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int number=scn.nextInt();
        int[] physics=new int[number];
        int[] chemistry=new int[number];
        int[] maths=new int[number];
        double[] percentages=new double[number];
        String[] grades=new String[number];
        for(int i=0;i<number;i++){
            int tempPhysics=scn.nextInt();
            int tempChemistry=scn.nextInt();
            int tempMaths=scn.nextInt();
            if(tempPhysics>0 && tempChemistry>0 && tempMaths>0){
				physics[i]=tempPhysics;
				chemistry[i]=tempChemistry;
				maths[i]=tempMaths;
				int total=physics[i]+chemistry[i]+maths[i];
				percentages[i]=total/3.0;
				if (percentages[i]>=80){
					grades[i]="A";
				} else if(percentages[i]>=70){
					grades[i]="B";
				} else if(percentages[i]>=60){
					grades[i]="C";
				} else if(percentages[i]>=50){
					grades[i]="D";
				} else if(percentages[i]>=40){
					grades[i]="E";
				} else{
					grades[i]="R";
				}
			}else{
				System.out.println("Error, enter agaain");
				i--;
			}
        }
        System.out.println("\nStudent Results:");
        for (int i=0;i<number;i++){
            System.out.printf("Student %d: Physics = %d, Chemistry = %d, Maths = %d, Percentage = %.2f%%, Grade = %s\n",
                i+1,physics[i],chemistry[i],maths[i],percentages[i],grades[i]);
        }
        scn.close();
    }
}