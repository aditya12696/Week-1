import java.util.Scanner;
public class CalculateTotalPrice {
    // calculate the total price.
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        // Input unit price
        double unitPrice = scanner.nextDouble();
        // Input unit quantity
        int unitQuantity = scanner.nextInt();
        // Calculate total price
        double totalPrice = unitPrice * unitQuantity;
        // Display Calculate total price
        System.out.println("The total purchase price is INR " + totalPrice + " if the quantity is " + unitQuantity + " and unit price is INR " + unitPrice);
        // Scanner class closed
        scanner.close();
    }
}