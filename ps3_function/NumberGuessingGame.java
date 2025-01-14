import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {

    // Method to generate a random guess within a range
    private static int generateGuess(int lowerBound, int upperBound) {
        Random random = new Random();
        return lowerBound + random.nextInt(upperBound - lowerBound + 1);
    }

    // Method to get user feedback on the guess
    private static String getUserFeedback(Scanner scanner) {
        System.out.println("Is the guess (H)igh, (L)ow, or (C)orrect? Enter H, L, or C:");
        return scanner.nextLine().trim().toUpperCase();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Think of a number between 1 and 100, and I will try to guess it!");
        System.out.println("Provide feedback after each guess: (H)igh, (L)ow, or (C)orrect.");

        // Initialize bounds for guessing
        int lowerBound = 1;
        int upperBound = 100;
        boolean guessedCorrectly = false;

        while (!guessedCorrectly) {
            // Generate a guess
            int guess = generateGuess(lowerBound, upperBound);
            System.out.println("My guess is: " + guess);

            // Get feedback from the user
            String feedback = getUserFeedback(scanner);

            // Adjust bounds or end game based on feedback
            if (feedback.equals("H")) {
                upperBound = guess - 1; // Guess is too high
            } else if (feedback.equals("L")) {
                lowerBound = guess + 1; // Guess is too low
            } else if (feedback.equals("C")) {
                System.out.println("Yay! I guessed your number: " + guess);
                guessedCorrectly = true; // Correct guess
            } else {
                System.out.println("Invalid input. Please enter H, L, or C.");
            }

            // Check for impossible conditions
            if (lowerBound > upperBound) {
                System.out.println("Hmm, something went wrong. Are you sure about your feedback?");
                break;
            }
        }

        // Close the scanner
        scanner.close();
    }
}
