import java.util.Scanner;

public class MaximumOfThree {

    // Method to take an integer input from the user
    private static int takeInput(String prompt, Scanner scanner) {
        System.out.print(prompt);
        return scanner.nextInt();
    }

    // Method to calculate the maximum of three integers
    private static int findMaximum(int num1, int num2, int num3) {
        return Math.max(num1, Math.max(num2, num3));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take three integer inputs from the user
        int number1 = takeInput("Enter the first number: ", scanner);
        int number2 = takeInput("Enter the second number: ", scanner);
        int number3 = takeInput("Enter the third number: ", scanner);

        // Find the maximum of the three numbers
        int maximum = findMaximum(number1, number2, number3);

        // Display the result
        System.out.println("The maximum of the three numbers is: " + maximum);

        // Close the scanner
        scanner.close();
    }
}
