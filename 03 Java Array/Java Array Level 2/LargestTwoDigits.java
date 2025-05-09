import java.util.Scanner;

class LargestTwoDigits{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int number=scn.nextInt();
        int maxDigit=10,index=0,largest=0,secondLargest=0;
        int[] digits=new int[maxDigit];
        while(number>0&&index<maxDigit){
			index++;
            digits[index]=number%10;
            number/=10;
        }
        for(int i=0;i<index+1;i++){
            if (digits[i]>largest){
                secondLargest=largest;
                largest=digits[i];
            } else if(digits[i]>secondLargest && digits[i]!=largest){
                secondLargest=digits[i];
            }
        }
		System.out.println("Largest = "+largest+"\nSecond Largest = "+secondLargest);
		scn.close();
    }
}
