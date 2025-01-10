
import java.util.Scanner;

class GeneratingTableUserInput{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking as input
        System.out.print("Enter number to generate multiplication table ");
        int number = sc.nextInt();

        // Generating multiplication table of given numbers
 
        for (int currentNumber = 1; currentNumber <= 10; currentNumber++) {
            System.out.println(number + " x " + currentNumber + " = " + (number * currentNumber));
        }
		// Closing Scanner class
        sc.close();
    }
}


