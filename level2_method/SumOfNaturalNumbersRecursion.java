import java.util.Scanner;

public class SumOfNaturalNumbersRecursion {

    // Method to calculate the sum of n natural numbers using recursion
    public static int recursiveSum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + recursiveSum(n - 1);
    }

    // Method to calculate the sum of n natural numbers using the formula n * (n + 1) / 2
    public static int formulaSum(int n) {
        return (n * (n + 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        // Take user input for n
        System.out.print("Enter a positive natural number: ");
        int n = inputScanner.nextInt();

        // Validate if the input is a natural number (greater than 0)
        if (n <= 0) {
            System.out.println("Please enter a valid natural number greater than 0.");
            inputScanner.close();
            return;
        }

        // Calculate the sum using both methods
        int sumRecursive = recursiveSum(n);
        int sumFormula = formulaSum(n);

        // Print both results and compare
        System.out.println("Sum using recursion: " + sumRecursive);
        System.out.println("Sum using the formula n*(n+1)/2: " + sumFormula);

        // Compare the two results
        if (sumRecursive == sumFormula) {
            System.out.println("Both results are correct and match.");
        } else {
            System.out.println("There seems to be a discrepancy between the results.");
        }

        inputScanner.close();
    }
}
