public class ExplicitTypeCasting {
    public static void main(String[] args) {
        // Narrowing (Explicit)
        double d = 9.78;
        float f = (float) d;
        long l = (long) f;
        int i = (int) l;
        short s = (short) i;
        byte b = (byte) s;
        char c = (char) b;
        // System.out.println("Double to Char: " + c);
        System.out.println("Double to Char (numeric): " + (int) c);
        // System.out.println("Double to Char (as char): [" + c + "]");

    }
}
