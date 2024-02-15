import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int n = 1;
        while(n <= number) {
            System.out.println(n);
            n++;
        }
    }
}
