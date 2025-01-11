import java.util.Random;

public class StudentScores {

    // Generate random scores for students in Physics, Chemistry, and Math
    public static int[][] generateStudentScores(int numberOfStudents) {
        Random random = new Random();
        int[][] scores = new int[numberOfStudents][3];
        for (int student = 0; student < numberOfStudents; student++) {
            scores[student][0] = random.nextInt(41) + 60; // Physics: 60 to 100
            scores[student][1] = random.nextInt(41) + 60; // Chemistry: 60 to 100
            scores[student][2] = random.nextInt(41) + 60; // Math: 60 to 100
        }
        return scores;
    }

    // Calculate total, average, and percentage for each student
    public static double[][] computeStudentResults(int[][] scores) {
        int numberOfStudents = scores.length;
        double[][] results = new double[numberOfStudents][3]; // [Total, Average, Percentage]
        for (int student = 0; student < numberOfStudents; student++) {
            int total = scores[student][0] + scores[student][1] + scores[student][2];
            double average = Math.round((double) total / 3 * 100.0) / 100.0;
            double percentage = Math.round((total / 300.0) * 100 * 100.0) / 100.0; // For 3 subjects
            results[student][0] = total;
            results[student][1] = average;
            results[student][2] = percentage;
        }
        return results;
    }

    // Display the scorecard of students
    public static void printScorecard(int[][] scores, double[][] results) {
        System.out.println("Roll\tPhysics\tChemistry\tMath\tTotal\tAverage\tPercentage");
        for (int student = 0; student < scores.length; student++) {
            System.out.printf("%d\t%d\t%d\t\t%d\t%.0f\t%.2f\t%.2f%%\n",
                    student + 1, scores[student][0], scores[student][1], scores[student][2],
                    results[student][0], results[student][1], results[student][2]);
        }
    }

    public static void main(String[] args) {
        int numberOfStudents = 5; // Number of students
        int[][] studentScores = generateStudentScores(numberOfStudents); // Generate scores
        double[][] studentResults = computeStudentResults(studentScores); // Calculate results
        printScorecard(studentScores, studentResults); // Display the scorecard
    }
}
