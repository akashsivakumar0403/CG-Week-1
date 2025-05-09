import java.util.Scanner;

class Grade{
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		int physics=scn.nextInt(), chemistry=scn.nextInt(), maths=scn.nextInt();
		int averageMarks=(physics+chemistry+maths)/3;
		if(averageMarks>=80){
			System.out.println(averageMarks+" Grade A - Level 4, above agency normalised standards");
		}else if(averageMarks>=70){
			System.out.println(averageMarks+" Grade B - Level 3, at agency normalised standards");
		}else if(averageMarks>=60){
			System.out.println(averageMarks+" Grade C - Level 2, below, but approaching agency normalised standards");
		}else if(averageMarks>=50){
			System.out.println(averageMarks+" Grade D - Level 1, well below agency normalised standards");
		}else if(averageMarks>=40){
			System.out.println(averageMarks+" Grade E - Level -1, too below agency normalised standards");
		}else{
			System.out.println(averageMarks+" Remedial Standards"); 
		}
		scn.close();
	}
}