public class ExtendedUnitConverter2 {

    // Method to convert Fahrenheit to Celsius
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Method to convert Celsius to Fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Method to convert pounds to kilograms
    public static double convertPoundsToKilograms(double pounds) {
        double pounds2kilograms = 0.453592;
        return pounds * pounds2kilograms;
    }

    // Method to convert kilograms to pounds
    public static double convertKilogramsToPounds(double kilograms) {
        double kilograms2pounds = 2.20462;
        return kilograms * kilograms2pounds;
    }

    // Method to convert gallons to liters
    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541;
        return gallons * gallons2liters;
    }

    // Method to convert liters to gallons
    public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172;
        return liters * liters2gallons;
    }

    public static void main(String[] args) {
        System.out.println("32°F is " + convertFahrenheitToCelsius(32) + "°C.");
        System.out.println("0°C is " + convertCelsiusToFahrenheit(0) + "°F.");
        System.out.println("150 pounds is " + convertPoundsToKilograms(150) + " kg.");
        System.out.println("70 kg is " + convertKilogramsToPounds(70) + " lbs.");
        System.out.println("10 gallons is " + convertGallonsToLiters(10) + " liters.");
        System.out.println("25 liters is " + convertLitersToGallons(25) + " gallons.");
    }
}
