import java.util.*;
public class WeightConversion {
    //  Convert weight in pounds to kilograms.
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        // Input weight in pounds
        double weightInPounds = scanner.nextDouble();
        // Convert pounds to kilograms
        double weightInKilograms = weightInPounds / 2.2;
        // Output the result
        System.out.println("The weight of the person in pounds is " + weightInPounds + " and in kilograms is " + weightInKilograms);
        // Close the Scanner object
        scanner.close();
    }
}
