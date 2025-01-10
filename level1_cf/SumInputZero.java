
import java.util.Scanner;

class SumInputZero{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
	 // Initialize total number
        int total = 0;
	 // Variable to store input
        int userCurrentInput;  

        // Taking input from user and continuing checking the process until 0 is entered
        do {
	     // taking current input from user
            System.out.println("Enter a Number (enter 0 to stop) ");
            userCurrentInput = sc.nextInt();
			
	     // Add input to total number
            total += userCurrentInput; 
        } while (userCurrentInput != 0);
		
	 // Display total sum
        System.out.println("The total sum is: " + total);
		
	 // Closing Scanner class
        sc.close();
    }
}