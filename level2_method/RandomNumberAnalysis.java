public class RandomNumberAnalysis {

    // Method to generate an array of 4-digit random numbers
    public static int[] generate4DigitRandomArray(int size) {
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = (int) (Math.random() * 9000) + 1000; // Generates a 4-digit number
        }
        return numbers;
    }

    // Method to find the average, min, and max values in the array
    public static double[] findAverageMinMax(int[] numbers) {
        int min = numbers[0];
        int max = numbers[0];
        double sum = 0;

        // Find min, max, and sum
        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
            sum += num;
        }

        double average = sum / numbers.length;

        return new double[] {average, min, max};
    }

    public static void main(String[] args) {
        // Generate an array of 5 4-digit random numbers
        int[] randomNumbers = generate4DigitRandomArray(5);

        // Find the average, min, and max values
        double[] results = findAverageMinMax(randomNumbers);

        // Display the results
        System.out.println("Random numbers: ");
        for (int num : randomNumbers) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("Average: " + results[0]);
        System.out.println("Min: " + results[1]);
        System.out.println("Max: " + results[2]);
    }
}
