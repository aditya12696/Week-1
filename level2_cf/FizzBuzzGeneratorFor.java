
import java.util.Scanner;

class FizzBuzzGeneratorFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input Number up to which FizzBuzz is generated
        System.out.print("Enter a non-negative number to generate FizzBuzz: ");
        int limit = scanner.nextInt();

        // Validate input to ensure it's non-negative
        if (limit < 0) {
            System.out.println("Invalid input.");
            scanner.close();
            return;
        }

        // Generate FizzBuzz sequence
        for (int i = 0; i <= limit; i++) {
            // Divisible by both 3 and 5
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            }
            // Divisible by 3 only
            else if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            // Divisible by 5 only
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            // Not divisible by 3 or 5
            else {
                System.out.println(i);
            }
        }

        // Close the scanner object
        scanner.close();
    }
}

R
