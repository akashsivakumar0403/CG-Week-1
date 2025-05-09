import java.util.Scanner;
import java.lang.Math;
public class Factors {
    public static int[] findFactors(int number){
        int count=0,index=-1;
        for(int i=1;i<=number;i++) {
            if (number % i == 0) {
                count ++;
            }
        }
        int[] array=new int[count];
        for(int i=1;i<=number;i++) {
            if (number%i==0) {
                index++;
                array[index]=i;
            }
        }
        return array;
    }
    public int findSum(int[] array){
        int total=0;
        for(int i=0;i<array.length;i++){
            total+=array[i];
        }
        return total;
    }
    public int findProduct(int[] array){
        int total=1;
        for(int i=0;i<array.length;i++){
            total*=array[i];
        }
        return total;
    }
    public int findSumSquare(int[] array){
        int total=0;
        for(int i=0;i<array.length;i++){
            total+=Math.pow(array[i],2);
        }
        return total;
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int number=scn.nextInt();
        Factors obj=new Factors();
        int[] factors=obj.findFactors(number);
        int sumOfFactors=obj.findSum(factors),productOfFactors=obj.findProduct(factors),sumofFactorsSquare=obj.findSumSquare(factors);
        for(int i=0;i<factors.length;i++) {
            System.out.println(factors[i]);
        }
        System.out.println("Sum of factors = "+sumOfFactors);
        System.out.println("Product of factors = "+productOfFactors);
        System.out.println("Sum of Square Factors =  "+sumofFactorsSquare);
        scn.close();
    }
}
