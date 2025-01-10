import java.util.Scanner;
public class TriangleArea {
    // Find area of a triangle in square inches and square centimeters
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        // Taking base as input
        double base = scanner.nextDouble();
        // Taking height as input
        double height = scanner.nextDouble();
        // Calculating area of the triangle in square inches
        double areaInSquareInches = 0.5 * base * height;
        // Converting area to square centimeters (1 inch = 2.54 cm)
        double areaInSquareCentimeters = areaInSquareInches * 6.4516;
        System.out.println("The area of the triangle In square inches is " + areaInSquareInches + " and area In square centimeters is " + areaInSquareCentimeters);
        // Scanner class closed
        scanner.close();
    }
}
