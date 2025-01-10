import java.util.*;
public class CalculateQuotientRemainder {
    // numbers and print their quotient and reminder
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        // Input numbers1
        int number1 = scanner.nextInt();
        // Input numbers2
        int number2 = scanner.nextInt();
        // Calculate quotient
        int quotient = number1 / number2;
        // Calculate remainder
        int remainder = number1 % number2;
        // Output the result
        System.out.println("The Quotient is " + quotient + " and Remainder is " + remainder + " of two numbers " + number1 + " and " + number2);
        // Close the Scanner object
        scanner.close();
    }
}
