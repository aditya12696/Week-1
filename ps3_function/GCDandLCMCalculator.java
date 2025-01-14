import java.util.Scanner;

public class GCDandLCMCalculator {

    // Function to calculate the GCD using the Euclidean algorithm
    private static int calculateGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a; // GCD is stored in 'a'
    }

    // Function to calculate the LCM using the relation: LCM(a, b) = (a * b) / GCD(a, b)
    private static int calculateLCM(int a, int b, int gcd) {
        return (a * b) / gcd; // LCM formula
    }

    // Function to take input from the user
    private static int takeInput(Scanner scanner, String prompt) {
        System.out.print(prompt);
        return scanner.nextInt();
    }

    // Function to display the results
    private static void displayResult(int gcd, int lcm) {
        System.out.println("Greatest Common Divisor (GCD): " + gcd);
        System.out.println("Least Common Multiple (LCM): " + lcm);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user inputs
        int number1 = takeInput(scanner, "Enter the first number: ");
        int number2 = takeInput(scanner, "Enter the second number: ");

        // Calculate GCD
        int gcd = calculateGCD(number1, number2);

        // Calculate LCM
        int lcm = calculateLCM(number1, number2, gcd);

        // Display the results
        displayResult(gcd, lcm);

        // Close the scanner
        scanner.close();
    }
}
