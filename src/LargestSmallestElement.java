import java.util.Arrays;
import java.util.Scanner;

public class LargestSmallestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = scanner.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        LargestSmallestElement largestSmallestElement = new LargestSmallestElement();
        int[] arrElement = largestSmallestElement.findLargestSmallestElement(arr);

        largestSmallestElement.printArray(arrElement);
        int[] arrElement2 = largestSmallestElement.findLargestSmallestElement2(arr);

        largestSmallestElement.printArray(arrElement2);
    }
    public int[] findLargestSmallestElement(int[] arr) {
        int[] arr2 = new int[2];
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] < arr[i+1]) {
                arr2[0] = arr[i];
            }
        }

        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] < arr[i+1]) {
                arr2[1] = arr[i+1];
            }
        }
        return arr2;
    }

    public int[] findLargestSmallestElement2(int[] arr) {
        int arr2[] = new int[2];
        Arrays.sort(arr);
        arr2[0] = arr[0];
        arr2[1] = arr[arr.length-1];
        return arr2;
    }
    public void printArray(int[] arr) {
        System.out.println("Smallest element is: "+arr[0]);
        System.out.println("Largest element is: "+arr[1]);
    }
}
