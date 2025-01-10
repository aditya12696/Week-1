import java.util.Scanner;

class LargestSecondLargestMaxDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input for a number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Validate the number input
        while (number <= 0) {
            System.out.print("Please enter a positive number: ");
            number = input.nextInt();
        }

        // Define array and variables
        int maxDigit = 10; // Initial max size for the array
        int[] digits = new int[maxDigit];
        int index = 0;

        // Extract digits and store them in the array
        while (number != 0) {
            // If index equals maxDigit, increase the size of the array by 10
            if (index == maxDigit) {
                maxDigit += 10;
                // Create a new array with the updated size
                int[] temp = new int[maxDigit];
                // Copy the elements from the old array to the new array
                System.arraycopy(digits, 0, temp, 0, digits.length);
                digits = temp; // Assign the new array to digits
            }
            digits[index++] = number % 10;
            number /= 10;
        }

        // Initialize largest and second largest
        int largest = -1, secondLargest = -1;

        // Find largest and second largest digits
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] < largest) {
                secondLargest = digits[i];
            }
        }

        // Display the largest and second largest digits
        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);

        // Close the scanner
        input.close();
    }
}