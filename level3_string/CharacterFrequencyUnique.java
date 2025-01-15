
 import java.util.Scanner;

public class CharacterFrequencyUnique {

    // Method to find unique characters in a string using charAt() method
    public static char[] uniqueCharacters(String text) {
        // Create a boolean array to track if a character has been added
        boolean[] found = new boolean[256]; // For ASCII characters
        StringBuilder uniqueChars = new StringBuilder();
        
        // Loop through the string and find unique characters
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (!found[ch]) {
                found[ch] = true;
                uniqueChars.append(ch); // Append unique character to the result
            }
        }
        
        // Convert the StringBuilder to a character array and return it
        return uniqueChars.toString().toCharArray();
    }

    // Method to find the frequency of characters in a string and return a 2D array
    public static String[][] characterFrequency(String text) {
        // Create an array to store the frequency of characters (256 ASCII characters)
        int[] frequency = new int[256];
        
        // Loop through the string to calculate the frequency of each character
        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }
        
        // Get the unique characters from the text
        char[] uniqueChars = uniqueCharacters(text);
        
        // Create a 2D array to store characters and their frequencies
        String[][] result = new String[uniqueChars.length][2];
        
        // Loop through the unique characters and store their frequencies
        for (int i = 0; i < uniqueChars.length; i++) {
            result[i][0] = String.valueOf(uniqueChars[i]);
            result[i][1] = String.valueOf(frequency[uniqueChars[i]]);
        }
        
        return result;
    }

    // Method to display the character frequencies in a tabular format
    public static void displayResult(String[][] result) {
        System.out.println("Character Frequencies:");
        System.out.println("Character | Frequency");
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + "        | " + result[i][1]);
        }
    }

    // Main function to take user input and display the result
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Take user input
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();
        
        // Get the frequency of characters using the method
        String[][] result = characterFrequency(text);
        
        // Display the result in a tabular format
        displayResult(result);
        
        scanner.close();
    }
}