import java.util.Scanner;

class SmallestLargest{
    public int checkSmallest(int number1,int number2,int number3){
        return Math.min(number1,Math.min(number2,number3));
    }

    public int checkLargest(int number1,int number2,int number3){
        return Math.max(number1,Math.max(number2,number3));
    }

    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter numbers:");
        int number1=scn.nextInt(),number2=scn.nextInt(),number3=scn.nextInt();
        SmallestLargest smallestLargest=new SmallestLargest();
        int largest=smallestLargest.checkLargest(number1,number2,number3),smallest=smallestLargest.checkSmallest(number1,number2,number3);
        System.out.println("Smallest is " +smallest);
        System.out.println("Largest is " +largest);
        scn.close();
    }
}
