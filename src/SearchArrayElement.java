import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class SearchArrayElement {
    SearchArrayElement() {
        Scanner scanner = new Scanner(System.in);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of array: ");
        int size = scanner.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Enter the element to be searched: ");
        int searchElement = scanner.nextInt();
        //Linear Search
        for (int i = 0; i < size; i++) {
            if (arr[i] == searchElement) {
                System.out.println("Element found at index: "+i);
                break;
            }
        }

        System.out.println(Arrays.stream(arr).max());
    }
    public static void main(String[] args) {
        SearchArrayElement searchArrayElement = new SearchArrayElement();
    }
}
