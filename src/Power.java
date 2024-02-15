import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int base, exponent;
        System.out.println("Enter the base: ");
        base = scanner.nextInt();
        System.out.println("Enter the exponent: ");
        exponent = scanner.nextInt();
        int result = 1;
        while(exponent > 0) {
            result *= base;
            exponent--;
        }
        System.out.println(base + " raised to the power of " + exponent + " is " + result + ".");
    }
}
