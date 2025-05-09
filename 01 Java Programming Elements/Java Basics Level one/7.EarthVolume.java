import java.lang.Math;

class EarthVolume{
	public static void main(String[] args){
		double KM=6378;
		double Miles=(double) KM*1.6;
		double volumeKM=(4/3)*Math.PI*Math.pow(KM,3);
		double volumeMiles=(4/3)*Math.PI*Math.pow(Miles,3);
		System.out.printf("The volume of earth in cubic kilometers is %f and cubic miles is %f",volumeKM,volumeMiles);
	}
}