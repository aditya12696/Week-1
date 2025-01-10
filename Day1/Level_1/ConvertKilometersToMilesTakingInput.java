import java.util.*;
class ConvertKilometersToMilesTakingInput {
	// Convert the distance of 10.8 kilometers to miles
	public static void main(String[] args) {
		// Creating Object for Scanner class
		Scanner scanner = new Scanner(System.in);
		// Input distance in kilometers
		float distanceInKm = scanner.nextFloat();
		// Convert Distance in miles
		float distanceInMiles = distanceInKm * 1.6f;
		// Display Convert distance
		System.out.println("The total miles is " + distanceInKm + " mile for the given " + distanceInMiles +" km");
		// Scanner class closed
		scanner.close();
	}
}