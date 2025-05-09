import java.util.Scanner;

class Frequency{
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		int number=scn.nextInt(),originalNumber=number,count=0;
		while(number>0){
			count++;
			number=(number-(number%10))/10;
		}
		number=originalNumber;
		int[] array=new int[count];
		int frequency[]={0,0,0,0,0,0,0,0,0,0};
		for(int i=count-1;i>=0;i--){
			array[i]=number%10;
			number=(number-(number%10))/10;
			frequency[array[i]]++;
		}
		for(int i=0;i<frequency.length;i++){
			System.out.println(i+"="+frequency[i]);
		}
		scn.close();
		
	}
}