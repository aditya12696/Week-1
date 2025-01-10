import java.util.Scanner;

class IsDivisibleByFive {
    public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
		
	 // Taking input from user
       System.out.print("Enter a number ");
	 int inputNumber = sc.nextInt();
		
	 // Result variable  
	 boolean isDivisibleByFive;
		
       // Checking if the number is divisible by 5
       if (inputNumber % 5 == 0) {
            isDivisibleByFive = true;
       } 
		
	// if not divisible by 5
	else {
            isDivisibleByFive = false;
      }
		
	 // Display Output
	 System.out.println("Is the number " + inputNumber + " divisible by 5? " + isDivisibleByFive);
		
	 // Closing Scanner class
	 sc.close();
    }
}