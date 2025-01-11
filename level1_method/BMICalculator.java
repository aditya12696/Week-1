import java.util.Scanner;

public class BMICalculator {

    // Method to calculate BMI
    public static double calculateBMI(double weight, double height) {
        height = height / 100; // Convert height from cm to meters
        return weight / (height * height); // BMI formula
    }

    // Method to determine BMI status
    public static String determineBMIStatus(double bmi) {
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

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        double[][] personData = new double[10][3]; // 2D array for weight, height, and BMI

        // Input weight and height for 10 persons
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            personData[i][0] = inputScanner.nextDouble();
            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            personData[i][1] = inputScanner.nextDouble();

            // Calculate BMI and store it in the array
            personData[i][2] = calculateBMI(personData[i][0], personData[i][1]);
        }

        // Display BMI and status for each person
        for (int i = 0; i < 10; i++) {
            String status = determineBMIStatus(personData[i][2]);
            System.out.println("Person " + (i + 1) + " - Weight: " + personData[i][0] + " kg, Height: " + personData[i][1] + " cm, BMI: " + personData[i][2] + ", Status: " + status);
        }

        inputScanner.close();
    }
}
