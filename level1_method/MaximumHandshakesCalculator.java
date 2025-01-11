import java.util.Scanner;

public class MaximumHandshakesCalculator {

    // Method Name calculateMaximumHandshakes
    // To calculate the maximum number of handshakes using the formula: (n * (n - 1)) / 2
    public static int calculateMaximumHandshakes(int numberOfStudents) {
        return (numberOfStudents * (numberOfStudents - 1)) / 2;
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner inputScanner = new Scanner(System.in);

        // Take user input for the number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = inputScanner.nextInt();

        // Check for valid input
        if (numberOfStudents < 2) {
            System.out.println("At least 2 students are required to have a handshake.");
        } else {
            // Calculate the maximum number of handshakes
            int maximumHandshakes = calculateMaximumHandshakes(numberOfStudents);

            // Display the result
            System.out.println("The maximum number of handshakes among " + numberOfStudents + 
                               " students is: " + maximumHandshakes);
        }

        // Close the Scanner object
        inputScanner.close();
    }
}