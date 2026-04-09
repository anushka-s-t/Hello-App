public class UC3 {
    public static void main(String[] args) {
        // condition ? valueIfTrue : valueIfFalse
        String name = (args.length > 0) ? args[0] : "World";

        // Display the greeting using String Concatenation
        System.out.println("Hello, " + name + "!");
    }
}