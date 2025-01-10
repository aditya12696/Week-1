import java.util.Scanner;
public class CalculateTotalIncome {
    // find the total income of a person by taking salary and bonus from user
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        // Input salary
        double salary = scanner.nextDouble();
        // Input bonus
        double bonus = scanner.nextDouble();
        // Calculate total income
        double totalIncome = salary + bonus;
        // Output the result
        System.out.println("The salary is INR " + salary + " and bonus is INR " + bonus + ". Hence Total Income is INR " + totalIncome);
        // Close the Scanner object
        scanner.close();
    }
}
