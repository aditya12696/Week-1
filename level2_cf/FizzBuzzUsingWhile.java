
import java.util.*;
public class FizzBuzzUsingWhile {
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Input Number up to which FizzBuzz is generated
        System.out.print("Enter a non-negative number to generate FizzBuzz: ");
         int limit = scanner.nextInt();
        int currentNumber = 1;

        // Generate FizzBuzz pattern for numbers limit 
        while (currentNumber <= limit) {
            if (currentNumber % 3 == 0 && currentNumber % 5 == 0) {
                System.out.println("FizzBuzz");  // Divisible by both 3 and 5
            } else if (currentNumber % 3 == 0) {
                System.out.println("Fizz");  // Divisible by 3 only
            } else if (currentNumber % 5 == 0) {
                System.out.println("Buzz");  // Divisible by 5 only
            } else {
                System.out.println(currentNumber);  // Not divisible by 3 or 5
            }
            currentNumber++;
        }
    }
}

