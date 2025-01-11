import java.util.Scanner;

public class NumberCheck {
    // To determine if a number is positive, negative, or zero
    public static int checkNumberSign(int number) {
		// Positive number
        if (number > 0) {
            return 1; 
        } else if (number < 0) { // Negative number
            return -1; 
        } else { // Number is zero
            return 0; 
        }
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner inputScanner = new Scanner(System.in);

        // Taking user input for the number
        System.out.print("Enter a number: ");
        int userInput = inputScanner.nextInt();

        // Get the result 
        int result = checkNumberSign(userInput);

        // Display the result
        if (result == 1) {
            System.out.println("The number is positive.");
        } else if (result == -1) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        // Close the Scanner object
        inputScanner.close();
    }
}