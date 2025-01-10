
import java.util.Scanner;

class CountdownUsingFor{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get countdown start number
        System.out.print("Enter starting value for countdown ");
        int counterNumber = sc.nextInt();

        // Perform countdown and print out
        for (int i = counterNumber; i >= 1; i--) {
            System.out.println(i);
        }
	  // Closing Scanner class
        sc.close();
    }
}

W
