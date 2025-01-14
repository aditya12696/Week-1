import java.util.Scanner;

public class StringIndexOutOfBoundsDemo {

    // Method to generate StringIndexOutOfBoundsException
    public static void generateException(String text) {
        System.out.println("Generating StringIndexOutOfBoundsException...");
        // Access an invalid index to trigger the exception
        System.out.println("Character at position 100: " + text.charAt(100));
    }

    // Method to handle StringIndexOutOfBoundsException
    public static void handleException(String text) {
        System.out.println("Handling StringIndexOutOfBoundsException...");
        try {
            // Attempt to access an invalid index
            System.out.println("Character at position 100: " + text.charAt(100));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: Invalid index accessed.");
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
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException occurred in generateException(): " + e.getMessage());
        }

        // Call the method to handle the exception
        handleException(userInput);

        scanner.close();
    }
}
