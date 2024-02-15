import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the range: ");
        int range = scanner.nextInt();

        int factorial = 1;
        for (int i = 1; i <= range; i++) {
            factorial *= i;
            System.out.println("The factorial of " + i + " is " + factorial + ".");
        }
    }
}
