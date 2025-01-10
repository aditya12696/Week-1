import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		// Taking input from user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
		
		// Arrays to store result
        String[] result = new String[number];

        // FizzBuzz logic
        for (int i = 0; i < number; i++) {
            int num = i + 1;
            if (num % 3 == 0 && num % 5 == 0) {
                result[i] = "FizzBuzz";
            } else if (num % 3 == 0) {
                result[i] = "Fizz";
            } else if (num % 5 == 0) {
                result[i] = "Buzz";
            } else {
                result[i] = Integer.toString(num);
            }
        }

        // Displaying the results
        for (int i = 0; i < result.length; i++) {
            System.out.println("Position " + (i + 1) + " = " + result[i]);
        }

        sc.close();
    }
}
