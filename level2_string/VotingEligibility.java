import java.util.Scanner;

public class VotingEligibility {

    // Method to generate random ages for n students
    public static int[] generateAges(int n) {
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            ages[i] = 18 + (int)(Math.random() * 83);  // Random age between 18 and 100
        }
        return ages;
    }

    // Method to check voting eligibility based on age
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            if (ages[i] < 0) {
                result[i][0] = String.valueOf(ages[i]);
                result[i][1] = "Invalid age";
            } else if (ages[i] >= 18) {
                result[i][0] = String.valueOf(ages[i]);
                result[i][1] = "Can vote";
            } else {
                result[i][0] = String.valueOf(ages[i]);
                result[i][1] = "Cannot vote";
            }
        }
        return result;
    }

    // Method to display the results in a tabular format
    public static void displayResults(String[][] result) {
        System.out.printf("%-10s %-15s\n", "Age", "Voting Eligibility");
        System.out.println("-----------------------------");
        for (String[] row : result) {
            System.out.printf("%-10s %-15s\n", row[0], row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the number of students (in this case, 10 students)
        System.out.print("Enter the number of students: ");
        int numberOfStudents = 10;  // Fixed to 10 students

        // Generate random ages for the students
        int[] ages = generateAges(numberOfStudents);

        // Check the voting eligibility
        String[][] eligibilityResult = checkVotingEligibility(ages);

        // Display the results in a tabular format
        displayResults(eligibilityResult);

        scanner.close();
    }
}
