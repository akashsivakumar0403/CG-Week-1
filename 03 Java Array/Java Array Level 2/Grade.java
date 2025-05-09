import java.util.Scanner;

class StudentGrades {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int number=scn.nextInt(),tempGrade=0;
        int[][] marks=new int[number][3];
        double[] percentages=new double[number];
        String[] grades=new String[number];
        for(int i=0;i<number;i++){
            for(int j=0;j<3;j++){
                tempGrade=scn.nextInt();
				if(tempGrade>0){
					marks[i][j]=tempGrade;
				}else{
					System.out.println("Error, enter again");
					j--;
				}
            }
            int total=marks[i][0]+marks[i][1]+marks[i][2];
            percentages[i]=total/3.0;
            if(percentages[i]>=80) {
                grades[i]="A";
            } else if(percentages[i]>=70){
                grades[i]="B";
            } else if(percentages[i]>=60){
                grades[i]="C";
            } else if(percentages[i]>=50){
                grades[i] = "D";
            } else if(percentages[i]>=40){
                grades[i]="E";
            } else{
                grades[i]="R";
            }
        }
        System.out.println("\nStudent Results:");
        for (int i=0;i<number;i++){
            System.out.printf("Student %d: Physics = %d, Chemistry = %d, Maths = %d, Percentage = %.2f%%, Grade = %s\n",
                i+1,marks[i][0],marks[i][1],marks[i][2],percentages[i],grades[i]);
        }
        scn.close();
    }
}