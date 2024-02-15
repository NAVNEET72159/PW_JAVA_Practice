import java.util.Scanner;

public class DemoArray {
    DemoArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("DemoArray constructor");
        System.out.println("Enter the size of array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        DemoArray demoArray = new DemoArray();
    }
}
