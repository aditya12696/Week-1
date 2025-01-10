import java.util.Scanner;

class IsNaturalAndSumWithInput{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
	  // Taking input from user 
	  System.out.print("Enter the number ");
	  int inputNumber = sc.nextInt();
		
        // Check if the number is a natural number or not
        if (inputNumber > 0) {
		
            // Calculate the sum of the first n natural numbers
            int sumOfNaturalNumbers = inputNumber * (inputNumber + 1) / 2;
			
		// Display output if number is natural numbers
            System.out.println("The sum of the first " + inputNumber + " natural numbers is " + sumOfNaturalNumbers);		
        } 
	 // If number is not natural numbers
	 else {
            System.out.println("The number is not a natural number");
       }
	 // Close Scanner class 
	 sc.close();
    }
}