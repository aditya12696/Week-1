public class SpringSeasonChecker {
    // To determine if the given month and day fall within the Spring season
    public static boolean isSpringSeason(int month, int day) {
        // Check for Spring season: March 20 to June 20
        if ((month == 3 && day >= 20) || // From March 20
            (month > 3 && month < 6) ||  // Full months of April and May
            (month == 6 && day <= 20)) { // Until June 20
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        // Validate the command-line arguments
        if (args.length != 2) {
            System.out.println("Please provide both month and day as command-line arguments.");
            return;
        }

        // Parse the command-line arguments
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);

        // Check if it's Spring season
        boolean isSpring = isSpringSeason(month, day);

        // Print the result
        if (isSpring) {
            System.out.println("It's a Spring Season.");
        } else {
            System.out.println("Not a Spring Season.");
        }
    }
}
