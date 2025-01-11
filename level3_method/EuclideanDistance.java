import java.util.Scanner;

class EuclideanDistance {

    // Calculate Euclidean distance between two points
    public static double calculateDistance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    // Find the slope and intercept of a line
    public static double[] findLineEquation(int x1, int y1, int x2, int y2) {
        double[] result = new double[2];
        result[0] = (double) (y2 - y1) / (x2 - x1); // Slope
        result[1] = y1 - result[0] * x1; // Intercept
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two points
        System.out.print("Enter x1, y1: ");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        System.out.print("Enter x2, y2: ");
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        // Calculate and display distance
        double distance = calculateDistance(x1, y1, x2, y2);
        System.out.printf("Euclidean Distance: %.2f\n", distance);

        // Calculate and display line equation
        double[] lineEquation = findLineEquation(x1, y1, x2, y2);
        System.out.printf("Equation of Line: y = %.2fx + %.2f\n", lineEquation[0], lineEquation[1]);

        scanner.close();
    }
}
