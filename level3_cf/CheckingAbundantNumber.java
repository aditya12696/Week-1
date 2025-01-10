import java.util.Scanner;

public class CheckingAbundantNumber {
    public static void main(String[] args) {
        // Create a scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Enter a number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Initialize sum to calculate the sum of divisors
        int sum = 0;

        // Loop to find all divisors of the number
        for (int i = 1; i < number/2; i++) {
            if (number % i == 0) {
                sum += i; // Add the divisor to the sum
            }
        }

        // Check if the sum of divisors is greater than the number
        if (sum > number) {
            System.out.println(number + " is an Abundant Number.");
        } else {
            System.out.println(number + " is not an Abundant Number.");
        }

        // Close the scanner
        sc.close();
    }
}
