import java.util.Scanner;

class DigitFrequency {
    public static void main(String[] args) {
        
        // Creating object of scanner class
        Scanner input = new Scanner(System.in);
        
        // Taking user input
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
        // Finding the count of digits in no.
        int tempNumber = number;
        int count = 0;
        while (tempNumber != 0) {
            tempNumber /= 10;
            count++;
        }
        
        // array to store the digits of the number
        int[] digits = new int[count];
        tempNumber = number;
        
        // Storing digits in the array
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = tempNumber % 10;
            tempNumber /= 10;
        }
        
        // Creating a frequency array to count the frequency of each digit
        int[] frequency = new int[10];  // Array of size 10 for digits 0 to 9
        
        // Loop through the digits array and count the frequency of each digit
        for (int i = 0; i < count; i++) {
            frequency[digits[i]]++;
        }
        
        // Display the frequency of each digit
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + ": " + frequency[i] + " times");
            }
        }
        
        // Closing scanner class
        input.close();
    }
}