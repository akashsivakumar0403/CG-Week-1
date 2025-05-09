import java.util.Scanner;
import java.lang.Math;
public class NumberChecker{
    public int digitCount(int number){
        int count=0;
        while(number>0){
            number/=10;
            count++;
        }
        return count;
    }
    public int[] storeDigits(int number, int size){
        int[] array=new int[size];
        for(int i=size-1;i>=0;i--){
            array[i]=number%10;
            number/=10;
        }
        return array;
    }
    public void isDuckNumber(int[] array){
        int count=0;
        for(int i=0;i<array.length;i++){
            if(array[i]==0){
                count++;
            }
        }
        if(count==0){
            System.out.println("Duck Number");
        }else{
            System.out.println("Not a Duck Number");
        }
    }
    public void isArmstrongNumber(int[] array,int number){
        int total=0;
        for(int i=0;i<array.length;i++){
            total+=Math.pow((double) array[i],3);
        }
        if(total==number){
            System.out.println("Armstrong Number");
        }else{
            System.out.println("Not an Armstrong Number");
        }
    }
    public int[] largest(int[] array) {
        int[] max = new int[2];
        max[0] = Integer.MIN_VALUE;
        max[1] = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max[0]) {
                max[1] = max[0];
                max[0] = array[i];
                }else if(array[i] > max[1] && array[i] < max[0]){
                    max[1] = array[i];
                }
            }
        return max;
    }
    public int[] smallest(int[] array){
        int[] min=new int[2];
        min[0]=Integer.MAX_VALUE;
        min[1]=Integer.MAX_VALUE;
            for (int i = 0; i < array.length; i++) {
                if (array[i] < min[0]) {
                    min[1] = min[0];
                    min[0] = array[i];
                }else if(array[i] < min[1] && array[i] > min[0]){
                    min[1] = array[i];
                }
            }
            return min;
    }
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter number");
        int number=scn.nextInt();
        NumberChecker obj=new NumberChecker();
        int numberOfDigits=obj.digitCount(number);
        int[] array=new int[numberOfDigits];
        array=obj.storeDigits(number,numberOfDigits);
        int[] maximumNumbers=obj.largest(array);
        int[] minimumNumbers=obj.smallest(array);
        System.out.println(number);
        System.out.println(numberOfDigits);
        for(int i=0;i<numberOfDigits;i++){
            System.out.println(array[i]);
        }
        obj.isDuckNumber(array);
        obj.isArmstrongNumber(array,number);
        System.out.println(maximumNumbers[0]+" "+maximumNumbers[1]);
        System.out.println(minimumNumbers[0]+" "+minimumNumbers[1]);

    }
}
