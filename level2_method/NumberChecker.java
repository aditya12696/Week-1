import java.util.Scanner;

public class NumberChecker {

    // Method to check if the number is positive or negative
    public static String isPositive(int number) {
        if (number > 0) {
            return "Positive";
        } else if (number < 0) {
            return "Negative";
        }
        return "Zero";
    }

    // Method to check if the number is even or odd
    public static String isEven(int number) {
        if (number % 2 == 0) {
            return "Even";
        }
        return "Odd";
    }

    // Method to compare two numbers
    public static int compare(int number1, int number2) {
        if (number1 > number2) {
            return 1;
        } else if (number1 == number2) {
            return 0;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        int[] numbers = new int[5];

        // Loop to take input for 5 numbers
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = inputScanner.nextInt();
        }

        // Check positive/negative and even/odd
        for (int i = 0; i < 5; i++) {
            String posNeg = isPositive(numbers[i]);
            if (posNeg.equals("Positive")) {
                System.out.println(numbers[i] + " is " + posNeg + " and " + isEven(numbers[i]) + ".");
            } else if (posNeg.equals("Negative")) {
                System.out.println(numbers[i] + " is " + posNeg + ".");
            } else {
                System.out.println(numbers[i] + " is Zero.");
            }
        }

        // Compare the first and last elements of the array
        int comparisonResult = compare(numbers[0], numbers[4]);
        if (comparisonResult == 1) {
            System.out.println("First number is greater than last number.");
        } else if (comparisonResult == 0) {
            System.out.println("First and last numbers are equal.");
        } else {
            System.out.println("First number is less than last number.");
        }

        inputScanner.close();
    }
}