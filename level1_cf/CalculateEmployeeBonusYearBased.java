
import java.util.Scanner;

class CalculateEmployeeBonusYearBased{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input Employee's salary
        System.out.print("Enter the employee's salary - ");
        double salary = sc.nextDouble();
	  // Taking  input years of service
        System.out.print("Enter the employee's years of service ");
        int yearsOfService = sc.nextInt();

        // Check if employee is eligible for bonus
        if (yearsOfService > 5) {
            // Calculating bonus
            double bonus = salary * 5 / 100;
            System.out.println("Bonus amount is INR " + bonus);
        } else {
            System.out.println("Employee is not eligible for bonus");
        }
	  // Closing Scanner class
        sc.close();
    }
}

