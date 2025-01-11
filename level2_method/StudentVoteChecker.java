import java.util.Scanner;

public class StudentVoteChecker {

    // Method to check if the student can vote
    public static boolean canStudentVote(int age) {
        if (age < 0) {
            return false; // Invalid age
        }
        return age >= 18; // Return true if age is 18 or above
    }

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        int[] studentAges = new int[10];

        // Loop to take input for 10 students' ages
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            studentAges[i] = inputScanner.nextInt();
        }

        // Check and display whether each student can vote
        for (int i = 0; i < 10; i++) {
            boolean canVote = canStudentVote(studentAges[i]);
            if (canVote) {
                System.out.println("Student " + (i + 1) + " can vote.");
            } else {
                System.out.println("Student " + (i + 1) + " cannot vote.");
            }
        }

        inputScanner.close();
    }
}
