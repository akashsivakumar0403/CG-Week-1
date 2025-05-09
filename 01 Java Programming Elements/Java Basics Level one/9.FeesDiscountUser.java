import java.util.Scanner;
class FeesDiscountUser{
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		double fee=scn.nextDouble(),discountPercent=scn.nextDouble();
		double discount=(discountPercent/100)*fee;
		double amountPaid=(fee-discount);
		System.out.print("The discount amount is INR "+discount+" and final discounted fee is INR "+amountPaid);
		scn.close();
	}
}