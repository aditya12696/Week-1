import java.util.Scanner;
public class FindSideOfSquare {
    // find the side of the square whose parameter you read from user
    public static void main(String[] args) {
        // Create a Scanner object to take input
        Scanner scanner = new Scanner(System.in);
        // Input perimeter
        double perimeterOfSquare = scanner.nextDouble();
        // Calculate the side of the square
        double sideOfSquare = perimeterOfSquare / 4;
        // Print Side
        System.out.println("The length of the side is " + sideOfSquare + " whose perimeter is " + perimeterOfSquare);
        // Scanner class closed
        scanner.close();
    }
}