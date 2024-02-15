import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        int temp = number;
        int reversed = 0;
        while(temp != 0) {
            reversed = reversed*10 + temp%10;
            temp /= 10;
        }
        System.out.println("The reverse of " + number + " is " + reversed + ".");
    }
}
