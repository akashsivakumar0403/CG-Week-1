class ProfitSelling{
	public static void main(String[] args){
		int costPrice = 129, sellingPrice = 191;
		int Profit=sellingPrice-costPrice;
		double PercentageProfit=(Profit/(double)costPrice)*100;
		System.out.print("The Cost Price is INR "+costPrice+" and Selling Price is INR "+sellingPrice+"\nThe Profit is INR "+Profit+" and the Profit Percentage is ");
		System.out.printf("%.2f",PercentageProfit);
	}
}