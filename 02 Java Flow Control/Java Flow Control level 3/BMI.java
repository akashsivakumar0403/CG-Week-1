import java.util.Scanner;
class BMI{
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		double weight=scn.nextDouble(), height=(scn.nextDouble())/100;
		double BMI=weight / (height * height);
		if(BMI<=18.4){
			System.out.print("Underweight");
		}else if(BMI<=24.9){
			System.out.print("Normal");
		}else if(BMI<=39.9){
			System.out.print("Overweight");
		}else{
			System.out.print("Obese");
		}
		scn.close();
	}
}