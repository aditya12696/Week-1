import java.util.Random;

public class FootballTeamHeights {

    // Method to calculate the sum of all heights
    public static int findSum(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }

    // Method to calculate the mean height of the players
    public static double findMean(int[] heights) {
        int sum = findSum(heights);
        return (double) sum / heights.length;
    }

    // Method to find the shortest height of the players
    public static int findShortest(int[] heights) {
        int shortest = heights[0];
        for (int height : heights) {
            if (height < shortest) {
                shortest = height;
            }
        }
        return shortest;
    }

    // Method to find the tallest height of the players
    public static int findTallest(int[] heights) {
        int tallest = heights[0];
        for (int height : heights) {
            if (height > tallest) {
                tallest = height;
            }
        }
        return tallest;
    }

    public static void main(String[] args) {
        Random random = new Random();
        int[] heights = new int[11];  // Array to store heights of 11 players

        // Generate random heights between 150 cm and 250 cm for each player
        for (int i = 0; i < heights.length; i++) {
            heights[i] = 150 + random.nextInt(101);  // Random height between 150 and 250
        }

        // Find the sum, mean, shortest, and tallest height
        int sum = findSum(heights);
        double mean = findMean(heights);
        int shortest = findShortest(heights);
        int tallest = findTallest(heights);

        // Display the results
        System.out.println("Heights of the players (in cm):");
        for (int height : heights) {
            System.out.print(height + " ");
        }
        System.out.println();

        System.out.println("Sum of heights: " + sum + " cm");
        System.out.println("Mean height: " + mean + " cm");
        System.out.println("Shortest height: " + shortest + " cm");
        System.out.println("Tallest height: " + tallest + " cm");
    }
}