public class ExtendedUnitConverter {

    // Method to convert yards to feet
    public static double convertYardsToFeet(double yards) {
        double yards2feet = 3;
        return yards * yards2feet;
    }

    // Method to convert feet to yards
    public static double convertFeetToYards(double feet) {
        double feet2yards = 0.333333;
        return feet * feet2yards;
    }

    // Method to convert meters to inches
    public static double convertMetersToInches(double meters) {
        double meters2inches = 39.3701;
        return meters * meters2inches;
    }

    // Method to convert inches to meters
    public static double convertInchesToMeters(double inches) {
        double inches2meters = 0.0254;
        return inches * inches2meters;
    }

    // Method to convert inches to centimeters
    public static double convertInchesToCentimeters(double inches) {
        double inches2cm = 2.54;
        return inches * inches2cm;
    }

    public static void main(String[] args) {
        System.out.println("5 yards is " + convertYardsToFeet(5) + " feet.");
        System.out.println("15 feet is " + convertFeetToYards(15) + " yards.");
        System.out.println("10 meters is " + convertMetersToInches(10) + " inches.");
        System.out.println("50 inches is " + convertInchesToMeters(50) + " meters.");
        System.out.println("30 inches is " + convertInchesToCentimeters(30) + " centimeters.");
    }
}
