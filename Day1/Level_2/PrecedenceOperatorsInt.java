import java.util.*;
public class PrecedenceOperatorsInt {
    // Understand the precedence of the operators.
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        // Input number 1 integers
        int a = scanner.nextInt();
        // Input number 2 integers
        int b = scanner.nextInt();
        // Input number 3 integers
        int c = scanner.nextInt();
        // Compute the operations
        int result1 = a + b * c;
        int result2 = a * b + c;
        int result3 = c + a / b;
        int result4 = a % b + c;
        // Output the results
        System.out.println("The results of Int Operations are " + result1 + ", " + result2 + ", " + result3 + ", and " + result4);
        // Close the Scanner object
        scanner.close();
    }
}
