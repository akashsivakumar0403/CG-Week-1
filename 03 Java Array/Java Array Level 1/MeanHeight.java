import java.util.Scanner;

class MeanHeight{
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		double[] height=new double[11];
		double total=0;
		for(int i=0;i<height.length;i++){
			height[i]=scn.nextDouble();
			total+=height[i];
		}
		System.out.println(total/height.length);
		scn.close();
	}
}