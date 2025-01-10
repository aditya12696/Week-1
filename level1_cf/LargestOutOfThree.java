import java.util.Scanner;

class LargestOutOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input first number
        System.out.println("Enter the first number  ");
        int firstNumber = sc.nextInt();
		
	  // Taking input second number
        System.out.println("Enter the second number ");
        int secondNumber = sc.nextInt();
		
	  // Taking input third number
        System.out.println("Enter the third number  ");
        int thirdNumber = sc.nextInt();

        // Initialize results
        boolean firstLargest = false;
        boolean secondLargest = false;
        boolean thirdLargest = false;

        // Determine largest number and storing result
        if (firstNumber > secondNumber && firstNumber > thirdNumber) {
            firstLargest = true;
        } else if (secondNumber > firstNumber && secondNumber > thirdNumber) {
            secondLargest = true;
        } else if (thirdNumber > firstNumber && thirdNumber > secondNumber) {
            thirdLargest = true;
        }

        System.out.println("Is the first number the largest " + firstLargest);
        System.out.println("Is the second number the largest " + secondLargest);
        System.out.println("Is the third number the largest " + thirdLargest);

        // Close the scanner
        sc.close();
    }
}

