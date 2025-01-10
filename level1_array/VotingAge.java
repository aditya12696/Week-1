import java.util.Scanner;

public class VotingAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		// Arrays to store ages
        int[] ages = new int[10];
        
        // Taking input for the ages of students
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
        }

        // Checking voting eligibility based on age
        for (int i = 0; i < ages.length; i++) {
            if (ages[i] < 0) {
                System.out.println("Invalid age entered for student " + (i + 1));
            } else if (ages[i] >= 18) {
                System.out.println("The student with the age " + ages[i] + " can vote.");
            } else {
                System.out.println("The student with the age " + ages[i] + " cannot vote.");
            }
        }

        sc.close();
    }
}
