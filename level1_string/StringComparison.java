import java.util.Scanner;

public class StringComparison {

    // Method to compare two strings using charAt()
    public static boolean compareStringsUsingCharAt(String firstString, String secondString) {
        if (firstString.length() != secondString.length()) {
            return false; // Return false if lengths are not equal
        }
        for (int index = 0; index < firstString.length(); index++) {
            if (firstString.charAt(index) != secondString.charAt(index)) {
                return false; // Return false if any character does not match
            }
        }
        return true; // Return true if all characters match
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input for the first string
        System.out.print("Enter the first string: ");
        String firstString = scanner.next();

        // Take input for the second string
        System.out.print("Enter the second string: ");
        String secondString = scanner.next();

        // Compare strings using charAt() method
        boolean resultUsingCharAt = compareStringsUsingCharAt(firstString, secondString);

        // Compare strings using equals() method
        boolean resultUsingEquals = firstString.equals(secondString);

        // Display results
        System.out.println("Comparison using charAt(): " + resultUsingCharAt);
        System.out.println("Comparison using equals(): " + resultUsingEquals);

        // Verify if the results are the same
        if (resultUsingCharAt == resultUsingEquals) {
            System.out.println("Both methods returned the same result.");
        } else {
            System.out.println("Methods returned different results.");
        }

        scanner.close();
    }
}
