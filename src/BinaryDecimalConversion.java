import java.util.Scanner;

public class BinaryDecimalConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a binary number: ");
        int binaryString = scanner.nextInt();

        int ans = 0;
        int power = 1;

        while (binaryString > 0) {
            int lastDigit = binaryString % 10;
            ans += lastDigit * power;
            power *= 2;
            binaryString /= 10;
        }
        System.out.println(ans);
    }
}
