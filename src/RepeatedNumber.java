import java.util.Arrays;

public class RepeatedNumber {
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 3, 2, 3, 7, 8,9, 7};
        System.out.println(repeatedNumber(arr));
    }
    public static int repeatedNumber(int[] arr) {
        Arrays.sort(arr);
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] == arr[i+1]) {
                return arr[i];
            }
        }
        return -1;
    }
}
