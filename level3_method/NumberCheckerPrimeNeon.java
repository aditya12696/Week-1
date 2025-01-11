import java.util.Scanner;

public class NumberCheckerPrimeNeon {

    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false; // 1 and numbers less than 1 are not prime
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // Found a divisor, not prime
            }
        }
        return true; // No divisors found, the number is prime
    }

    // Method to check if a number is a neon number
    public static boolean isNeon(int number) {
        int square = number * number;
        int sum = 0;

        while (square > 0) {
            sum += square % 10; // Add the last digit of the square
            square = square / 10; // Remove the last digit
        }

        return sum == number; // If the sum of digits equals the number itself
    }

    // Method to check if a number is a spy number
    public static boolean isSpy(int number) {
        int sum = 0;
        int product = 1;
        int temp = number;

        while (temp > 0) {
            int digit = temp % 10;
            sum += digit; // Sum of digits
            product *= digit; // Product of digits
            temp = temp / 10; // Remove the last digit
        }

        return sum == product; // If sum equals product
    }

    // Method to check if a number is an automorphic number
    public static boolean isAutomorphic(int number) {
        int square = number * number;
        String numStr = String.valueOf(number);
        String squareStr = String.valueOf(square);

        return squareStr.endsWith(numStr); // Check if square ends with the number itself
    }

    // Method to check if a number is a buzz number
    public static boolean isBuzz(int number) {
        return number % 7 == 0 || number % 10 == 7; // Divisible by 7 or ends with 7
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is prime
        System.out.println("Is Prime: " + isPrime(number));

        // Check if the number is a neon number
        System.out.println("Is Neon Number: " + isNeon(number));

        // Check if the number is a spy number
        System.out.println("Is Spy Number: " + isSpy(number));

        // Check if the number is an automorphic number
        System.out.println("Is Automorphic Number: " + isAutomorphic(number));

        // Check if the number is a buzz number
        System.out.println("Is Buzz Number: " + isBuzz(number));

        scanner.close();
    }
}
