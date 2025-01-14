import java.util.Scanner;

public class StringConversionAndWordLength {

    // Method to convert text to lowercase using charAt() method
    public static String convertToLowerCase(String text) {
        StringBuilder lowerCaseText = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            // Check if the character is an uppercase letter
            if (ch >= 'A' && ch <= 'Z') {
                // Convert uppercase letter to lowercase
                ch = (char) (ch + 32); // Difference between 'A' and 'a' is 32
            }
            lowerCaseText.append(ch); // Append the character to the result
        }

        return lowerCaseText.toString();
    }

    // Method to compare two strings and return a boolean result
    public static boolean compareStrings(String str1, String str2) {
        return str1.equals(str2);
    }

    // Method to split the text into words using charAt() method
    public static String[] splitTextIntoWords(String text) {
        // Temporarily hold the words
        StringBuilder wordBuilder = new StringBuilder();
        // Store words
        String[] words = new String[100];
        int index = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch == ' ') {
                if (wordBuilder.length() > 0) {
                    words[index++] = wordBuilder.toString();
                    wordBuilder.setLength(0); // Reset the word builder
                }
            } else {
                wordBuilder.append(ch);
            }
        }

        // Add the last word
        if (wordBuilder.length() > 0) {
            words[index++] = wordBuilder.toString();
        }

        // Return only the non-null elements of the array
        String[] result = new String[index];
        System.arraycopy(words, 0, result, 0, index);
        return result;
    }

    // Method to find and return the length of a word without using length() method
    public static String findLength(String word) {
        int length = 0;
        for (int i = 0; i < word.length(); i++) {
            length++;
        }
        return String.valueOf(length);
    }

    // Method to create a 2D array of word and its length
    public static String[][] getWordAndLengthArray(String[] words) {
        String[][] wordLengthArray = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            wordLengthArray[i][0] = words[i]; // Word
            wordLengthArray[i][1] = findLength(words[i]); // Length of the word
        }

        return wordLengthArray;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the text
        System.out.print("Enter the text: ");
        String text = scanner.nextLine();

        // Convert the text to lowercase using charAt() method
        String lowerCaseTextCharAt = convertToLowerCase(text);
        // Convert the text to lowercase using the built-in toLowerCase() method
        String lowerCaseTextBuiltIn = text.toLowerCase();

        // Compare both the results
        boolean areEqual = compareStrings(lowerCaseTextCharAt, lowerCaseTextBuiltIn);

        // Display the results
        System.out.println("\nOriginal Text: " + text);
        System.out.println("Lowercase using charAt(): " + lowerCaseTextCharAt);
        System.out.println("Lowercase using toLowerCase(): " + lowerCaseTextBuiltIn);
        System.out.println("Are both lowercase results equal? " + areEqual);

        // Split the text into words and get the word and length array
        String[] words = splitTextIntoWords(text);
        String[][] wordLengthArray = getWordAndLengthArray(words);

        // Display word and its corresponding length in tabular format
        System.out.println("\nWord\t\tLength");
        for (int i = 0; i < wordLengthArray.length; i++) {
            System.out.println(wordLengthArray[i][0] + "\t\t" + Integer.parseInt(wordLengthArray[i][1]));
        }

        scanner.close();
    }
}
