import java.util.Scanner;

public class NaturalNumberSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        int sum = 0;
        int n = 1;

        while(n <= number) {
            sum += n;
            n++;
        }

        System.out.println("The sum of the first " + number + " natural numbers is " + sum + ".");
    }
}
