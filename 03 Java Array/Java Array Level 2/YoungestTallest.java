import java.util.Scanner;

class YoungestTallest{
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		int[] age=new int[3], height=new int[3];
		int youngestAge=Integer.MAX_VALUE,tallestHeight=0;
		for(int i=0;i<3;i++){
			age[i]=scn.nextInt();
			height[i]=scn.nextInt();
			if(age[i]<youngestAge){
				youngestAge=age[i];
			}
			if(height[i]>tallestHeight){
				tallestHeight=height[i];
			}
		}
		System.out.println("Youngest is "+youngestAge+"\nTallest is "+tallestHeight);
		scn.close();
		
	}
}