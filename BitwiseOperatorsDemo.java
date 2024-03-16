public class BitwiseOperatorsDemo {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;

        // Bitwise AND (&) operator
        int bitwiseAnd = a & b;
        System.out.println("Bitwise AND: " + bitwiseAnd);

        // Bitwise OR (|) operator
        int bitwiseOr = a | b; 
        System.out.println("Bitwise OR: " + bitwiseOr);

        // Bitwise XOR (^) operator
        int bitwiseXor = a ^ b; 
        System.out.println("Bitwise XOR: " + bitwiseXor);

        // Left shift (<<) operator
        int leftShiftResult = a << 1; 
        System.out.println("Left shift: " + leftShiftResult);

        // Right shift (>>) operator
        int rightShiftResult = b >> 1;
        System.out.println("Right shift: " + rightShiftResult);
    }
}
