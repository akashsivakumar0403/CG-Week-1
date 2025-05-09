import java.util.Random;
import java.util.Scanner;

public class Random5 {
    public int[] generate4DigitRandomNumber(int size) {
        int[] numbers=new int[size];
        for(int i=0;i<size;i++) {
            numbers[i] = (int) ((Math.random() * 9000) + 1000);
        }
        return numbers;
    }
    public double[] findAverageMinMax(int[] numbers){
        double[] calculations=new double[3];
        double total=0,max=numbers[0],min=numbers[0];
        for(int i=0;i<numbers.length;i++){
            total+=numbers[i];
            max=Math.max(max,numbers[i]);
            min=Math.min(min,numbers[i]);
        }
        calculations[0]=total/numbers.length;
        calculations[1]=min;
        calculations[2]=max;
        return calculations;
    }
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int size=scn.nextInt();
        int[] numbers=new int[size];
        double[] avgMinMax=new double[3];
        Random5 obj=new Random5();
        numbers=obj.generate4DigitRandomNumber(size);
        avgMinMax=obj.findAverageMinMax(numbers);
        System.out.println("Numbers generated "+numbers[0]+" "+numbers[1]+" "+numbers[2]+" "+numbers[3]+" "+numbers[4]);
        System.out.println("Average "+avgMinMax[0]);
        System.out.println("Minimum "+avgMinMax[1]);
        System.out.println("Maximum "+avgMinMax[2]);
        scn.close();
    }
}
