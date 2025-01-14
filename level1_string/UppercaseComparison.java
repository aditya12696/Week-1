import java.util.Scanner;

public class UppercaseComparison {

    // Method to convert text to uppercase using the charAt() method
    public static String convertToUpperCase(String text) {
        StringBuilder upperCaseText = new StringBuilder();
        
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            // Check if the character is a lowercase letter
            if (ch >= 'a' && ch <= 'z') {
                // Convert lowercase letter to uppercase
                ch = (char) (ch - 32);  // Difference between 'a' and 'A' is 32
            }
            upperCaseText.append(ch); // Append the character to the result
        }
        
        return upperCaseText.toString();
    }

    // Method to compare two strings and return a boolean result
    public static boolean compareStrings(String str1, String str2) {
        return str1.equals(str2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the text
        System.out.print("Enter the text: ");
        String text = scanner.nextLine();

        // Convert the text to uppercase using charAt() method
        String upperCaseTextCharAt = convertToUpperCase(text);
        // Convert the text to uppercase using the built-in toUpperCase() method
        String upperCaseTextBuiltIn = text.toUpperCase();

        // Compare both the results
        boolean areEqual = compareStrings(upperCaseTextCharAt, upperCaseTextBuiltIn);

        // Display the results
        System.out.println("Original Text: " + text);
        System.out.println("Uppercase using charAt(): " + upperCaseTextCharAt);
        System.out.println("Uppercase using toUpperCase(): " + upperCaseTextBuiltIn);
        System.out.println("Are both uppercase results equal? " + areEqual);

        scanner.close();
    }
}
