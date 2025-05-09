import java.util.Scanner;

class AreaTriangle{
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		double base=scn.nextDouble();
		double height=scn.nextDouble();
		double areaTriangle=0.5*base*height;
		System.out.printf("Area of triangle whose base is %.2f and height is %.2f, is %.2f square cm and %.2f square inches",base,height,areaTriangle,areaTriangle/(2.54*2.54));
		scn.close();
	}
}