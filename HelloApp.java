public class HelloApp {
    public static void main(String[] args) {
        // Check if any arguments were passed
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            // Use StringBuilder for memory-efficient string manipulation
            StringBuilder namesList = new StringBuilder();

            // Enhanced For Loop (For-Each)
            // This is cleaner than an indexed loop for simple traversal
            int count = 0;
            for (String name : args) {
                namesList.append(name);
                
                // Add a comma and space if it's not the last element
                if (count < args.length - 1) {
                    namesList.append(", ");
                }
                count++;
            }

            // Print the final formatted string
            System.out.println("Hello, " + namesList.toString() + "!");
        }
    }
}