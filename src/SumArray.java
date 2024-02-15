import java.util.Scanner;

public class SumArray {

    SumArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = scanner.nextInt();
        int sum = 0;
        int[] arr = new int[size];
        System.out.println("Enter the elements of array: ");
        for (int arrElement : arr) {
            arrElement = scanner.nextInt();
            sum += arrElement;
        }
        System.out.println("Sum of elements of array is: "+sum);
    }
    public static void main(String[] args) {
        SumArray sumArray = new SumArray();
    }
}
