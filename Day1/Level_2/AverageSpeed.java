import java.util.*;
public class AverageSpeed {
    // find total distance and average speed
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Enter your name
        String name = scanner.nextLine();
        // Enter the starting city
        String fromCity = scanner.nextLine();
        // Enter the via city:
        String throughCity = scanner.nextLine();
        // Enter the destination city:
        String toCity = scanner.nextLine();
        /* Input distances
           Enter the distance from the starting city to through city in miles */
        double fromToThroughDistance = scanner.nextDouble();
        // Enter the distance from via city to the final destination in miles
        double throughToFinalCityDistance = scanner.nextDouble();
        /* Input time taken
           Enter the total time taken (in hours): "); */
        double timeTaken = scanner.nextDouble();
        // Compute total distance
        double totalDistance = fromToThroughDistance + throughToFinalCityDistance;
        // Calculate average speed
        double averageSpeed = totalDistance / timeTaken;
        // Output the result
        System.out.println("Traveled from " + fromCity + " to " + toCity + " through " + throughCity + ". The total distance is " + totalDistance + " miles and average speed was " + averageSpeed);
        // Close the Scanner object
        scanner.close();
    }
}
