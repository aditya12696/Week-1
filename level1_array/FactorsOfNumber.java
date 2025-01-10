import java.util.Scanner;

public class FactorsOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		// Taking input from user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
		
		// // Arrays size 
        int maxFactor = 10;
		
		// Arrays to store factors
        int[] factors = new int[maxFactor];
		
        int index = 0;

        // Finding factors and storing them
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                if (index == maxFactor) {
                    maxFactor *= 2;
                    int[] temp = new int[maxFactor];
                    System.arraycopy(factors, 0, temp, 0, factors.length);
                    factors = temp;
                }
                factors[index++] = i;
            }
        }

        // Displaying the factors
        System.out.println("Factors of " + number + ":");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }

        sc.close();
    }
}
