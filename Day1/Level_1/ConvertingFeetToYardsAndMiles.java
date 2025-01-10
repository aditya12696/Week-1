import java.util.Scanner;
class ConvertingFeetToYardsAndMiles {
    // distance in yards and miles for the distance provided by user in feets
    public static void main(String[] args) {
        // Create a Scanner object to take input 
        Scanner scanner = new Scanner(System.in);
        // Taking distance in feet
        double distanceInFeet = scanner.nextDouble();
        // Conversion factors 1 yard = 3 feet
        double feetToYards = 1.0 / 3.0;
        // Conversion factors 1 mile = 1760 yards
        double yardsToMile = 1.0 / 1760.0;
        // Convert the distance in yards
        double distanceInYards = distanceInFeet * feetToYards;
        // Convert the distance in miles
        double distanceInMiles = distanceInYards * yardsToMile;
        // Display the results
        System.out.println("The distance in yards is " + distanceInYards + " and in miles is " + distanceInMiles);
        // Scanner class closed
        scanner.close();
    }
}