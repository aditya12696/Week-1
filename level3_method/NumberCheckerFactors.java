import java.util.Scanner;

public class NumberCheckerFactors {

    // Method to find factors of a number and return them as an array
    public static int[] findFactors(int number) {
        int count = 0;

        // Counting the number of factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        // Storing the factors in an array
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }

    // Method to find the greatest factor of a number using the factors array
    public static int greatestFactor(int[] factors) {
        int greatest = factors[0];
        for (int i = 1; i < factors.length; i++) {
            if (factors[i] > greatest) {
                greatest = factors[i];
            }
        }
        return greatest;
    }

    // Method to find the sum of the factors using the factors array
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Method to find the product of the factors using the factors array
    public static int productOfFactors(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    // Method to find the product of cube of the factors using the factors array
    public static double productOfCubeOfFactors(int[] factors) {
        double product = 1;
        for (int factor : factors) {
            product *= Math.pow(factor, 3);
        }
        return product;
    }

    // Method to check if a number is a perfect number
    public static boolean isPerfectNumber(int number) {
        int[] factors = findFactors(number);
        int sum = sumOfFactors(factors) - number; // Subtract the number itself
        return sum == number; // Perfect number condition
    }

    // Method to check if a number is an abundant number
    public static boolean isAbundantNumber(int number) {
        int[] factors = findFactors(number);
        int sum = sumOfFactors(factors) - number; // Subtract the number itself
        return sum > number; // Abundant number condition
    }

    // Method to check if a number is a deficient number
    public static boolean isDeficientNumber(int number) {
        int[] factors = findFactors(number);
        int sum = sumOfFactors(factors) - number; // Subtract the number itself
        return sum < number; // Deficient number condition
    }

    // Method to check if a number is a strong number
    public static boolean isStrongNumber(int number) {
        int sum = 0;
        int temp = number;
        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit); // Sum of factorial of digits
            temp /= 10;
        }
        return sum == number; // Strong number condition
    }

    // Method to calculate factorial of a number
    public static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Find factors of the number
        int[] factors = findFactors(number);
        System.out.println("Factors of " + number + ": ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();

        // Check if the number is perfect
        System.out.println("Is Perfect Number: " + isPerfectNumber(number));

        // Check if the number is abundant
        System.out.println("Is Abundant Number: " + isAbundantNumber(number));

        // Check if the number is deficient
        System.out.println("Is Deficient Number: " + isDeficientNumber(number));

        // Check if the number is strong
        System.out.println("Is Strong Number: " + isStrongNumber(number));

        // Display other calculations
        System.out.println("Greatest Factor: " + greatestFactor(factors));
        System.out.println("Sum of Factors: " + sumOfFactors(factors));
        System.out.println("Product of Factors: " + productOfFactors(factors));
        System.out.println("Product of Cube of Factors: " + productOfCubeOfFactors(factors));

        scanner.close();
    }
}
