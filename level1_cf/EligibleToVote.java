import java.util.Scanner;

class eligibleToVote{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking age as input in the age variable
        System.out.print("Enter the person's age ");
        int personAge = sc.nextInt();

        // Check if the person is eligible to vote
        if (personAge >= 18) {
            System.out.println("The person's age is " + personAge + " and can vote");
        }
	  // Check if the person is not eligible to vote
	  else {
            System.out.println("The person's age is " + personAge + " and cannot vote");
        }
		
	  // Closed Scanner class
        sc.close();
    }
}