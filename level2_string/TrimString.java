import java.util.Scanner;

public class TrimString {

    // Method to trim leading and trailing spaces using charAt() method
    public static int[] trimSpaces(String str) {
        int start = 0, end = str.length() - 1;

        // Find the starting point (first non-space character)
        while (start <= end && str.charAt(start) == ' ') {
            start++;
        }

        // Find the ending point (last non-space character)
        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    // Method to create a substring using charAt() method
    public static String substring(String str, int start, int end) {
        StringBuilder result = new StringBuilder();
        for (int i = start; i <= end; i++) {
            result.append(str.charAt(i));
        }
        return result.toString();
    }

    // Method to compare two strings using charAt() method
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Trim spaces using charAt()
        int[] indices = trimSpaces(input);
        String trimmedUsingCharAt = substring(input, indices[0], indices[1]);

        // Trim spaces using the built-in trim() method
        String trimmedUsingTrim = input.trim();

        // Compare both trimmed strings
        boolean areEqual = compareStrings(trimmedUsingCharAt, trimmedUsingTrim);

        // Display results
        System.out.println("Trimmed using charAt(): \"" + trimmedUsingCharAt + "\"");
        System.out.println("Trimmed using trim(): \"" + trimmedUsingTrim + "\"");
        System.out.println("Are both trimmed strings equal? " + areEqual);

        scanner.close();
    }
}
