import java.util.Scanner;

public class BMI_Calculator {

    // Method to calculate BMI and status based on height and weight
    public static String[][] calculateBMI(double[][] weightHeight) {
        String[][] result = new String[weightHeight.length][4];  // 4 columns: weight, height, BMI, status

        for (int i = 0; i < weightHeight.length; i++) {
            double weight = weightHeight[i][0];  // Weight in kg
            double heightInCm = weightHeight[i][1];  // Height in cm
            double heightInMeters = heightInCm / 100;  // Convert height to meters

            // Calculate BMI
            double bmi = weight / (heightInMeters * heightInMeters);
            String status = getStatus(bmi);

            // Store weight, height, BMI, and status in the result array
            result[i][0] = String.valueOf(weight);
            result[i][1] = String.valueOf(heightInCm);
            result[i][2] = String.format("%.2f", bmi);  // Round to 2 decimal places
            result[i][3] = status;
        }

        return result;
    }

    // Method to return BMI status based on BMI value
    public static String getStatus(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            return "Normal weight";
        } else if (bmi >= 25 && bmi < 29.9) {
            return "Overweight";
        } else {
            return "Obesity";
        }
    }

    // Method to display the 2D array of BMI, weight, height, and status
    public static void displayBMIResult(String[][] result) {
        System.out.println("Weight (kg) | Height (cm) | BMI   | Status");
        System.out.println("----------------------------------------------");
        for (int i = 0; i < result.length; i++) {
            System.out.printf("%10s | %11s | %5s | %s\n", result[i][0], result[i][1], result[i][2], result[i][3]);
        }
    }

    // Main function
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declare 2D array for 10 members (weight and height)
        double[][] weightHeight = new double[10][2];

        // Input weight and height for each person
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            weightHeight[i][0] = scanner.nextDouble();

            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            weightHeight[i][1] = scanner.nextDouble();
        }

        // Call the method to calculate BMI and status
        String[][] bmiResult = calculateBMI(weightHeight);

        // Display the BMI result in tabular format
        displayBMIResult(bmiResult);

        scanner.close();
    }
}
