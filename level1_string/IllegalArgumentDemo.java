import java.util.Scanner;

public class IllegalArgumentDemo {

    // Method to generate IllegalArgumentException by calling substring() with invalid indices
    public static void generateException(String text) {
        System.out.println("Generating IllegalArgumentException...");
        // Calling substring() with start index greater than end index
        String result = text.substring(5, 2);  // This will throw IllegalArgumentException
        System.out.println("Substring result: " + result);
    }

    // Method to handle IllegalArgumentException
    public static void handleException(String text) {
        System.out.println("Handling IllegalArgumentException...");
        try {
            // Calling substring() with invalid indices
            String result = text.substring(5, 2);  // This will throw IllegalArgumentException
            System.out.println("Substring result: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        } catch (RuntimeException e) {
            // Catch any other runtime exceptions
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        // Call the method to generate the exception
        try {
            generateException(userInput);
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException occurred in generateException(): " + e.getMessage());
        }

        // Call the method to handle the exception
        handleException(userInput);

        scanner.close();
    }
}
