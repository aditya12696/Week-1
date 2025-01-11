import java.util.Scanner;

public class QuadraticSolver {

    // Method to find the roots of a quadratic equation
    public static double[] findRoots(double a, double b, double c) {
        double delta = Math.pow(b, 2) - 4 * a * c;
        if (delta > 0) {
            // Two real roots
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[] {root1, root2};
        } else if (delta == 0) {
            // One real root
            double root = -b / (2 * a);
            return new double[] {root};
        } else {
            // No real roots
            return new double[] {};
        }
    }

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        // Take a, b, and c as input
        System.out.print("Enter value for a: ");
        double a = inputScanner.nextDouble();
        System.out.print("Enter value for b: ");
        double b = inputScanner.nextDouble();
        System.out.print("Enter value for c: ");
        double c = inputScanner.nextDouble();

        // Find roots
        double[] roots = findRoots(a, b, c);

        // Display the roots
        if (roots.length == 0) {
            System.out.println("The equation has no real roots.");
        } else {
            System.out.println("The roots are: ");
            for (double root : roots) {
                System.out.println(root);
            }
        }

        inputScanner.close();
    }
}
