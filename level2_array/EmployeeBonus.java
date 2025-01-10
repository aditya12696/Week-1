import java.util.Scanner;

class EmployeeBonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Declare arrays for salary, years of service, bonus, and new salary
        double[] salaries = new double[10];
        double[] yearsOfService = new double[10];
        double[] bonuses = new double[10];
        double[] newSalaries = new double[10];
        
        // Declare variables for total bonus and total old and new salaries
        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        // Input salary and years of service for each employee
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter salary of employee " + (i + 1) + ": ");
            salaries[i] = input.nextDouble();
            
            // Validate salary input
            while (salaries[i] <= 0) {
                System.out.print("Invalid salary. Please enter a positive salary for employee " + (i + 1) + ": ");
                salaries[i] = input.nextDouble();
            }

            System.out.print("Enter years of service of employee " + (i + 1) + ": ");
            yearsOfService[i] = input.nextDouble();
            
            // Validate years of service input
            while (yearsOfService[i] < 0) {
                System.out.print("Invalid years of service. Please enter a positive value for employee " + (i + 1) + ": ");
                yearsOfService[i] = input.nextDouble();
            }
        }

        // Calculate bonus, new salary, and total bonus
        for (int i = 0; i < 10; i++) {
            // Calculate bonus based on years of service
            if (yearsOfService[i] > 5) {
                bonuses[i] = salaries[i] * 0.05; // 5% bonus
            } else {
                bonuses[i] = salaries[i] * 0.02; // 2% bonus
            }

            // Calculate new salary
            newSalaries[i] = salaries[i] + bonuses[i];

            // Accumulate totals
            totalBonus += bonuses[i];
            totalOldSalary += salaries[i];
            totalNewSalary += newSalaries[i];
        }

        // Display the results
        System.out.println("\nResults:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Employee " + (i + 1) + ":");
            System.out.println("Old Salary: " + salaries[i]);
            System.out.println("Years of Service: " + yearsOfService[i]);
            System.out.println("Bonus: " + bonuses[i]);
            System.out.println("New Salary: " + newSalaries[i]);
            System.out.println();
        }

        // Display total bonus and salary information
        System.out.println("Total Bonus: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);

        // Close the scanner
        input.close();
    }
}