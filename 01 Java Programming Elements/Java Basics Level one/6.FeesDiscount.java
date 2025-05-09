class FeesDiscount{
	public static void main(String[] args){
		double fee=125000,percent=10;
		double discount=(percent/100)*fee;
		double amountPaid=(fee-discount);
		System.out.print("The discount amount is INR "+discount+" and final discounted fee is INR "+amountPaid);
	}
}