import java.util.Scanner;

public class FactorialUsingRecursion {

    // Function to take input from the user
    private static int takeInput(Scanner scanner) {
        System.out.print("Enter a number to calculate its factorial: ");
        return scanner.nextInt();
    }

    // Recursive function to calculate the factorial
    private static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1; // Base case: factorial of 0 or 1 is 1
        } else {
            return n * factorial(n - 1); // Recursive case: n * factorial of (n - 1)
        }
    }

    // Function to display the result
    private static void displayResult(int number, int result) {
        System.out.println("The factorial of " + number + " is: " + result);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        int number = takeInput(scanner);

        // Calculate the factorial using recursion
        int result = factorial(number);

        // Display the result
        displayResult(number, result);

        // Close the scanner
        scanner.close();
    }
}
