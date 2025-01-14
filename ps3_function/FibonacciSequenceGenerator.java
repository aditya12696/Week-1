import java.util.Scanner;

public class FibonacciSequenceGenerator {

    // Function to generate and print the Fibonacci sequence
    private static void generateFibonacci(int terms) {
        if (terms <= 0) {
            System.out.println("Please enter a positive number of terms.");
            return;
        }

        long first = 0, second = 1;

        // Print the Fibonacci sequence
        System.out.print("Fibonacci Sequence: ");
        for (int i = 1; i <= terms; i++) {
            System.out.print(first + " ");
            long next = first + second;
            first = second;
            second = next;
        }
        System.out.println(); // Move to the next line after printing the sequence
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter the number of terms to generate in the Fibonacci sequence: ");
        int terms = scanner.nextInt();

        // Call the function to generate and print the Fibonacci sequence
        generateFibonacci(terms);

        // Close the scanner
        scanner.close();
    }
}
