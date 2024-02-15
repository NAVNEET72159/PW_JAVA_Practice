import java.util.Scanner;

public class ArrayMaxElement {
    ArrayMaxElement() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = scanner.nextInt();

        int max = Integer.MIN_VALUE;
        int[] arr = new int[size];
        System.out.println("Enter the elements of array: ");
        for (int arrElement : arr) {
            arrElement = scanner.nextInt();
            if (arrElement > max) {
                max = arrElement;
            }
        }
        System.out.println("Maximum element of array is: "+max);
    }
    public static void main(String[] args) {
        ArrayMaxElement arrayMaxElement = new ArrayMaxElement();
    }
}
