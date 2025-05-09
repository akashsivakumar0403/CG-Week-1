import java.util.Scanner;

class Vote{
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		int age[]=new int[10];
		for(int i=0;i<age.length;i++){
			age[i]=scn.nextInt();
		}
		for(int i=0;i<10;i++){
			if(age[i]<=0){
					System.out.println("Invalid age");
			}else if(age[i]>=18){
					System.out.printf("The student with the age %d can vote\n",age[i]);
			}else{
					System.out.printf("The student with the age %d cannot vote.\n",age[i]);
			}
		}
		scn.close();
	}
}