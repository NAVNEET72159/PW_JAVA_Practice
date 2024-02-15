import java.util.Scanner;

public class Series1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the range: ");
        int range = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i <= range; i++) {
            if (i%2 == 0) {
                sum -= i;
            } else {
                sum += i;
            }
        }
        System.out.println("The sum of the series is " + sum + ".");
    }
}
