import java.util.Scanner;
public class BasicCalculator {
    /* basic calculator that can perform addition, subtraction, multiplication, and division.*/
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        // taking input number1
        float number1 = scanner.nextFloat();
        // taking input number2
        float number2 = scanner.nextFloat();
        // Perform Addition operations
        float additionResult = number1 + number2;
        // Perform Subtraction operations
        float subtractionResult = number1 - number2;
        // Perform Multiplication operations
        float multiplicationResult = number1 * number2;
        // Perform Division operations
        float divisionResult = number1 / number2;
        // Print out Arithmetic operations
        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " + number1 + " and " + number2 + " is " + additionResult + ", " + subtractionResult + ", " + multiplicationResult + ", and " + divisionResult);
        // Scanner class closed
        scanner.close();
    }
}
