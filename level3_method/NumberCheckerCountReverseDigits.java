import java.util.Arrays;
import java.util.Scanner;

public class NumberCheckerCountReverseDigits {

    // Method to find the count of digits in the number
    public static int countDigits(int number) {
        return Integer.toString(number).length();
    }

    // Method to store the digits of the number in a digits array
    public static int[] storeDigits(int number) {
        int count = countDigits(number);
        int[] digits = new int[count];
        
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number = number / 10;
        }
        return digits;
    }

    // Method to reverse the digits array
    public static int[] reverseDigits(int[] digits) {
        int[] reversedDigits = new int[digits.length];
        int j = 0;
        
        for (int i = digits.length - 1; i >= 0; i--) {
            reversedDigits[j++] = digits[i];
        }
        return reversedDigits;
    }

    // Method to compare two arrays and check if they are equal
    public static boolean areArraysEqual(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    // Method to check if a number is a palindrome
    public static boolean isPalindrome(int number) {
        int[] digits = storeDigits(number);
        int[] reversedDigits = reverseDigits(digits);
        return areArraysEqual(digits, reversedDigits);
    }

    // Method to check if a number is a duck number
    public static boolean isDuckNumber(int number) {
        int[] digits = storeDigits(number);
        
        // A duck number contains at least one non-zero digit in its number
        for (int digit : digits) {
            if (digit != 0) {
                return true; // Duck number condition satisfied
            }
        }
        return false; // If no non-zero digits, it's not a duck number
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int[] digits = storeDigits(number);

        // Count the digits
        int digitCount = countDigits(number);
        System.out.println("Count of digits: " + digitCount);

        // Check if it's a palindrome
        boolean palindrome = isPalindrome(number);
        System.out.println("Is palindrome: " + palindrome);

        // Check if it's a duck number
        boolean duckNumber = isDuckNumber(number);
        System.out.println("Is duck number: " + duckNumber);

        scanner.close();
    }
}
