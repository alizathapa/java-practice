public class CommandLineArgumentExample {
    public static void main(String[] value) {
        if (value.length > 0) {
            System.out.println("Hello, " + value[3] + "!");
        } else {
            System.out.println("No name provided.");
        }
    }

}
