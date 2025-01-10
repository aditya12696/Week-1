import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        // Create a scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Taking input from user 
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Store the original number for later use
        int originalNumber = number;

        // Initialize sum variable to calculate the sum of digits
        int sum = 0;

        // Use a while loop to calculate the sum of digits
        while (number != 0) {
			// Extract the last digit
            int digit = number % 10;
			// Add the digit to the sum
            sum += digit;
			// Remove the last digit
            number /= 10; 
        }

        // Check if the original number is divisible by the sum of its digits
        if (originalNumber % sum == 0) {
            System.out.println(originalNumber + " is a Harshad Number.");
        } else {
            System.out.println(originalNumber + " is not a Harshad Number.");
        }

        // Close the scanner
        sc.close();
    }
}