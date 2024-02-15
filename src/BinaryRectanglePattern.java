import java.util.Scanner;

public class BinaryRectanglePattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows, columns;

        System.out.println("Enter the number of rows: ");
        rows = scanner.nextInt();

        System.out.println("Enter the number of columns: ");
        columns = scanner.nextInt();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if ((i+j)%2 == 0){
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
