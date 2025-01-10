import java.util.Scanner;

public class TemperatureConversion {
    /* Write a TemperaturConversion program, given the temperature in Celsius as input outputs the temperature in Fahrenheit.*/
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        // Prompt the user to enter temperature in Fahrenheit
        double fahrenheitTemperature = scanner.nextDouble();
        // Convert Fahrenheit to Celsius using the formula
        double celsiusResult = (fahrenheitTemperature - 32) * 5 / 9;
        // Output the result
        System.out.println("Temperature in Celsius: " + celsiusResult);
        // Close the Scanner class
        scanner.close();
    }
}
