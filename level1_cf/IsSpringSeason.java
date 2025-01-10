import java.util.Scanner;

class IsSpringSeason {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // taking day from user as input
        System.out.println("Enter month ");
        int month = sc.nextInt();
	  // taking month from user as input
        System.out.println("Enter day ");
        int day = sc.nextInt();

        // Check if the date falls in the Spring season
        if ((month == 3 && day >= 20 && day <= 31) || 
            (month == 4) || 
            (month == 5) || 
            (month == 6 && day >= 1 && day <= 20)) {
            System.out.println("It's Spring Season.");
        } else {
            System.out.println("Not Spring Season.");
        }
	  // Close Scanner class
        sc.close();
    }
}