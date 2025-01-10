
import java.util.Scanner;

class SumOfNNaturalNumbersUsingFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking the user for input
        System.out.println("Enter a natural number ");
        int number = sc.nextInt();

        // Check if input is a natural number
        if (number > 0) {
            // Compute sum using the formula
            int sumUsingFormula = number * (number + 1) / 2;

            // Compute sum using for loop
            int sumUsingLoop = 0;
            for (int i = 1; i <= number; i++) {
                sumUsingLoop += i;
            }

            // Display results using formula and loop
            System.out.println("Sum using formula " + sumUsingFormula);
            System.out.println("Sum using for loop " + sumUsingLoop);

            // Compare results
            if (sumUsingFormula == sumUsingLoop) {
                System.out.println("Both computations match.");
            } else {
                System.out.println("The computations do not match.");
            }
        } 

        // Close the scanner
        sc.close();
    }
}