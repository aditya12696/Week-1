import java.util.Scanner;

public class TrigonometricFunctionsCalculator {

    // To calculate the sine, cosine, and tangent of the given angle in degrees
    public double[] calculateTrigonometricFunctions(double angleInDegrees) {
        double angleInRadians = Math.toRadians(angleInDegrees);
        double[] results = new double[3];
        results[0] = Math.sin(angleInRadians);  // Sine
        results[1] = Math.cos(angleInRadians);  // Cosine
        results[2] = Math.tan(angleInRadians);  // Tangent
        return results;
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner inputScanner = new Scanner(System.in);

        // Create an instance of TrigonometricFunctionsCalculator
        TrigonometricFunctionsCalculator calculator = new TrigonometricFunctionsCalculator();

        // Take user input for the angle in degrees
        System.out.print("Enter the angle in degrees: ");
        double angleInDegrees = inputScanner.nextDouble();

        // Calculate the trigonometric functions
        double[] trigResults = calculator.calculateTrigonometricFunctions(angleInDegrees);

        // Display the results
        System.out.println("Sine: " + trigResults[0]);
        System.out.println("Cosine: " + trigResults[1]);
        System.out.println("Tangent: " + trigResults[2]);

        // Close the Scanner object
        inputScanner.close();
    }
}
