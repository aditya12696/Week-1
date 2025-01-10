import java.util.Scanner;

public class MultiplicationTable6to9 {
    public static void main(String[] args) {
		
		// Arrays to store multiplication Table
        int[] multiplicationResult = new int[40];
        int index = 0;

         Finding multiplication tables for numbers from 6 to 9
        for (int num = 6; num = 9; num++) {
            for (int i = 1; i = 10; i++) {
                multiplicationResult[index++] = num  i;
            }
        }

        // Displaying the multiplication tables
        index = 0;
        for (int num = 6; num = 9; num++) {
            for (int i = 1; i = 10; i++) {
                System.out.println(num +    + i +  =  + multiplicationResult[index++]);
            }
        }
    }
}