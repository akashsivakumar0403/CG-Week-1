import java.util.Scanner;
import java.util.Arrays;

class LargestTwoDigitsExpanded{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        long number=scn.nextLong();
        int maxDigit=10,index=0,largest=0,secondLargest=0;
        int[] digits=new int[maxDigit];
        while(number>0){
            if(index==maxDigit){
                maxDigit+=10;
                digits=Arrays.copyOf(digits, maxDigit);
            }
            digits[index++]=(int)number%10;
            number/=10;
        }
        for (int i=0;i<index;i++){
            if(digits[i]>largest){
                secondLargest=largest;
                largest=digits[i];
            } else if(digits[i]>secondLargest && digits[i]!=largest){
                secondLargest=digits[i];
            }
        }
        System.out.println("Largest =" +largest+"\nSecond Largest = "+secondLargest);
        scn.close();
    }
}
