import java.util.Scanner;

public class VowelConsonantChecker {

    // Method to check character type (Vowel, Consonant, or Not a Letter)
    public static String checkCharacterType(char ch) {
        ch = Character.toLowerCase(ch);
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        } else {
            return "Not a Letter";
        }
    }

    // Method to analyze string and classify characters
    public static String[][] analyzeString(String input) {
        String[][] result = new String[input.length()][2];
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            result[i][0] = String.valueOf(currentChar);
            result[i][1] = checkCharacterType(currentChar);
        }
        return result;
    }

    // Method to display 2D array in tabular format
    public static void displayResults(String[][] analysis) {
        System.out.printf("%-10s %-15s%n", "Character", "Type");
        System.out.println("---------------------------");
        for (String[] entry : analysis) {
            System.out.printf("%-10s %-15s%n", entry[0], entry[1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Analyze string
        String[][] analysis = analyzeString(input);

        // Display results
        System.out.println("\nCharacter Analysis:");
        displayResults(analysis);

        scanner.close();
    }
}
