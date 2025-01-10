
import java.util.Scanner;

public class GreatestFactorCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user for input
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        // Validate the input to ensure it's a positive number
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            // Initialize the greatest factor to 1
            int greatestFactor = 1;

            // Loop through numbers from (number - 1) down to 1 to find the greatest factor
            for (int i = number - 1; i >= 1; i--) {
		    // Update greatestFactor once a factor is found
                if (number % i == 0) {
                    greatestFactor = i;  
                    break;  
                }
            }

            // Display the greatest factor of the number
            System.out.println("The greatest factor of " + number + " besides itself is: " + greatestFactor);
        }
        // Close the scanner object
        scanner.close();
    }
}