
import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        // Taking input from user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int inputNumber = scanner.nextInt();

        int sum = 0;

        // Store the original number for later comparison
        int originalNumber = inputNumber;

        // Use while loop to check each digit of the number
        while (originalNumber != 0) {
            // Find the remainder of the number (last digit)
            int remainder = originalNumber % 10;

            // Cube the digit and add it to the sum
            sum += remainder * remainder * remainder;

            // Update the originalNumber by removing the last digit
            originalNumber /= 10;
        }

        // Check if the sum equals the input number
        if (sum == inputNumber) {
            System.out.println(inputNumber + " is an Armstrong number.");
        } else {
            System.out.println(inputNumber + " is not an Armstrong number.");
        }

        // Close the scanner object to prevent resource leaks
        scanner.close();
    }
}