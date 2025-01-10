
import java.util.Scanner;

public class FactorOfNumber {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        // Taking user to enter a number
        System.out.print("Enter a number: ");
        int inputNumber = scanner.nextInt();
        
        System.out.println("Factors of " + inputNumber + " are:");
        
        // Loop to find and display all factors of the input number
        for (int i = 1; i <= inputNumber/2; i++) {
			// Check if 'i' is a factor of 'inputNumber'
            if (inputNumber % i == 0) {
				// Display the factor
                System.out.println(i);  
            }
        }
        
        // Close the scanner object
        scanner.close();
    }
}