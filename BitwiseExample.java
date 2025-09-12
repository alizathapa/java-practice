public class BitwiseExample {
    public static void main(String[] args) {
        int a = 5; // binary: 0101
        int b = 3; // binary: 0011

        System.out.println("Bitwise AND a & b = " + (a & b)); // AND -> 1
        System.out.println("Bitwise OR a | b = " + (a | b)); // OR -> 7
        System.out.println("Bitwise XOR a ^ b = " + (a ^ b)); // XOR -> 6
        System.out.println("Bitwise NOT~a = " + (~a)); // NOT -> -6
        System.out.println("Bitwise left shift a << 1 = " + (a << 1));// Left shift -> 10
        System.out.println("Bitwise right shift a >> 1 = " + (a >> 1));// Right shift -> 2
    }
}
