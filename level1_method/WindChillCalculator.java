import java.util.Scanner;

public class WindChillCalculator {

    // To calculate the wind chill temperature using the formula
    public double calculateWindChill(double temperature, double windSpeed) {
        return 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner inputScanner = new Scanner(System.in);

        // Create an instance of WindChillCalculator
        WindChillCalculator calculator = new WindChillCalculator();

        // Takeing user input for temperature and wind speed
        System.out.print("Enter the temperature (in Fahrenheit): ");
        double temperature = inputScanner.nextDouble();

        System.out.print("Enter the wind speed (in miles per hour): ");
        double windSpeed = inputScanner.nextDouble();

        // Calculate the wind chill temperature
        double windChill = calculator.calculateWindChill(temperature, windSpeed);

        // Display the result
        System.out.println("The wind chill temperature is: " + windChill);

        // Close the Scanner object
        inputScanner.close();
    }
}
