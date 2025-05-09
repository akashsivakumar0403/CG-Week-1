import java.util.Scanner;

class SumNaturalNumbers{
    private static int findSum(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        return sum;
    }    
	public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter a integer: ");
        int n=scn.nextInt();
		SumNaturalNumbers sumNaturalNumbers=new SumNaturalNumbers();
        
        if(n<1){
            System.out.println("Enter a positive integer.");
        }else{
            int sum=sumNaturalNumbers.findSum(n);
            System.out.println("Sum of first "+n+" natural numbers is: "+sum);
        }
        scn.close();
    }
}
