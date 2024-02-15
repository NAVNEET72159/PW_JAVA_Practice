import java.util.Scanner;

public class Multiplicative2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        for (int i = 0; i < number; i++) {
            if (i%3 == 0)
                continue;
            System.out.println(i);
        }
    }
}
