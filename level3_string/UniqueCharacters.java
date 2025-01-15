import java.util.Scanner;

public class UniqueCharacters {

    // Method to find the length of the text without using the String method length()
    public static int getStringLength(String text) {
        int length = 0;
        // Loop through the text until the null character is encountered
        while (true) {
            try {
                char ch = text.charAt(length);
                length++;
            } catch (StringIndexOutOfBoundsException e) {
                break;
            }
        }
        return length;
    }

    // Method to find unique characters in a string using charAt()
    public static char[] findUniqueCharacters(String text) {
        // Find the length of the text
        int length = getStringLength(text);

        // Create a boolean array to track if a character is already checked
        boolean[] isUnique = new boolean[length];
        // Store the unique characters in a result array
        char[] result = new char[length];
        int resultIndex = 0;

        // Outer loop to iterate through the string
        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            boolean isDuplicate = false;

            // Inner loop to check if the current character is unique
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == currentChar) {
                    isDuplicate = true;
                    break;
                }
            }

            // If the character is unique, add it to the result array
            if (!isDuplicate) {
                result[resultIndex++] = currentChar;
            }
        }

        // Create a final array with the size of the unique characters found
        char[] uniqueChars = new char[resultIndex];
        for (int i = 0; i < resultIndex; i++) {
            uniqueChars[i] = result[i];
        }
        
        return uniqueChars;
    }

    // Method to display the unique characters
    public static void displayUniqueCharacters(char[] uniqueChars) {
        System.out.print("Unique characters: ");
        for (char ch : uniqueChars) {
            System.out.print(ch + " ");
        }
        System.out.println();
    }

    // Main function to take user input and display the result
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the string
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        // Find the unique characters
        char[] uniqueChars = findUniqueCharacters(text);

        // Display the unique characters
        displayUniqueCharacters(uniqueChars);

        scanner.close();
    }
}
