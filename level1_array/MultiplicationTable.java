import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Storing multiplication results
        int[] multiplicationResult = new int[10];
        for (int i = 1; i <= 10; i++) {
            multiplicationResult[i - 1] = number * i;
        }

        // Displaying multiplication table
        for (int i = 0; i < multiplicationResult.length; i++) {
            System.out.println(number + " * " + (i + 1) + " = " + multiplicationResult[i]);
        }

        sc.close();
    }
}
