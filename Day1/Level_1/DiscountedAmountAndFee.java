class DiscountedAmountAndFee {
	/* find the discounted amount and discounted price the student will pay for the
	   course.*/
	public static void main(String[] args) {
		// Taking fee and assign 125000
		int fee = 125000;
		// Taking discount percent and assign 10
		int discountPercent = 10;
		// Calculate discount amount 
		int discountAmount = (fee * discountPercent) / 100;
		// Calculate discount fee
		int discountedFee = fee - discountAmount;
		// Display result
		System.out.println("The discount amount is INR " + discountAmount + " and final discounted fee is INR " + discountedFee);
	}
}