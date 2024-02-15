import java.util.Scanner;

public class CopyArray2 {
    CopyArray2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        //Deep Copy
        int[] arr2 = arr.clone();
        printArray(arr, arr2);
        changeArray(arr2);
        printArray(arr, arr2);
    }
    public static void main(String[] args) {
        CopyArray2 copyArray = new CopyArray2();
    }

    public static void printArray(int[] arr, int[] arr2) {
        System.out.println("Elements of original array are: ");
        for (int arrElements : arr) {
            System.out.print(arrElements + " ");
        }
        System.out.println();
        System.out.println("Elements of copied array are: ");
        for(int arrElements : arr2) {
            System.out.print(arrElements + " ");
        }
        System.out.println();
    }

    public static void changeArray(int[] arr2) {
        arr2[0] = 100;
    }
}
