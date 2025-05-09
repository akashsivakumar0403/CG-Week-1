import java.util.Scanner;
public class StudentVotecChecker {
    public boolean canStudentVote(int age){
        if(age>0){
            if(age>=18){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int[] age=new int[10];
        for(int i=0;i<10;i++){
            age[i]=scn.nextInt();
        }
        StudentVotecChecker obj=new StudentVotecChecker();
        for(int i=0;i<10;i++){
            if(obj.canStudentVote(age[i])){
                System.out.printf("Student of age %d can vote\n",age[i]);
            }else{
                System.out.printf("Student of age %d can not vote\n",age[i]);
            }
        }
        scn.close();
    }
}
