import java.util.Scanner;
import java.util.HashSet;

public class OTPGenerator {

    // Method to generate a 6-digit OTP using Math.random()
    public static int generateOTP() {
        return (int) (Math.random() * 900000) + 100000; // Ensures 6-digit number
    }

    // Method to check if all OTPs in the array are unique
    public static boolean areUniqueOTPs(int[] otps) {
        HashSet<Integer> uniqueOTPs = new HashSet<>();
        for (int otp : otps) {
            if (!uniqueOTPs.add(otp)) {
                return false; // Duplicate found
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array to store 10 generated OTPs
        int[] otpArray = new int[10];

        System.out.println("Generating 10 OTPs...");

        // Generate 10 OTPs
        for (int i = 0; i < otpArray.length; i++) {
            otpArray[i] = generateOTP();
            System.out.println("OTP " + (i + 1) + ": " + otpArray[i]);
        }

        // Check if all OTPs are unique
        boolean areUnique = areUniqueOTPs(otpArray);

        // Display result
        System.out.println("\nAre all OTPs unique? " + (areUnique ? "Yes" : "No"));

        scanner.close();
    }
}