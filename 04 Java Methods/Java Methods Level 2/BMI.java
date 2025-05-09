import java.util.Scanner;

public class BMI{
    public static void calculateBMI(double[][] data){
        for (int i=0;i<data.length;i++) {
            double weight=data[i][0];
            double height=data[i][1]/100;
            data[i][2]=weight/(height*height);
        }
    }

    public static String[] determineStatus(double[][] data){
        String[] statuses=new String[10];
        for(int i=0;i<data.length;i++){
            double bmi=data[i][2];
            if(bmi<=18.4){
                statuses[i]="Underweight";
            }else if(bmi>=18.5 && bmi<=24.9){
                statuses[i]="Normal";
            }else if(bmi>=25 && bmi<=39.9){
                statuses[i]="Overweight";
            }else{
                statuses[i]="Obese";
            }
        }
        return statuses;
    }

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        double[][] data=new double[10][3];
        String[] statuses=new String[10];
        for(int i=0;i<10;i++){
            System.out.print("Enter weight\n");
            data[i][0]=scn.nextDouble();
            System.out.print("Enter height\n");
            data[i][1]=scn.nextDouble();
        }
        BMI obj=new BMI();
        obj.calculateBMI(data);
        statuses=obj.determineStatus(data);
        for(int i=0;i<10;i++){
            System.out.printf("Person who is %.1f kg and  %.2f cm has BMI of %.2f, and is %s\n",data[i][0],data[i][1],data[i][2],statuses[i]);
        }
        scn.close();
    }
}
