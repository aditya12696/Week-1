import java.util.Scanner;

public class FactorCalculator {

    // Method to find the factors of a number
    public static int[] findFactors(int number) {
        int count = 0;
        // First loop to count the number of factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        
        // Create an array of factors
        int[] factors = new int[count];
        int index = 0;
        
        // Second loop to store the factors in the array
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }

    // Method to find the sum of the factors
    public static int findSum(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Method to find the product of the factors
    public static int findProduct(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    // Method to find the sum of the square of the factors
    public static double findSumOfSquares(int[] factors) {
        double sumOfSquares = 0;
        for (int factor : factors) {
            sumOfSquares += Math.pow(factor, 2);
        }
        return sumOfSquares;
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner inputScanner = new Scanner(System.in);

        // Take user input for the number
        System.out.print("Enter a number: ");
        int number = inputScanner.nextInt();

        // Find the factors of the number
        int[] factors = findFactors(number);

        // Display the factors
        System.out.println("Factors of " + number + " are: ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }

        // Calculate and display the sum, product, and sum of squares of factors
        System.out.println("\nSum of factors: " + findSum(factors));
        System.out.println("Product of factors: " + findProduct(factors));
        System.out.println("Sum of squares of factors: " + findSumOfSquares(factors));

        // Close the Scanner object
        inputScanner.close();
    }
}