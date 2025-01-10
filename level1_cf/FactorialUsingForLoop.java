
import java.util.Scanner;

public class FactorialUsingForLoop{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter positive integer ");
        int number = sc.nextInt();

        // Check if the input is a positive integer or not
        if (number < 0) {
            System.out.println("Please enter positive integer");
        } else {
            // Compute factorial using a for loop
            int factorial = 1;

            for (int currNumber = 1; currNumber <= number; currNumber++) {
                factorial *= currNumber;
            }
			// Display output 
            System.out.println("The factorial of " + number + " is: " + factorial);
        }

        sc.close();
    }
}