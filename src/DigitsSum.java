import java.util.Scanner;

public class DigitsSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        int temp = number;
        int sum = 0;
        while (temp > 0) {
            sum += temp%10;
            temp /= 10;
        }
        System.out.println("The sum of digits of " + number + " is " + sum + ".");
    }
}
