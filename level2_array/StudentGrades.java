import java.util.Scanner;

class StudentGrades {
    public static void main(String[] args) {
        // Define a scanner to take input
        Scanner sc = new Scanner(System.in);

        // Taking user input 
        System.out.print("Enter the number of students: ");
        int numStudents = sc.nextInt();

        // Arrays store marks, percentages, and grades of students
        double[][] marks = new double[numStudents][3]; // [numStudents][3 subjects]
        double[] percentages = new double[numStudents];
        String[] grades = new String[numStudents];

        // take input for marks of each student
        for (int i = 0; i < numStudents; i++) {
            for (int j = 0; j < 3; j++) {
                // Ask for marks in each subject (Physics, Chemistry, Maths)
                String subject = "";
                if (j == 0) subject = "Physics";
                else if (j == 1) subject = "Chemistry";
                else if (j == 2) subject = "Maths";
                
                do {
                    System.out.print("Enter marks in " + subject + " for student " + (i + 1) + ": ");
                    marks[i][j] = sc.nextDouble();
                    if (marks[i][j] < 0) {
                        System.out.println("Marks cannot be negative. Please enter valid marks.");
                    }
                } while (marks[i][j] < 0);
            }

            // Calculate percentage for the student
            double totalMarks = marks[i][0] + marks[i][1] + marks[i][2];
            percentages[i] = (totalMarks / 300) * 100;

            // Assign grade based on percentage
            if (percentages[i] >= 80  ) 
                grades[i] = "A";
            else if (percentages[i] >= 70 &&  percentages[i] < 80)
                grades[i] = "B";
            else if (percentages[i] >= 60 &&  percentages[i] < 70 ) 
                grades[i] = "C";
            else if (percentages[i] >= 50 &&  percentages[i] < 60)
                grades[i] = "D";
            else if (percentages[i] >= 40 &&  percentages[i] < 50)
                grades[i] = "D";

            else 
                grades[i] = "R";
        }
    

        // Display marks, percentages, and grades of each student
        System.out.println("Student Results:");
        
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Student " + (i + 1) + ":");
            System.out.println("Marks in Physics: " + marks[i][0]);
            System.out.println("Marks in Chemistry: " + marks[i][1]);
            System.out.println("Marks in Maths: " + marks[i][2]);
            System.out.println("Percentage: " + percentages[i]);
            System.out.println("Grade: " + grades[i]);
            
        }
        // Closing scanner class
        sc.close();
       
    }
}