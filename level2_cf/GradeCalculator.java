
import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input Marks for each subject
        System.out.print("Enter marks for Physics: ");
        int physicsMarks = scanner.nextInt();
        System.out.print("Enter marks for Chemistry: ");
        int chemistryMarks = scanner.nextInt();
        System.out.print("Enter marks for Mathematics: ");
        int mathMarks = scanner.nextInt();

        // Calculate the total marks and average percentage
        int totalMarks = physicsMarks + chemistryMarks + mathMarks;
        double averagePercentage = totalMarks / 3.0;

        char grade;
        String feedback;

        // Determine the grade and feedback based on the percentage
        if (averagePercentage >= 80) {
            grade = 'A';
            feedback = "Excellent performance.";
        } else if (averagePercentage >= 70) {
            grade = 'B';
            feedback = "Very good performance.";
        } else if (averagePercentage >= 60) {
            grade = 'C';
            feedback = "Good performance.";
        } else if (averagePercentage >= 50) {
            grade = 'D';
            feedback = "Needs improvement.";
        } else if (averagePercentage >= 40) {
            grade = 'E';
            feedback = "Poor performance. Requires significant improvement.";
        } else {
            grade = 'F';
            feedback = "Failed. Consider remedial measures.";
        }

        // Output Display the results
        System.out.println("\n--- Result Summary ---");
        System.out.println("Average Percentage: " +  averagePercentage);
        System.out.println("Grade: " + grade);
        System.out.println("Feedback: " + feedback);

        // Close the scanner object
        scanner.close();
    }
}

