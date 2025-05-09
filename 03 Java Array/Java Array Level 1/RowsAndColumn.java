import java.util.Scanner;

class RowsAndColumn{
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		int row=scn.nextInt(),column=scn.nextInt(),index=-1;
		int[][] array2d=new int[row][column];
		int [] array1d=new int[row*column];
		for(int i=0;i<row;i++){
			for(int j=0;j<column;j++){
				array2d[i][j]=scn.nextInt();
			}
		}
		for(int i=0;i<row;i++){
			for(int j=0;j<column;j++){
				index++;
				array1d[index]=array2d[i][j];
			}
		}
		for(int i=0;i<array1d.length;i++){
			System.out.print(array1d[i]+" ");
		}
	}
}