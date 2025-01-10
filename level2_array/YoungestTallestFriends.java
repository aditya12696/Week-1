import java.util.Scanner;

class YoungestTallestFriends {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Declare arrays to store ages and heights of 3 friends
        int[] ages = new int[3];
        double[] heights = new double[3];
        
        // Declare variables for the youngest and tallest friend
        int youngestIndex = 0;
        int tallestIndex = 0;

        // Input age and height for 3 friends
        System.out.println("Enter the details for 3 friends:");

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of friend " + (i + 1) + ": ");
            ages[i] = input.nextInt();
            
            // Validate age input
            while (ages[i] <= 0) {
                System.out.print("Invalid age. Please enter a positive age for friend " + (i + 1) + ": ");
                ages[i] = input.nextInt();
            }

            System.out.print("Enter height of friend " + (i + 1) + " in meters: ");
            heights[i] = input.nextDouble();
            
            // Validate height input
            while (heights[i] <= 0) {
                System.out.print("Invalid height. Please enter a positive height for friend " + (i + 1) + ": ");
                heights[i] = input.nextDouble();
            }
        }

        // Find the youngest friend
        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
        }

        // Find the tallest friend
        for (int i = 1; i < 3; i++) {
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }

        // Display the youngest and tallest friends
        System.out.println("\nThe youngest friend is:");
        System.out.println("Name: " + (youngestIndex == 0 ? "Amar" : (youngestIndex == 1 ? "Akbar" : "Anthony")));
        System.out.println("Age: " + ages[youngestIndex]);
        System.out.println("Height: " + heights[youngestIndex]);

        System.out.println("\nThe tallest friend is:");
        System.out.println("Name: " + (tallestIndex == 0 ? "Amar" : (tallestIndex == 1 ? "Akbar" : "Anthony")));
        System.out.println("Age: " + ages[tallestIndex]);
        System.out.println("Height: " + heights[tallestIndex]);

        // Close the scanner
        input.close();
    }
}