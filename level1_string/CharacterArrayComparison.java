import java.util.Scanner;

public class CharacterArrayComparison {

    // Method to return characters in a string without using toCharArray()
    public static char[] getCharactersFromString(String text) {
        char[] characters = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            characters[i] = text.charAt(i);
        }
        return characters;
    }

    // Method to compare two character arrays
    public static boolean compareCharArrays(char[] array1, char[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input for the string
        System.out.print("Enter the string: ");
        String inputString = scanner.next();

        // Get characters using the user-defined method
        char[] userDefinedChars = getCharactersFromString(inputString);

        // Get characters using the built-in toCharArray() method
        char[] builtInChars = inputString.toCharArray();

        // Compare the two character arrays
        boolean areEqual = compareCharArrays(userDefinedChars, builtInChars);

        // Display the results
        System.out.println("Characters using user-defined method:");
        for (char c : userDefinedChars) {
            System.out.print(c + " ");
        }
        System.out.println();

        System.out.println("Characters using built-in toCharArray() method:");
        for (char c : builtInChars) {
            System.out.print(c + " ");
        }
        System.out.println();

        System.out.println("Are both arrays equal? " + areEqual);

        scanner.close();
    }
}
