import java.util.Scanner;

public class EuclideanDistance {

    // Method to calculate the Euclidean distance between two points
    public static double calculateDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    // Method to find the equation of a line given two points
    public static double[] findLineEquation(double x1, double y1, double x2, double y2) {
        double slope, yIntercept;

        // Check for vertical line (undefined slope)
        if (x1 == x2) {
            throw new IllegalArgumentException("The points form a vertical line. The slope is undefined.");
        }

        slope = (y2 - y1) / (x2 - x1); // Calculate slope
        yIntercept = y1 - slope * x1; // Calculate y-intercept

        return new double[]{slope, yIntercept}; // Return slope and y-intercept
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for the first point
        System.out.print("Enter x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = scanner.nextDouble();

        // Input for the second point
        System.out.print("Enter x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = scanner.nextDouble();

        // Calculate the Euclidean distance
        double distance = calculateDistance(x1, y1, x2, y2);
        System.out.printf("The Euclidean distance between the points is: %.2f%n", distance);

        // Calculate the equation of the line
        try {
            double[] lineEquation = findLineEquation(x1, y1, x2, y2);
            System.out.printf("The equation of the line is: y = %.2fx + %.2f%n", lineEquation[0], lineEquation[1]);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}
