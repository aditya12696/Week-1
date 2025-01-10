import java.util.Scanner;
public class CelsiusConversionFahrenheit {
	// Temperature Conversion program, given the temperature in Celsius as input outputs the temperature in Fahrenheit
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        // Enter input temperature in Celsius
        double celsiusTemperature = scanner.nextDouble();
        // Convert Celsius to Fahrenheit using the formula
        double fahrenheitTemperature = (celsiusTemperature * 9 / 5) + 32;
        // Output the result
        System.out.println("The " + celsiusTemperature + " Celsius is " + fahrenheitTemperature + " Fahrenheit.");
        // Close the Scanner object
        scanner.close();
    }
}