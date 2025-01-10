import java.util.Scanner;

class SumOfNNaturalNumbersUsingWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Takin the user for input
        System.out.println("Enter a natural number : ");
        int number = sc.nextInt();

        // Check if input is a natural number
        if (number > 0) {
            // Compute sum using the formula
            int sumUsingFormula = number * (number + 1) / 2;

            // Compute sum using a while loop
            int sumUsingLoop = 0;
            int i = 1;
            while (i <= number) {
                sumUsingLoop += i;
                i++;
            }

            // Display results of both formula and while loop
            System.out.println("Sum using formula " + sumUsingFormula);
            System.out.println("Sum using while loop " + sumUsingLoop);

            // Comparing results
            if (sumUsingFormula == sumUsingLoop) {
                System.out.println("Both computations match.");
            } else {
                System.out.println("The computations do not match.");
            }
        }
        // Closing Scanner class
        sc.close();
    }
}