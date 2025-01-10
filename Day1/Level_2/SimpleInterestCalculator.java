import java.util.*;
public class SimpleInterestCalculator {
    // calculate Simple Interest
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input Principal
        double principal = scanner.nextDouble();
        // Input Rate
        double rate = scanner.nextDouble();
        // Input Time
        double time = scanner.nextDouble();
        // Calculate Simple Interest
        double simpleInterest = (principal * rate * time) / 100;
        // Output the result
        System.out.println("The Simple Interest is " + simpleInterest + " for Principal " + principal + ", Rate of Interest " + rate + ", and Time " + time);
        // Close the Scanner object
        scanner.close();
    }
}