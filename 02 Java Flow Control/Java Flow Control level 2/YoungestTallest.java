import java.util.Scanner;

class YoungestTallest{
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		int age1=scn.nextInt(),age2=scn.nextInt(),age3=scn.nextInt(),height1=scn.nextInt(),height2=scn.nextInt(),height3=scn.nextInt(),tallest=0,youngest=0;
		if(height1>height2&&height1>height3){
			tallest=height1;
		}else if(height1<height2&&height2>height3){
			tallest=height2;
		}else if(height3>height2&&height1<height3){
			tallest=height3;
		}
		if(age1<age2&&age1<age3){
			youngest=age1;
		}else if(age1>age2&&age2<age3){
			youngest=age2;
		}else if(age3<age2&&age1>age3){
			youngest=age3;
		}
		System.out.printf("The tallest is %d, and the youngest is %d",tallest,youngest);
		scn.close();
	}
}