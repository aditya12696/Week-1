import java.util.Scanner;

public class HandshakeCalculator {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner inputScanner = new Scanner(System.in);

        // Take user input for the number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = inputScanner.nextInt();

        // Calculate the maximum number of handshakes using the formula (n * (n - 1)) / 2
        int maximumHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        // Display the number of possible handshakes
        System.out.println("The maximum number of handshakes among " + numberOfStudents + 
                           " students is: " + maximumHandshakes);

        // Close the Scanner object
        inputScanner.close();
    }
}