import java.util.Scanner;

public class ChocolateDivision {
	// Divide N number of chocolates among M children.
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        // Enter the number of chocolates 
        int numberOfChocolates = scanner.nextInt();
		// Enter the number of children
        int numberOfChildren = scanner.nextInt();
        // Calculate the number of chocolates each child gets 
        int chocolatesPerChild = numberOfChocolates / numberOfChildren;
		//	Calculate the number of remaining chocolates
        int remainingChocolates = numberOfChocolates % numberOfChildren;
        // Output the results
        System.out.println("The number of chocolates each child gets is " + chocolatesPerChild + " and the number of remaining chocolates are " + remainingChocolates);
        // Close the Scanner object
        scanner.close();
    }
}