public class NullPointerExceptionDemo {

    // Method to generate NullPointerException
    public static void generateException() {
        String text = null; // Initialize variable to null
        System.out.println("Generating NullPointerException...");
        // This line will throw a NullPointerException
        System.out.println(text.length());
    }

    // Method to handle NullPointerException
    public static void handleException() {
        String text = null; // Initialize variable to null
        System.out.println("Handling NullPointerException...");
        try {
            // Attempt to access a method on a null object
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: The variable is null.");
        } catch (RuntimeException e) {
            // Catch any other runtime exceptions
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Call the method to generate the exception
        try {
            generateException();
        } catch (NullPointerException e) {
            System.out.println("NullPointerException occurred in generateException(): " + e.getMessage());
        }

        // Call the method to handle the exception
        handleException();
    }
}
