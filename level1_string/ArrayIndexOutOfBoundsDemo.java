import java.util.Scanner;

public class ArrayIndexOutOfBoundsDemo {

    // Method to generate ArrayIndexOutOfBoundsException by accessing an invalid index
    public static void generateException(String[] names, int index) {
        System.out.println("Generating ArrayIndexOutOfBoundsException...");
        // Trying to access an index outside the bounds of the array
        System.out.println("Name at index " + index + ": " + names[index]);  // This will throw ArrayIndexOutOfBoundsException
    }

    // Method to handle ArrayIndexOutOfBoundsException
    public static void handleException(String[] names, int index) {
        System.out.println("Handling ArrayIndexOutOfBoundsException...");
        try {
            // Trying to access an index outside the bounds of the array
            System.out.println("Name at index " + index + ": " + names[index]);  // This will throw ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            // Catch any other runtime exceptions
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for array of names
        System.out.print("Enter the number of names: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        String[] names = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = scanner.nextLine();
        }

        // Take user input for index to access
        System.out.print("Enter an index to access: ");
        int index = scanner.nextInt();

        // Call the method to generate the exception
        try {
            generateException(names, index);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException occurred in generateException(): " + e.getMessage());
        }

        // Call the method to handle the exception
        handleException(names, index);

        scanner.close();
    }
}
