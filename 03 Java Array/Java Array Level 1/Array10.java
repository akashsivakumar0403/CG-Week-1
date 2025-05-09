import java.util.Scanner;

class Array10{
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		int[] array=new int[10];
		int index=0,total=0;
		for(int i=0;i<10;i++){
			int temp=scn.nextInt();
			if(temp>0){
				array[i]=temp;
			}else{
				index=i;
				break;
			}
		}
		for(int i=0;i<index;i++){
			System.out.println(array[i]);
			total+=array[i];
		}
		scn.close();
		System.out.println("Total= "+total);
	}
}