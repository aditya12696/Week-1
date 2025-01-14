import java.util.Scanner;

public class NumberFormatDemo {

    // Method to generate NumberFormatException by parsing a non-numeric string
    public static void generateException(String text) {
        System.out.println("Generating NumberFormatException...");
        // Trying to parse a non-numeric string as an integer, which will throw NumberFormatException
        int result = Integer.parseInt(text);  // This will throw NumberFormatException if the string is not a valid number
        System.out.println("Parsed number: " + result);
    }

    // Method to handle NumberFormatException
    public static void handleException(String text) {
        System.out.println("Handling NumberFormatException...");
        try {
            // Trying to parse a non-numeric string as an integer
            int result = Integer.parseInt(text);  // This will throw NumberFormatException if the string is not a valid number
            System.out.println("Parsed number: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        } catch (RuntimeException e) {
            // Catch any other runtime exceptions
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string to convert to a number: ");
        String userInput = scanner.nextLine();

        // Call the method to generate the exception
        try {
            generateException(userInput);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException occurred in generateException(): " + e.getMessage());
        }

        // Call the method to handle the exception
        handleException(userInput);

        scanner.close();
    }
}
