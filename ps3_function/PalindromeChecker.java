import java.util.Scanner;

public class PalindromeChecker {

    // Function to take input from the user
    private static String takeInput(Scanner scanner) {
        System.out.print("Enter a string to check if it's a palindrome: ");
        return scanner.nextLine();
    }

    // Function to check if the string is a palindrome
    private static boolean isPalindrome(String input) {
        // Remove spaces and convert to lower case for case-insensitive comparison
        input = input.replaceAll("\\s", "").toLowerCase();

        // Check if the string is equal to its reverse
        String reversed = new StringBuilder(input).reverse().toString();
        return input.equals(reversed);
    }

    // Function to display the result
    private static void displayResult(String input, boolean isPalindrome) {
        if (isPalindrome) {
            System.out.println("\"" + input + "\" is a palindrome.");
        } else {
            System.out.println("\"" + input + "\" is not a palindrome.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        String input = takeInput(scanner);

        // Check if the input is a palindrome
        boolean result = isPalindrome(input);

        // Display the result
        displayResult(input, result);

        // Close the scanner
        scanner.close();
    }
}
