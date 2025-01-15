import java.util.Scanner;

public class BMICalculator {

    // Method to calculate BMI and return status
    public static String[][] calculateBMI(double[][] data, int numPeople) {
        String[][] result = new String[numPeople][4];  // 2D array for weight, height, BMI, and status
        for (int i = 0; i < numPeople; i++) {
            double weight = data[i][0];
            double heightInMeters = data[i][1] / 100;  // Convert height from cm to meters
            double bmi = weight / (heightInMeters * heightInMeters);  // BMI formula
            String status = determineStatus(bmi);  // Determine BMI status based on the calculated BMI
            result[i][0] = String.valueOf(weight);  // Weight in kg
            result[i][1] = String.valueOf(data[i][1]);  // Height in cm
            result[i][2] = String.format("%.2f", bmi);  // BMI value rounded to 2 decimal places
            result[i][3] = status;  // BMI status
        }
        return result;
    }

    // Method to determine BMI status
    public static String determineStatus(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            return "Normal weight";
        } else if (bmi >= 25 && bmi < 29.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    // Method to display the BMI report in a tabular format
    public static void displayBMIReport(String[][] result, int numPeople) {
        System.out.println("Person | Height (cm) | Weight (kg) | BMI    | Status");
        System.out.println("-----------------------------------------------------------");
        for (int i = 0; i < numPeople; i++) {
            System.out.println("Person " + (i + 1) + " | " 
                + result[i][1] + "        | " 
                + result[i][0] + "         | " 
                + result[i][2] + " | " 
                + result[i][3]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Number of people in the team
        int numPeople = 10;
        double[][] data = new double[numPeople][2];  // 2D array for weight and height

        // Take user input for weight and height
        for (int i = 0; i < numPeople; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            data[i][0] = scanner.nextDouble();  // Weight in kg
            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            data[i][1] = scanner.nextDouble();  // Height in cm
        }

        // Calculate BMI and status for each person
        String[][] bmiResults = calculateBMI(data, numPeople);

        // Display the BMI results
        displayBMIReport(bmiResults, numPeople);

        scanner.close();
    }
}
