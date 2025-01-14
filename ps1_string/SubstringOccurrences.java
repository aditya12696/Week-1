import java.util.Scanner;

public class SubstringOccurrences {

    // Function to count how many times a substring occurs in a string
    private static int countSubstringOccurrences(String str, String substring) {
        int count = 0;
        int index = 0;
        while ((index = str.indexOf(substring, index)) != -1) {
            count++;
            index++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the main string: ");
        String str = scanner.nextLine();
        System.out.print("Enter the substring: ");
        String substring = scanner.nextLine();
        System.out.println("The substring occurs " + countSubstringOccurrences(str, substring) + " times.");
        scanner.close();
    }
}
