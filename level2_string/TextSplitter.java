import java.util.Scanner;

public class TextSplitter {

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

    // Method to compare two string arrays
    public static boolean compareStringArrays(String[] array1, String[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (!array1[i].equals(array2[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a text: ");
        String inputText = scanner.nextLine();

        // Split using custom method
        String[] customSplitWords = splitText(inputText);

        // Split using built-in split() method
        String[] builtInSplitWords = inputText.split(" ");

        // Compare results
        boolean areEqual = compareStringArrays(customSplitWords, builtInSplitWords);

        // Display results
        System.out.println("Words using custom method:");
        for (String word : customSplitWords) {
            System.out.println(word);
        }

        System.out.println("\nWords using built-in split() method:");
        for (String word : builtInSplitWords) {
            System.out.println(word);
        }

        // Display comparison result
        if (areEqual) {
            System.out.println("\nBoth methods produce the same result.");
        } else {
            System.out.println("\nThe results of the two methods differ.");
        }

        scanner.close();
    }
}
