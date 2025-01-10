
import java.util.Scanner;

public class LeapYearLogical {
    public static void main(String[] args) {
        // Create Scanner object to read input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a year
        System.out.print("Enter a year (>= 1582): ");
        int year = sc.nextInt();

        // Ensure the year is in the Gregorian calendar
        if (year >= 1582) {
            // Check leap year using logical operators
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println("The year " + year + " is a Leap Year.");
            } else {
                System.out.println("The year " + year + " is not a Leap Year.");
            }
        } else {
            System.out.println("The year " + year + " is not valid as it's before 1582.");
        }

        // Close the Scanner object
        sc.close();
    }
}