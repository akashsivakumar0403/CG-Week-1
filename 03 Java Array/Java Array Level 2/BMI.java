import java.util.Scanner;

class BMI{
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		int number=scn.nextInt();
		double[] height=new double[number],weight=new double[number],BMI=new double[number];
		String[] status=new String[number];
		for(int i=0;i<number;i++){
			weight[i]=scn.nextDouble();
			height[i]=(scn.nextDouble())/100;
			BMI[i]=weight[i]/(height[i]*height[i]);
			if(BMI[i]<=18.4){
				status[i]=("Underweight");
			}else if(BMI[i]<=24.9){
				status[i]=("Normal");
			}else if(BMI[i]<=39.9){
				status[i]=("Overweight");
			}else{
				status[i]=("Obese");
			}
		}
		for(int i=0;i<number;i++){
			System.out.printf("Person of weight %.1f and height %.1f has BMI of %.2f, which is %s\n",weight[i],height[i],BMI[i],status[i]);
		}
	}
}