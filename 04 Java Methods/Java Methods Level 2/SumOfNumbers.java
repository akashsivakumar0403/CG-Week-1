import java.util.Scanner;

public class SumOfNumbers {
    public int recursion(int number){
        int total=0;
        for(int i=0;i<=number;i++){
            total+=i;
        }
        return total;
    }
    public int equation(int n){
        return (n*(n+1))/2;
    }
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter number");
        int number=scn.nextInt();
        SumOfNumbers obj=new SumOfNumbers();
        System.out.println("Total using recursion is "+obj.recursion(number)+"\nTotal using formula is "+obj.equation(number));
        scn.close();
    }
}
