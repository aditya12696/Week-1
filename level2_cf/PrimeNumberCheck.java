
import java.util.Scanner;

class PrimeNumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input A number to check if it's prime
        System.out.print("Enter a number to check if it's prime: ");
        int number = scanner.nextInt();

        // Validate the number, prime numbers are greater than 1
        if (number <= 1) {
            System.out.println(number + " is not a prime number.");
            scanner.close();
            return;
        }

        // Prime check logic
        boolean isPrime = true;  
		// Assume the number is prime initially
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
				// If divisible by any number other than 1 and itself				
                isPrime = false;
				// Exit the loop as we found that it's not a prime number
                break;  
            }
        }

        // Output the result based on the isPrime variable
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        // Close the scanner
        scanner.close();
    }
}