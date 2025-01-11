import java.util.Scanner;

public class NaturalNumberSumCalculator {
    // To calculate the sum of n natural numbers using a loop
    public static int calculateSumOfNaturalNumbers(int n) {
        int sum = 0;
		
		// Add each number to the sum
        for (int i = 1; i <= n; i++) {
            sum += i; 
        }
        return sum;
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner inputScanner = new Scanner(System.in);

        // Take user input for the number
        System.out.print("Enter a positive integer (n): ");
        int n = inputScanner.nextInt();

        // Check for valid input
        if (n <= 0) {
            System.out.println("Please enter a positive integer greater than 0.");
        } else {
            // Calculate the sum of n natural numbers
            int sum = calculateSumOfNaturalNumbers(n);

            // Display the result
            System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
        }

        // Close the Scanner object
        inputScanner.close();
    }
}
