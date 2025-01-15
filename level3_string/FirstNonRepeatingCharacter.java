import java.util.Scanner;

public class FirstNonRepeatingCharacter {

    // Method to find the first non-repeating character in a string
    public static char findFirstNonRepeatingCharacter(String inputText) {
        // Create an array to store the frequency of characters (256 ASCII characters)
        int[] charFrequency = new int[256];
        
        // Loop through the string to calculate the frequency of characters
        for (int i = 0; i < inputText.length(); i++) {
            char currentChar = inputText.charAt(i);
            charFrequency[currentChar]++;
        }

        // Loop through the string again to find the first non-repeating character
        for (int i = 0; i < inputText.length(); i++) {
            char currentChar = inputText.charAt(i);
            if (charFrequency[currentChar] == 1) {
                return currentChar; // Return the first non-repeating character
            }
        }

        return '\0'; // Return null character if no non-repeating character is found
    }

    // Main function to take user input and display the result
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Take user input
        System.out.print("Enter a string: ");
        String inputText = scanner.nextLine();
        
        // Find the first non-repeating character using the method
        char result = findFirstNonRepeatingCharacter(inputText);
        
        // Display the result
        if (result == '\0') {
            System.out.println("No non-repeating character found.");
        } else {
            System.out.println("The first non-repeating character is: " + result);
        }
        
        scanner.close();
    }
}
