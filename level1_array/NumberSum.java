import java.util.Scanner;

public class NumberSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		// Arrays to store numbers
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        // Storing numbers until 0 or negative number is entered
        while (true) {
            System.out.print("Enter a number: ");
            double num = sc.nextDouble();
            if (num <= 0 || index == 10) {
                break;
            }
            numbers[index] = num;
            total += num;
            index++;
        }

        // Displaying the sum
        System.out.println("Numbers entered: ");
        for (int i = 0; i < index; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println("\nTotal sum: " + total);

        sc.close();
    }
}
