import java.util.Scanner;

class CheckNegativePositiveOrZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from the user
        System.out.println("Enter a number ");
        int number = sc.nextInt();

        // Checking if the number is positive, negative, or zero and display them
        if (number > 0) {
            System.out.println("The number is positive");
        } else if (number < 0) {
            System.out.println("The number is negative");
        } else {
            System.out.println("The number is zero");
        }
	  // Scanner class closed
        sc.close();
    }
}