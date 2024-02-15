import java.util.Scanner;

public class CheckSorted {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        CheckSorted check = new CheckSorted();
        System.out.println(check.checkSorted(arr));
    }
    public boolean checkSorted(int[] arr) {
        boolean isSorted = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i-1]) {
                isSorted = false;
                break;
            }
        }
        return isSorted;
    }
}
