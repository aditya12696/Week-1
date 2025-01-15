import java.util.Scanner;

public class StringLength {

    // Method to find the length of a string without using the length() method
    public static int findLength(String str) {
        int count = 0;

        try {
            while (true) {
                // Attempt to access each character until an exception is thrown
                str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // Exception indicates we've reached the end of the string
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String input = scanner.next();

        // Find the length using the custom method
        int customLength = findLength(input);

        // Find the length using the built-in length() method
        int builtInLength = input.length();

        // Display the results
        System.out.println("Length using custom method: " + customLength);
        System.out.println("Length using built-in method: " + builtInLength);

        // Verify if both results are the same
        if (customLength == builtInLength) {
            System.out.println("Both methods yield the same result.");
        } else {
            System.out.println("The results of the two methods differ.");
        }

        scanner.close();
    }
}
