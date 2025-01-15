import java.util.Scanner;

public class CharacterFrequency {

    // Method to find the frequency of characters in a string
    public static String[] findCharacterFrequency(String text) {
        // Convert the text into a character array
        char[] chars = text.toCharArray();
        int[] frequency = new int[chars.length];
        String[] result = new String[chars.length];
        
        // Outer loop to check each character
        for (int i = 0; i < chars.length; i++) {
            // Skip if the character has already been counted
            if (chars[i] == '0') {
                continue;
            }
            
            // Initialize frequency to 1
            frequency[i] = 1;
            
            // Inner loop to find duplicate characters and count them
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    frequency[i]++;
                    chars[j] = '0'; // Mark the character as counted
                }
            }
        }
        
        // Store the result in the 1D String array
        int index = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') {
                result[index] = chars[i] + ": " + frequency[i];
                index++;
            }
        }
        
        // Return the result array with frequencies
        return result;
    }

    // Main function to take user input and display the frequency of characters
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Take input from the user
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();
        
        // Get the frequency of characters using the method
        String[] frequencyResult = findCharacterFrequency(text);
        
        // Display the result
        System.out.println("Character Frequencies:");
        for (String result : frequencyResult) {
            if (result != null) {
                System.out.println(result);
            }
        }
        
        scanner.close();
    }
}
