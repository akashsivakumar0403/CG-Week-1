import java.util.Scanner;
import java.lang.Math;

class Trigonometry{
	public void trigonometry(double angle){
		double radians=Math.toRadians(angle);
		double sin=Math.sin(radians),cos=Math.cos(radians),tan=Math.tan(radians);
		System.out.printf("Angle is %.1f\nIn Radians = %.1f\nSine = %.1f Cosine = %.1f Tangent = %.1f",angle,radians,sin,cos,tan);
	}
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter angle");
		double angle=scn.nextDouble();
		Trigonometry trigonometry=new Trigonometry();
		trigonometry.trigonometry(angle);
		scn.close();
	}
}