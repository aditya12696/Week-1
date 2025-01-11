import java.util.Scanner;

public class TriangularParkRunCalculator {

    // To calculate the number of rounds required to complete a 5 km run
    public static int calculateNumberOfRounds(double sideA, double sideB, double sideC) {
        // Calculate the perimeter of the triangular park
        double perimeter = sideA + sideB + sideC;

        // Convert the total distance to meters (5 km = 5000 meters)
        double totalDistance = 5000.0;

        // Calculate and return the number of rounds (rounded up)
        return (int) Math.ceil(totalDistance / perimeter);
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner inputScanner = new Scanner(System.in);

        // Take user input for the three sides of the triangular park
        System.out.print("Enter the length of side A (in meters): ");
        double sideA = inputScanner.nextDouble();

        System.out.print("Enter the length of side B (in meters): ");
        double sideB = inputScanner.nextDouble();

        System.out.print("Enter the length of side C (in meters): ");
        double sideC = inputScanner.nextDouble();

        // Calculate the number of rounds required
        int numberOfRounds = calculateNumberOfRounds(sideA, sideB, sideC);

        // Display the result
        System.out.println("The athlete needs to complete " + numberOfRounds + 
                           " rounds to complete a 5 km run.");

        // Close the Scanner object
        inputScanner.close();
    }
}
