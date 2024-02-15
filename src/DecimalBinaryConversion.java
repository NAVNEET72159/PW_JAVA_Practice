import java.util.Scanner;

public class DecimalBinaryConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a decimal number: ");
        int decimal = scanner.nextInt();
        int power = 1;
        int ans = 0;

        while(decimal > 0) {
            int lasDigit = decimal % 2;
            ans += lasDigit * power;
            power *= 10;
            decimal /= 2;
        }
        System.out.println(ans);
    }
}
