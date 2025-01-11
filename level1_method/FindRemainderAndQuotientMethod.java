import java.util.Scanner;

public class FindRemainderAndQuotientMethod {

    // To find the quotient and remainder of a division
    public static int[] findRemainderAndQuotientMethod(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;
        return new int[]{quotient, remainder};
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner inputScanner = new Scanner(System.in);

        // Take user input for number and divisor
        System.out.print("Enter the number: ");
        int number = inputScanner.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = inputScanner.nextInt();

        // Find the quotient and remainder
        int[] result = findRemainderAndQuotientMethod(number, divisor);

        // Display the result
        System.out.println("The quotient is: " + result[0]);
        System.out.println("The remainder is: " + result[1]);

        // Close the Scanner object
        inputScanner.close();
    }
}
