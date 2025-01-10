import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user to enter the base number
        System.out.print("Enter the base number: ");
        int base = scanner.nextInt();

        // Taking user to enter the power (exponent)
        System.out.print("Enter the power: ");
        int exponent = scanner.nextInt();

        // Initializing the result variable to 1
        int result = 1;

        // Calculating the power using a loop
        for (int i = 1; i <= exponent; i++) {
            // Multiply the result by the base in each iteration
            result *= base; 
        }

        // Displaying the calculated result
        System.out.println(base + " raised to the power " + exponent + " is: " + result);

        // Closing the scanner object
        scanner.close();
    }
}