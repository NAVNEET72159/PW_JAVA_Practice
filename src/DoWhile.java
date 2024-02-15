import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while(i <= number);
    }
}
