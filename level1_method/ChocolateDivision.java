import java.util.Scanner;

public class ChocolateDivision {

    // To find how many chocolates each child gets and how many remain
    public static int[] findRemainderAndQuotient(int numberOfChocolates, int numberOfChildren) {
        int chocolatesPerChild = numberOfChocolates / numberOfChildren;
        int remainingChocolates = numberOfChocolates % numberOfChildren;
        return new int[]{chocolatesPerChild, remainingChocolates};
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner inputScanner = new Scanner(System.in);

        // Take user input for the number of chocolates and children
        System.out.print("Enter the number of chocolates: ");
        int numberOfChocolates = inputScanner.nextInt();

        System.out.print("Enter the number of children: ");
        int numberOfChildren = inputScanner.nextInt();

        // Find the chocolates per child and remaining chocolates
        int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);

        // Display the result
        System.out.println("Each child gets " + result[0] + " chocolates.");
        System.out.println("Remaining chocolates: " + result[1]);

        // Close the Scanner object
        inputScanner.close();
    }
}
