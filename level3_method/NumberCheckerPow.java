public class NumberCheckerPow {

    // Method to find the count of digits in the number
    public static int countDigits(int number) {
        return Integer.toString(number).length();
    }

    // Method to store the digits of the number in a digits array
    public static int[] storeDigits(int number) {
        int count = countDigits(number);
        int[] digits = new int[count];

        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number = number / 10;
        }
        return digits;
    }

    // Method to find the sum of the digits of a number
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    // Method to find the sum of the squares of the digits of a number
    public static double sumOfSquaresOfDigits(int[] digits) {
        double sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }

    // Method to check if a number is a Harshad number
    public static boolean isHarshadNumber(int number, int[] digits) {
        int sum = sumOfDigits(digits);
        return number % sum == 0;
    }

    // Method to find the frequency of each digit in the number
    public static int[][] findDigitFrequency(int[] digits) {
        int[][] frequency = new int[10][2]; // 10 digits (0-9), 2 columns (digit, frequency)

        for (int digit : digits) {
            frequency[digit][0] = digit;
            frequency[digit][1]++;
        }

        // Filter out the digits that don't appear (frequency of 0)
        int count = 0;
        for (int i = 0; i < 10; i++) {
            if (frequency[i][1] > 0) {
                count++;
            }
        }

        // Create an array of the filtered frequencies
        int[][] result = new int[count][2];
        int index = 0;
        for (int i = 0; i < 10; i++) {
            if (frequency[i][1] > 0) {
                result[index++] = frequency[i];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int number = 12321;  // You can change this number for testing
        int[] digits = storeDigits(number);

        // Count the digits
        int digitCount = countDigits(number);
        System.out.println("Count of digits: " + digitCount);

        // Find the sum of digits
        int sumDigits = sumOfDigits(digits);
        System.out.println("Sum of digits: " + sumDigits);

        // Find the sum of squares of digits
        double sumSquares = sumOfSquaresOfDigits(digits);
        System.out.println("Sum of squares of digits: " + sumSquares);

        // Check if the number is a Harshad number
        boolean isHarshad = isHarshadNumber(number, digits);
        System.out.println("Is Harshad Number: " + isHarshad);

        // Find the frequency of each digit
        int[][] frequency = findDigitFrequency(digits);
        System.out.println("Digit frequencies:");
        for (int[] entry : frequency) {
            System.out.println("Digit: " + entry[0] + ", Frequency: " + entry[1]);
        }
    }
}
