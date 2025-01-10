class ProfitLossInNumberAndPercentage {
	/* calculate the profit and loss in number and percentage based on the cost price and the selling price.*/
	public static void main(String[] args) {
		// Cost price of product in INR
		int costPrice = 129;
		// Selling price of product in INR
		int sellingPrice = 191;
		// Profit in number
		float profitNumber = sellingPrice - costPrice;
		// Profit in percentage
		float profitPercentage = (profitNumber / costPrice) * 100;
		// Display cost price and selling price
		System.out.println("The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice);
		// Display profit
		System.out.println("The Profit is INR " + profitNumber + " and the Profit Percentage is " + profitPercentage);
	}
}
