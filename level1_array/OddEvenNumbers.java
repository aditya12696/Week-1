import java.util.Scanner;

public class OddEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		// Taking input from user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (number < 1) {
            System.out.println("Error: Not a natural number.");
            return;
        }
		
		// Arrays to store odd numbers
        int[] oddNumbers = new int[number / 2 + 1];
		
		// Arrays to store even numbers
        int[] evenNumbers = new int[number / 2 + 1];
		// index for even and odd
        int oddIndex = 0, evenIndex = 0;

        // Storing odd and even numbers
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                evenNumbers[evenIndex++] = i;
            } else {
                oddNumbers[oddIndex++] = i;
            }
        }

        // Displaying odd and even numbers
        System.out.println("Odd Numbers: ");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddNumbers[i] + " ");
        }
        System.out.println("\nEven Numbers: ");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenNumbers[i] + " ");
        }

        sc.close();
    }
}
