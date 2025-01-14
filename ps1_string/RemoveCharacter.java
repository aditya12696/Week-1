import java.util.Scanner;

public class RemoveCharacter {

    // Function to remove a specific character from a string
    private static String removeCharacter(String str, char ch) {
        return str.replaceAll(String.valueOf(ch), "");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        System.out.print("Enter the character to remove: ");
        char toRemove = scanner.nextLine().charAt(0);
        System.out.println("Modified String: " + removeCharacter(input, toRemove));
        scanner.close();
    }
}
