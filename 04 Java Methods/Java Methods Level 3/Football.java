import java.util.Scanner;
import java.lang.Math;
public class Football{
    public double random3Digit(){
        return (150 +(Math.random()*((250-150)+1)));
    }
    public double sumOfArray(double[] array) {
        double total=0;
        for(int i=0;i<array.length;i++){
            total+=array[i];
        }
        return total;
    }
    public double meanHeight(double[] array,double total){
        return total/array.length;
    }
    public double minHeight(double[] array){
        double min=array[0];
        for(int i=1;i<array.length;i++){
            min=Math.min(array[i],min);
        }
        return min;
    }
    public double maxHeight(double[] array){
        double max=array[0];
        for(int i=1;i<array.length;i++){
            max=Math.max(array[i],max);
        }
        return max;
    }
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter heights of 11 players");
        double[] heights=new double[11];
        Football obj=new Football();
        for(int i=0;i<11;i++) {
            heights[i] =obj.random3Digit();
        }
        double sumOfHeights=obj.sumOfArray(heights),minHeight=obj.minHeight(heights),maxHeight=obj.maxHeight(heights);
        System.out.printf("Sum of all heights is %.2f\n",sumOfHeights);
        System.out.printf("Minimum heights is %.2f\n",minHeight);
        System.out.printf("Maximum height is %.2f",maxHeight);
        scn.close();
    }
}
