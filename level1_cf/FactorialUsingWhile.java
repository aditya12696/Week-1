
import java.util.Scanner;

class FactorialUsingWhile{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter positive integer ");
        int number = sc.nextInt();

        // Check if input is a positive integer
        if (number < 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            // Compute factorial using a while loop
            int factorial = 1;
            int currentNumber = 1;

            while (currentNumber <= number) {
                factorial *= currentNumber;
                currentNumber++;
            }

            System.out.println("The factorial of " + number + " is: " + factorial);
        }
		// Close Scanner class
        sc.close();
    }
}

