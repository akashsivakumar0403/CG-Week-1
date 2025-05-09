import java.util.Scanner;

class BMI{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int number=scn.nextInt();
        double[][] personData=new double[number][3];
        String[] weightStatus=new String[number];
        
        for (int i =0;i<number;i++){
            double weight=scn.nextDouble();
            double height=(scn.nextDouble())/ 100;
            if(weight>0 && height>0){
				double bmi=weight/(height*height);
				personData[i][0]=weight;
				personData[i][1]=height;
				personData[i][2]=bmi;
				if(bmi<=18.4){
					weightStatus[i]="Underweight";
				}else if(bmi<=24.9){
					weightStatus[i] = "Normal";
				}else if(bmi<=39.9){
					weightStatus[i]="Overweight";
				}else{
					weightStatus[i]="Obese";
				}
			}else{
				System.out.println("Invalid input, enter again");
				i--;
			}
        }
        for(int i=0;i<number;i++){
            System.out.printf("Person %d: Weight = %.1f kg, Height = %.2f m, BMI = %.2f, Status = %s\n",
                i+1,personData[i][0],personData[i][1],personData[i][2],weightStatus[i]);
        }
        scn.close();
    }
}
