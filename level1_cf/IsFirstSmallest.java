import java.util.Scanner;

public class IsFirstSmallest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking as input first numbers
        System.out.print("Enter the first number: ");
        int firstNumber = sc.nextInt();

	  // Taking as input second numbers
        System.out.print("Enter the second number: ");
        int secondNumber = sc.nextInt();

	  // Taking as input Third numbers
        System.out.print("Enter the third number: ");
        int thirdNumber = sc.nextInt();
		
	  // Variable storing result 
	  boolean isFirstSmallest;

        // Check if the first number is the smallest
        if (firstNumber < secondNumber && firstNumber < thirdNumber) {
            isFirstSmallest = true;
        } 
	  // If first is not smallest then
	  else {
            isFirstSmallest = false;
        }
		
	  // Display output 
	  System.out.println("Is the first number the smallest? " + isFirstSmallest);
		
	  // Closing Scanner class
        sc.close();
    }
}