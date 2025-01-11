import java.util.Scanner;

public class YoungestAndTallest {

    // Method to find the youngest of the three friends
    public static String findYoungest(int[] ages, String[] names) {
        int minAge = ages[0];
        String youngest = names[0];
        
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < minAge) {
                minAge = ages[i];
                youngest = names[i];
            }
        }
        
        return youngest;
    }

    // Method to find the tallest of the three friends
    public static String findTallest(double[] heights, String[] names) {
        double maxHeight = heights[0];
        String tallest = names[0];
        
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > maxHeight) {
                maxHeight = heights[i];
                tallest = names[i];
            }
        }
        
        return tallest;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array of friend names
        String[] names = {"Amar", "Akbar", "Anthony"};
        
        // Arrays to store the ages and heights of the friends
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Taking user input for age and height of each friend
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = scanner.nextInt();
            System.out.print("Enter height of " + names[i] + " (in cm): ");
            heights[i] = scanner.nextDouble();
        }

        // Find and display the youngest and tallest friend
        String youngest = findYoungest(ages, names);
        String tallest = findTallest(heights, names);

        System.out.println("The youngest friend is: " + youngest);
        System.out.println("The tallest friend is: " + tallest);

        scanner.close();
    }
}
