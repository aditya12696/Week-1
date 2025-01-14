import java.util.Scanner;

public class ReverseString {

    // Function to reverse a string
    private static String reverse(String str) {
        char[] charArray = str.toCharArray();
        int start = 0, end = charArray.length - 1;
        while (start < end) {
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;
            start++;
            end--;
        }
        return new String(charArray);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        System.out.println("Reversed string: " + reverse(input));
        scanner.close();
    }
}
