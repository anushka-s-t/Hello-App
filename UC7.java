public class UC7{
    public static void main(String[] args) {
        // Step 1: Check if arguments are provided
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            // Step 2: Use the static String.join method
            // It handles the delimiter placement and array iteration automatically
            String names = String.join(", ", args);

            // Step 3: Print the final greeting
            System.out.println("Hello, " + names + "!");
        }
    }
}