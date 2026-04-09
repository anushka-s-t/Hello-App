public class UC6 {
    public static void main(String[] args) {
        // Step 1: Check for zero arguments
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            StringBuilder nameBuilder = new StringBuilder();

            // Step 2: Enhanced For Loop - Append everything including delimiter
            for (String name : args) {
                nameBuilder.append(name).append(", ");
            }

            // Step 3: Remove the trailing ", " (last 2 characters)
            String finalNames = "";
            if (nameBuilder.length() > 0) {
                finalNames = nameBuilder.substring(0, nameBuilder.length() - 2);
            }

            // Step 4: Print final output
            System.out.println("Hello, " + finalNames + "!");
        }
    }
}