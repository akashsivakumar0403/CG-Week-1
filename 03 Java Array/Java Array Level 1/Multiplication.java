import java.util.Scanner;

class Multiplication{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        int[] table = new int[10];
        for (int i=1;i<=10;i++) {
            table[i-1]=number*i;
        }
        for (int i=1;i<=10;i++) {
            System.out.printf("%d * %d = %d\n",number,i,table[i - 1]);
        scn.close();			
        }
    }
}