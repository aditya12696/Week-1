import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateArithmetic {

    public static void main(String[] args) {
        // Create a scanner to take user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a date (yyyy-MM-dd): ");

        // Read input date as a string
        String inputDate = scanner.nextLine();

        // Define a formatter for parsing and displaying dates
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        // Parse the input date
        LocalDate initialDate = LocalDate.parse(inputDate, dateFormatter);
        System.out.println("Initial Date: " + initialDate);

        // Add 7 days, 1 month, and 2 years to the date
        LocalDate modifiedDate = initialDate.plusDays(7).plusMonths(1).plusYears(2);
        System.out.println("Date after adding 7 days, 1 month, and 2 years: " + modifiedDate);

        // Subtract 3 weeks from the result
        LocalDate finalDate = modifiedDate.minusWeeks(3);
        System.out.println("Date after subtracting 3 weeks: " + finalDate);

        // Close the scanner
        scanner.close();
    }
}
