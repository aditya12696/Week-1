import java.util.Scanner;

public class PalindromeChecker {

    // Logic 1: Using a loop to check palindrome
    public static boolean isPalindromeUsingLoop(String text) {
        int start = 0;
        int end = text.length() - 1;
        
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Logic 2: Using recursion to check palindrome
    public static boolean isPalindromeUsingRecursion(String text, int start, int end) {
        if (start >= end) {
            return true;
        }
        
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        
        return isPalindromeUsingRecursion(text, start + 1, end - 1);
    }

    // Logic 3: Using character arrays to check palindrome
    public static boolean isPalindromeUsingCharacterArray(String text) {
        char[] originalArray = text.toCharArray();
        char[] reversedArray = new char[text.length()];
        
        // Reverse the string using charAt() method
        for (int i = 0; i < text.length(); i++) {
            reversedArray[i] = text.charAt(text.length() - 1 - i);
        }
        
        // Compare original array with reversed array
        for (int i = 0; i < text.length(); i++) {
            if (originalArray[i] != reversedArray[i]) {
                return false;
            }
        }
        
        return true;
    }

    // Main function to take user input and display the result
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Take input from the user
        System.out.print("Enter text to check if it's a palindrome: ");
        String text = scanner.nextLine().replaceAll("[\\W_]", "").toLowerCase();  // Remove non-alphanumeric characters and convert to lower case
        
        // Check using Logic 1
        boolean result1 = isPalindromeUsingLoop(text);
        System.out.println("Is palindrome (using loop): " + result1);
        
        // Check using Logic 2 (recursion)
        boolean result2 = isPalindromeUsingRecursion(text, 0, text.length() - 1);
        System.out.println("Is palindrome (using recursion): " + result2);
        
        // Check using Logic 3 (character arrays)
        boolean result3 = isPalindromeUsingCharacterArray(text);
        System.out.println("Is palindrome (using character arrays): " + result3);
        
        scanner.close();
    }
}
