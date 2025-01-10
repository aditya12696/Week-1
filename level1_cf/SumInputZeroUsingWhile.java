
import java.util.Scanner;

class SumInputZeroUsingWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Initialize total sum as double
        double total = 0.0;
        // Variable to store user input
        double userCurrentInput;

        // Prompt the user and continue until they enter 0
        System.out.println("Enter numbers to sum (enter 0 to stop):");
        while ((userCurrentInput = sc.nextDouble()) != 0) {
            // Add the input to the total
            total += userCurrentInput;
        }

        // Display the total sum
        System.out.println("The total sum is: " + total);

        // Close the scanner
        sc.close();
    }
}