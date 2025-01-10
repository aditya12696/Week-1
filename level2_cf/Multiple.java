
import java.util.Scanner;

public class Multiple {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        // Taking user to enter a number
        System.out.print("Enter a number: ");
        int inputNumber = scanner.nextInt();
        
        System.out.println("Multiples of " + inputNumber + " below 100 are:");
        
        // Loop to find and display multiples of the input number below 100, running backward
        for (int i = 100; i >= 1; i--) {
            // Check if 'i' is a multiple of 'inputNumber'
            if (i % inputNumber == 0) {
                 // Display the multiple
                 System.out.println(i); 
            }
        }
        
        // Close the scanner object to prevent resource leaks
        scanner.close();
    }
}