import java.util.Scanner;

public class InverseTrianglePattern {
    public static void main(String[] args) {
        // Write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = scanner.nextInt();

        for (int i = 0; i <= rows; i++) {
            for (int j = 0; j <= rows-i; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
}
