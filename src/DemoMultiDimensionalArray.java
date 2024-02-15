import java.util.Scanner;

public class DemoMultiDimensionalArray {

    DemoMultiDimensionalArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int rows = scanner.nextInt();
        System.out.println("Enter number of columns: ");
        int columns = scanner.nextInt();

        int[][] arr = new int[rows][columns];
        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++){
                arr[i][j] = scanner.nextInt();
            }
        }

        System.out.println("The elements of array are: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        DemoMultiDimensionalArray demoMultiDimensionalArray = new DemoMultiDimensionalArray();
    }
}
