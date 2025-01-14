import java.util.Scanner;

public class SubstringComparison {

    // Method to create a substring using charAt()
    public static String createSubstringUsingCharAt(String text, int startIndex, int endIndex) {
        StringBuilder substring = new StringBuilder();
        for (int index = startIndex; index < endIndex; index++) {
            substring.append(text.charAt(index));
        }
        return substring.toString();
    }

    // Method to compare two strings using charAt()
    public static boolean compareStringsUsingCharAt(String firstString, String secondString) {
        if (firstString.length() != secondString.length()) {
            return false;
        }
        for (int index = 0; index < firstString.length(); index++) {
            if (firstString.charAt(index) != secondString.charAt(index)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input for the main string
        System.out.print("Enter the main string: ");
        String mainString = scanner.next();

        // Take input for the start index
        System.out.print("Enter the start index: ");
        int startIndex = scanner.nextInt();

        // Take input for the end index
        System.out.print("Enter the end index: ");
        int endIndex = scanner.nextInt();

        // Validate indices
        if (startIndex < 0 || endIndex > mainString.length() || startIndex >= endIndex) {
            System.out.println("Invalid indices. Please enter valid start and end indices.");
            return;
        }

        // Create substring using charAt()
        String substringUsingCharAt = createSubstringUsingCharAt(mainString, startIndex, endIndex);

        // Create substring using built-in substring() method
        String substringUsingBuiltIn = mainString.substring(startIndex, endIndex);

        // Compare substrings using charAt() method
        boolean areEqual = compareStringsUsingCharAt(substringUsingCharAt, substringUsingBuiltIn);

        // Display results
        System.out.println("Substring using charAt(): " + substringUsingCharAt);
        System.out.println("Substring using built-in substring(): " + substringUsingBuiltIn);
        System.out.println("Are both substrings equal? " + areEqual);

        scanner.close();
    }
}
