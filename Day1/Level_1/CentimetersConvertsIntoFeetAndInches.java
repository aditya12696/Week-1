import java.util.*;
public class CentimetersConvertsIntoFeetAndInches {
    //  takes your height in centimeters and converts it into feet and inches
    public static void main(String[] args) {
        // Create a Scanner object to take input 
        Scanner scanner = new Scanner(System.in);
        // Input height in centimeters
        double heightInCm = scanner.nextDouble();
        // Convert height to inches
        double heightInInches = heightInCm / 2.54;
        // Convert inches to feet
        int heightInFeet = (int) (heightInInches / 12);
        // Convert inches to remaining inches
        double remainingInches = heightInInches % 12;
        // Output the result
        System.out.println("Your height in cm is " + heightInCm + " while in feet is " + heightInFeet + " and inches is " + remainingInches);
        // Scanner class closed
        scanner.close();
    }
}