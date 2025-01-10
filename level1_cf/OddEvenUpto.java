
import java.util.Scanner;

public class OddEvenUpto{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a number ");
        int upperLimit = sc.nextInt();

        // Check if input is natural number
        if (upperLimit <= 0) {
            System.out.println("Please enter natural number");
        } else {
            // Iterate from 1 to number and check odd/even
            for (int currentNumber = 1; currentNumber <= upperLimit; currentNumber++) {
				// check even
                if (currentNumber % 2 == 0) {
                    System.out.println(currentNumber + " is an even number");
                }
	          //check odd 
		    else {
                    System.out.println(currentNumber + " is an odd number");
                }
            }
        }
	  // close Scanner class
        sc.close();
    }
}
