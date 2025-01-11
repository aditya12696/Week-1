import java.util.Scanner;

public class LeapYearChecker {

    // Method to check if the year is a leap year
    public static boolean isLeapYear(int year) {
        if (year < 1582) {
            System.out.println("Year must be 1582 or greater.");
            return false;
        }
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner inputScanner = new Scanner(System.in);

        // Take user input for the year
        System.out.print("Enter a year: ");
        int year = inputScanner.nextInt();

        // Check if the year is a leap year
        if (isLeapYear(year)) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is not a Leap Year.");
        }

        // Close the Scanner object
        inputScanner.close();
    }
}
