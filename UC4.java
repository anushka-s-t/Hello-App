public class UC4 {
    public static void main(String[] args) {
        String greeting;

        if (args.length > 0) {
            // UC4: Using StringBuilder to efficiently build the list of names
            StringBuilder names = new StringBuilder();
            for (int i = 0; i < args.length; i++) {
                names.append(args[i]);
                // UC4: Add a comma and space between names, but not after the last one
                if (i < args.length - 1) {
                    names.append(", ");
                }
            }
            greeting = names.toString();
        } else {
            // UC4: Default value if no names are provided
            greeting = "World";
        }

        System.out.println("Hello, " + greeting + "!");
    }
}