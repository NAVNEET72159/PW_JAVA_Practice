import java.util.Scanner;

public class NumericalRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows, columns;

        System.out.println("Enter the number of rows: ");
        rows = scanner.nextInt();

        System.out.println("Enter the number of columns: ");
        columns = scanner.nextInt();

        for (int i = 1; i <= rows; i++) {
            int temp = i;
            for (int j = 1; j <= columns; j++) {
                if (temp > 7) {
                    temp = 1;
                }
                System.out.print(temp+" ");
                temp++;
            }
            System.out.println();
        }
    }
}
