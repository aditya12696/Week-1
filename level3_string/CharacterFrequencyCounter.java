import java.util.Scanner;

public class CharacterFrequencyCounter {

    // Method to calculate the frequency of characters in a string using charAt() method
    public static String[][] calculateCharacterFrequency(String inputText) {
        // Create an array to store the frequency of characters (256 ASCII characters)
        int[] charFrequency = new int[256];
        
        // Loop through the input text and calculate the frequency of each character
        for (int i = 0; i < inputText.length(); i++) {
            char currentChar = inputText.charAt(i);
            charFrequency[currentChar]++;
        }
        
        // Count the number of unique characters
        int uniqueCharCount = 0;
        for (int i = 0; i < 256; i++) {
            if (charFrequency[i] > 0) {
                uniqueCharCount++;
            }
        }
        
        // Create a 2D array to store the characters and their frequencies
        String[][] result = new String[uniqueCharCount][2];
        int index = 0;
        
        // Store the unique characters and their frequencies in the result array
        for (int i = 0; i < 256; i++) {
            if (charFrequency[i] > 0) {
                result[index][0] = String.valueOf((char) i);  // Convert ASCII value to char
                result[index][1] = String.valueOf(charFrequency[i]);
                index++;
            }
        }
        
        return result;
    }

    // Method to display the frequency of characters in a tabular format
    public static void displayCharacterFrequency(String[][] frequencyData) {
        System.out.println("Character Frequencies:");
        System.out.println("Character | Frequency");
        for (int i = 0; i < frequencyData.length; i++) {
            System.out.println(frequencyData[i][0] + "        | " + frequencyData[i][1]);
        }
    }

    // Main function to take user input and display the result
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Take user input
        System.out.print("Enter a string: ");
        String inputText = scanner.nextLine();
        
        // Get the character frequencies using the method
        String[][] frequencyData = calculateCharacterFrequency(inputText);
        
        // Display the frequency result in a tabular format
        displayCharacterFrequency(frequencyData);
        
        scanner.close();
    }
}
