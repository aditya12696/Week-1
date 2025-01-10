import java.util.Scanner;

public class PrecedenceOperatorsDouble {
    // Understand the precedence of the operators.
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        // Input number 1 integers
        double a = scanner.nextInt();
        // Input number 2 integers
        double b = scanner.nextInt();
        // Input number 3 integers
        double c = scanner.nextInt();
        // Compute the operations
        double result1 = a + b * c;
        double result2 = a * b + c;
        double result3 = c + a / b;
        double result4 = a % b + c;
        // Output the results
        System.out.println("The results of Int Operations are " + result1 + ", " + result2 + ", " + result3 + ", and " + result4);
        // Close the Scanner object
        scanner.close();
    }
}
