import java.util.Scanner;

class BodyMassIndex {
    public static void main(String[] args) {
        // Define a scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Ask for the number of individuals
        System.out.print("Enter the number of individuals: ");
        int totalIndividuals = scanner.nextInt();

        // Arrays to store weight, height, BMI, and weight classification
        double[] individualWeight = new double[totalIndividuals];
        double[] individualHeight = new double[totalIndividuals];
        double[] individualBmi = new double[totalIndividuals];
        String[] bmiStatus = new String[totalIndividuals];

        // Loop to collect weight and height data for each individual
        for (int i = 0; i < totalIndividuals; i++) {
            System.out.print("Enter the weight (in kg) for individual " + (i + 1) + ": ");
            individualWeight[i] = scanner.nextDouble();

            System.out.print("Enter the height (in meters) for individual " + (i + 1) + ": ");
            individualHeight[i] = scanner.nextDouble();

            // Calculate BMI for each individual
            individualBmi[i] = individualWeight[i] / (individualHeight[i] * individualHeight[i]);

            // Classify BMI status
            if (individualBmi[i] < 18.5) {
                bmiStatus[i] = "Underweight";
            } else if (individualBmi[i] >= 18.5 && individualBmi[i] < 24.9) {
                bmiStatus[i] = "Normal weight";
            } else if (individualBmi[i] >= 25 && individualBmi[i] < 39.9) {
                bmiStatus[i] = "Overweight";
            } else {
                bmiStatus[i] = "Obese";
            }
        }

        // Display the results for each individual
        System.out.println("\nIndividual Details:");
        System.out.println("---------------------------------------------------");
        for (int i = 0; i < totalIndividuals; i++) {
            System.out.println("Individual " + (i + 1) + ":");
            System.out.println("Weight: " + individualWeight[i] + " kg");
            System.out.println("Height: " + individualHeight[i] + " m");
            System.out.println("BMI: " + individualBmi[i]);
            System.out.println("BMI Status: " + bmiStatus[i]);
            System.out.println("---------------------------------------------------");
        }

        // Close the scanner
        scanner.close();
    }
}