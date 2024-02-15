import java.util.Scanner;

public class ElementFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Enter the element to find frequency: ");
        int element = scanner.nextInt();
        int count = 0;
        for (int arrElement : arr) {
            if (arrElement == element) {
                count++;
            }
        }
        System.out.println("Frequency of element "+element+" is: "+count);
    }
}
