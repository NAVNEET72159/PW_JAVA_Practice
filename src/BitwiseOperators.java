public class BitwiseOperators {
    public static void main(String[] args) {
        int a = 9, b = 10;
        System.out.println("Bitwise AND: "+(a&b));
        System.out.println("Bitwise OR: "+(a|b));
        System.out.println("Bitwise XOR: "+(a^b));
        System.out.println("Bitwise NOT: "+(~a));
        System.out.println("Bitwise Left Shift: "+(a<<2));
        System.out.println("Bitwise Right Shift: "+(a>>2));
        System.out.println("Bitwise Zero Fill Right Shift: "+(a>>>2));
    }
}
