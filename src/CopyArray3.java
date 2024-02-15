import java.util.Arrays;
import java.util.Scanner;

public class CopyArray3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the elements of array: ");
        for(int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        int arr2[] = Arrays.copyOf(arr, 3);
        int arr3[] = Arrays.copyOfRange(arr, 3, 5);

        System.out.println("Elements of original array are: ");
        for(int arrElements : arr) {
            System.out.print(arrElements + " ");
        }

        System.out.println();
        System.out.println("Elements of copied array are: ");
        for(int arrElements : arr2) {
            System.out.print(arrElements + " ");
        }

        System.out.println();
        System.out.println("Elements of copied array from any defined range are: ");
        for(int arrElements : arr3) {
            System.out.print(arrElements + " ");
        }
    }
}
