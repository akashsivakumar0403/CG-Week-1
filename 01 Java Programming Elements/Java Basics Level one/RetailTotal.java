import java.util.Scanner;

class RetailTotal{
	public static void main(String[] args){
		Scanner scn= new Scanner(System.in);
		double unitPrice=scn.nextDouble();
		double quantity=scn.nextDouble();
		double total=unitPrice*quantity;
		System.out.printf("The total purchase price is INR %.2f if the quantity %.2f and unit price is INR %.2f",total,quantity,unitPrice);
		scn.close();
	}
}