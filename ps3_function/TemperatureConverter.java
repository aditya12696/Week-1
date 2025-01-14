import java.util.Scanner;

public class TemperatureConverter {

    // Function to convert Fahrenheit to Celsius
    private static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Function to convert Celsius to Fahrenheit
    private static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Function to take input from the user
    private static double takeInput(Scanner scanner, String prompt) {
        System.out.print(prompt);
        return scanner.nextDouble();
    }

    // Function to display the result
    private static void displayResult(String scale, double value, double convertedValue) {
        System.out.println(value + " degrees " + scale + " is equal to " + convertedValue + " degrees.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input from the user for the temperature value
        double tempValue = takeInput(scanner, "Enter the temperature value: ");
        
        // Take input for the scale (Fahrenheit or Celsius)
        System.out.print("Enter the scale (F for Fahrenheit, C for Celsius): ");
        char scale = scanner.next().charAt(0);

        // Convert and display the result based on the user's choice of scale
        if (scale == 'F' || scale == 'f') {
            double celsius = fahrenheitToCelsius(tempValue);
            displayResult("Fahrenheit", tempValue, celsius);
        } else if (scale == 'C' || scale == 'c') {
            double fahrenheit = celsiusToFahrenheit(tempValue);
            displayResult("Celsius", tempValue, fahrenheit);
        } else {
            System.out.println("Invalid scale entered. Please use 'F' for Fahrenheit or 'C' for Celsius.");
        }

        // Close the scanner
        scanner.close();
    }
}
