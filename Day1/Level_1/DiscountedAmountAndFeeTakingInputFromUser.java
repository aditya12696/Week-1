import java.util.Scanner;

class DiscountedAmountAndFeeTakingInputFromUser {
	/* find the discounted amount and discounted price the student will pay for the
	   course. Take user input for Student Fee and University Discount.*/
	public static void main(String[] args) {
		// Creating Object for Scanner class
		Scanner scanner = new Scanner(System.in);
		// Taking input fee
		int fee = scanner.nextInt();
		// Taking input discount percent
		int discountPercent = scanner.nextInt();
		// Calculate discount amount 
		int discountAmount = (fee * discountPercent) / 100;
		// Calculate discount fee
		int discountedFee = fee - discountAmount;
		// Display result
		System.out.println("The discount amount is INR " + discountAmount + " and final discounted fee is INR " + discountedFee);
		// Scanner class closed
		scanner.close();
	}
}