import java.util.Scanner;

public class StudentGradeCalculator {

    // Method to generate random 2-digit scores for Physics, Chemistry, and Maths
    public static int[][] generateScores(int numStudents) {
        int[][] scores = new int[numStudents][3];  // 2D array for PCM scores
        for (int i = 0; i < numStudents; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = 50 + (int) (Math.random() * 51);  // Random score between 50 and 100
            }
        }
        return scores;
    }

    // Method to calculate total, average, percentage for each student
    public static double[][] calculateResults(int[][] scores, int numStudents) {
        double[][] results = new double[numStudents][4];  // 2D array for total, average, percentage
        for (int i = 0; i < numStudents; i++) {
            int total = 0;
            for (int j = 0; j < 3; j++) {
                total += scores[i][j];  // Calculate total
            }
            double average = total / 3.0;  // Calculate average
            double percentage = (total / 3.0) / 100 * 100;  // Calculate percentage
            results[i][0] = total;
            results[i][1] = average;
            results[i][2] = percentage;
            results[i][3] = Math.round(percentage * 100.0) / 100.0;  // Round to 2 decimal places
        }
        return results;
    }

    // Method to calculate the grade based on percentage
    public static String[][] calculateGrade(double[][] results, int numStudents) {
        String[][] grades = new String[numStudents][1];  // 2D array for grades
        for (int i = 0; i < numStudents; i++) {
            double percentage = results[i][3];
            if (percentage >= 90) {
                grades[i][0] = "A+";
            } else if (percentage >= 80) {
                grades[i][0] = "A";
            } else if (percentage >= 70) {
                grades[i][0] = "B+";
            } else if (percentage >= 60) {
                grades[i][0] = "B";
            } else if (percentage >= 50) {
                grades[i][0] = "C";
            } else {
                grades[i][0] = "F";
            }
        }
        return grades;
    }

    // Method to display the scorecard of all students
    public static void displayScoreCard(int[][] scores, double[][] results, String[][] grades, int numStudents) {
        System.out.printf("%-15s %-10s %-10s %-10s %-10s %-10s\n", "Student", "Physics", "Chemistry", "Maths", "Percentage", "Grade");
        System.out.println("------------------------------------------------------------");
        for (int i = 0; i < numStudents; i++) {
            System.out.printf("%-15s %-10d %-10d %-10d %-10.2f %-10s\n", "Student " + (i + 1),
                    scores[i][0], scores[i][1], scores[i][2], results[i][3], grades[i][0]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of students
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        // Generate random scores for students
        int[][] scores = generateScores(numStudents);

        // Calculate total, average, and percentage
        double[][] results = calculateResults(scores, numStudents);

        // Calculate the grade based on the percentage
        String[][] grades = calculateGrade(results, numStudents);

        // Display the scorecard
        displayScoreCard(scores, results, grades, numStudents);

        scanner.close();
    }
}
