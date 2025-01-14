import java.util.Scanner;

public class BasicCalculator {

    // Function to perform addition
    private static double add(double num1, double num2) {
        return num1 + num2;
    }

    // Function to perform subtraction
    private static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    // Function to perform multiplication
    private static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    // Function to perform division
    private static double divide(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return Double.NaN; // Return NaN if division by zero
        }
        return num1 / num2;
    }

    // Function to take input from the user
    private static double takeInput(Scanner scanner, String prompt) {
        System.out.print(prompt);
        return scanner.nextDouble();
    }

    // Function to display the result
    private static void displayResult(String operation, double result) {
        System.out.println("The result of " + operation + " is: " + result);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to choose an operation
        System.out.println("Basic Calculator:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        System.out.print("Enter the operation number (1/2/3/4): ");
        int choice = scanner.nextInt();

        // Take the numbers for calculation
        double num1 = takeInput(scanner, "Enter the first number: ");
        double num2 = takeInput(scanner, "Enter the second number: ");

        // Perform the operation based on user's choice
        double result = 0;
        String operation = "";

        switch (choice) {
            case 1:
                result = add(num1, num2);
                operation = "addition";
                break;
            case 2:
                result = subtract(num1, num2);
                operation = "subtraction";
                break;
            case 3:
                result = multiply(num1, num2);
                operation = "multiplication";
                break;
            case 4:
                result = divide(num1, num2);
                operation = "division";
                break;
            default:
                System.out.println("Invalid choice! Please choose a valid operation.");
                scanner.close();
                return;
        }

   
