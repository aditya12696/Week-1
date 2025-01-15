import java.util.Scanner;

public class . {

    // Method to find the length of a string without using the length() method
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // End of the string reached
        }
        return count;
    }

    // Method to split the text into words using charAt() without using split()
    public static String[] splitText(String text) {
        int length = findLength(text);
        int wordCount = 1; // At least one word exists

        // Count words by spaces
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        // Array to store words
        String[] words = new String[wordCount];
        int wordIndex = 0, start = 0;

        // Extract words using space as a delimiter
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ' || i == length - 1) {
                int end = (text.charAt(i) == ' ') ? i : i + 1;
                words[wordIndex] = text.substring(start, end);
                wordIndex++;
                start = i + 1;
            }
        }
        return words;
    }

    // Method to create a 2D array with words and their lengths
    public static String[][] wordsAndLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i])); // Convert length to string
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a text: ");
        String inputText = scanner.nextLine();

        // Split the text into words
        String[] words = splitText(inputText);

        // Get the words and their lengths
        String[][] wordsWithLengths = wordsAndLengths(words);

        // Display the result in tabular format
        System.out.println("\nWord\tLength");
        System.out.println("---------------");
        for (String[] entry : wordsWithLengths) {
            System.out.printf("%-8s %d\n", entry[0], Integer.parseInt(entry[1]));
        }

        scanner.close();
    }
}
