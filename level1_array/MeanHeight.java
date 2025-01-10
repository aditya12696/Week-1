import java.util.Scanner;

public class MeanHeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		// Arrays to store heights
        double[] heights = new double[11];
        double sum = 0;

        // Taking input for heights of players
        for (int i = 0; i < 11; i++) {
            System.out.print("Enter the height of player " + (i + 1) + ": ");
            heights[i] = sc.nextDouble();
            sum += heights[i];
        }

        // Calculating and displaying mean height
        double mean = sum / 11;
        System.out.println("Mean height of the football team: " + mean);

        sc.close();
    }
}
