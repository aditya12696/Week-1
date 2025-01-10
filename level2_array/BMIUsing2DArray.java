import java.util.Scanner;

class BMIUsing2DArray {
    public static void main(String[] args) {
        // Define a scanner to take input
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter the number of persons: ");
        int numPersons = sc.nextInt();

        // 2D array to store weight, height, and BMI for each person
        double[][] personData = new double[numPersons][3];
        // Array to store the weight status of each person
        String[] weightStatus = new String[numPersons];

        // Loop to take input for weight and height of each person
        for (int i = 0; i < numPersons; i++) {
            // Get weight for person
            do {
                System.out.print("Enter the weight (in kg) of person " + (i + 1) + ": ");
                personData[i][0] = sc.nextDouble();
                if (personData[i][0] <= 0) {
                    System.out.println("Please enter a positive value for weight.");
                }
            } while (personData[i][0] <= 0);

            // Get height for person
            do {
                System.out.print("Enter the height (in meters) of person " + (i + 1) + ": ");
                personData[i][1] = sc.nextDouble();
                if (personData[i][1] <= 0) {
                    System.out.println("Please enter a positive value for height.");
                }
            } while (personData[i][1] <= 0);

            // Calculate BMI and store in the 2D array
            personData[i][2] = personData[i][0] / (personData[i][1] * personData[i][1]);

            // Determine the weight 
            if (personData[i][2] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] >= 18.5 && personData[i][2] < 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (personData[i][2] >= 25 && personData[i][2] < 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Display the height, weight, BMI, and weight status of each person
        for (int i = 0; i < numPersons; i++) {
            System.out.println("Person " + (i + 1) + ":");
            System.out.println("Weight: " + personData[i][0] + " kg");
            System.out.println("Height: " + personData[i][1] + " m");
            System.out.println("BMI: " + personData[i][2]);
            System.out.println("Weight Status: " + weightStatus[i]);
        }
		// Close the scanner
        sc.close();
	}
}