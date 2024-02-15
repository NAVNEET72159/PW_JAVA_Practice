import java.util.Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 2, 3, 7, 9, 0, 8};
        System.out.println(secondLargest(arr));
    }
    public static int secondLargest(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length-2];
    }
}
