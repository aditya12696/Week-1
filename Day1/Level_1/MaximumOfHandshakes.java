import java.util.Scanner;
public class MaximumOfHandshakes {
    //  find the maximum number of handshakes among N number of students.
    public static void main(String[] args) {
        // Create a Scanner object to take input
        Scanner scanner = new Scanner(System.in);
        // Input number of students
        int numberOfStudents = scanner.nextInt();
        // Calculate maximum handshakes
        int maxHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;
        // Print calculate maximum handshakes
        System.out.println("The maximum number of handshakes among " + numberOfStudents + " students is " + maxHandshakes);
        // Scanner class closed
        scanner.close();
    }
}