import java.util.*;
public class SwapTwoNumbers {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        // Input number1
        int number1 = scanner.nextInt();
        // Input number2
        int number2 = scanner.nextInt();
        // Swap the numbers
        int temp = number1;
        number1 = number2;
        number2 = temp;
        // Output the swapped numbers
        System.out.println("The swapped numbers are " + number1 + " and " + number2);
        // Close the Scanner object
        scanner.close();
    }
}
