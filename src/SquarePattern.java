import java.util.Scanner;

public class SquarePattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = scanner.nextInt();

        System.out.println("Enter the number of columns: ");
        int columns = scanner.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++)
                System.out.print("*  ");
            System.out.println();
        }
    }
}
