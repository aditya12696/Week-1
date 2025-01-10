class ConvertKilometersToMiles {
	// Convert the distance of 10.8 kilometers to miles
	public static void main(String[] args) {
		// Distance in kilometers
		float distanceInKm = 10.8f;

		// Convert Distance
		float distanceInMiles = distanceInKm * 1.6f;

		// Display Convert distance
		System.out.println("The distance " + distanceInKm + " km in miles is " + distanceInMiles);
	}
}