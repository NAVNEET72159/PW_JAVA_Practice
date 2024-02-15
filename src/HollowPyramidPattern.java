import java.util.Scanner;

public class HollowPyramidPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int rows = scanner.nextInt();
        int k = 1;
        for (int i = 1; i <= rows; i++) {

            for (int j = 1; j <= rows-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*i-1; j++) {
                if (j == 1 || j == 2*i-1 || i == rows) {
                    System.out.print(k);
                } else{
                    System.out.print(" ");
                }
            }
            k++;
            System.out.println();
        }
    }
}
