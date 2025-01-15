import java.util.Scanner;

public class TextAnalysis {

    // Method to split the text into words without using split()
    public static String[] splitTextIntoWords(String text) {
        int wordCount = 0;
        int[] spaceIndexes = new int[text.length()];
        spaceIndexes[0] = -1; // Starting point for the first word
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[++wordCount] = i; // Store index of space
            }
        }
        spaceIndexes[++wordCount] = text.length(); // Ending point for the last word

        String[] words = new String[wordCount];
        for (int i = 0; i < wordCount; i++) {
            words[i] = text.substring(spaceIndexes[i] + 1, spaceIndexes[i + 1]);
        }
        return words;
    }

    // Method to find the length of a string without using length()
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            return count;
        }
    }

    // Method to create a 2D array with words and their lengths
    public static String[][] wordsWithLengths(String[] words) {
        String[][] wordLengths = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            wordLengths[i][0] = words[i];
            wordLengths[i][1] = String.valueOf(findLength(words[i]));
        }
        return wordLengths;
    }

    // Method to find shortest and longest words
    public static String[] findShortestAndLongest(String[][] wordLengths) {
        String shortest = wordLengths[0][0];
        String longest = wordLengths[0][0];

        for (String[] wordLength : wordLengths) {
            if (findLength(wordLength[0]) < findLength(shortest)) {
                shortest = wordLength[0];
            }
            if (findLength(wordLength[0]) > findLength(longest)) {
                longest = wordLength[0];
            }
        }
        return new String[]{shortest, longest};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Process input
        String[] words = splitTextIntoWords(input);
        String[][] wordLengths = wordsWithLengths(words);
        String[] shortestAndLongest = findShortestAndLongest(wordLengths);

        // Display results
        System.out.println("\nWords with their lengths:");
        for (String[] wordLength : wordLengths) {
            System.out.println("Word: " + wordLength[0] + ", Length: " + wordLength[1]);
        }

        System.out.println("\nShortest Word: " + shortestAndLongest[0]);
        System.out.println("Longest Word: " + shortestAndLongest[1]);

        scanner.close();
    }
}
