import java.util.Scanner;

public class PrimeNumberChecker {

    // Function to check if a number is prime
    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // Number is divisible by i, so it's not prime
            }
        }
        return true; // Number is prime
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter a number to check if it's prime: ");
        int number = scanner.nextInt();

        // Call the isPrime function and display the result
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        // Close the scanner
        scanner.close();
    }
}
