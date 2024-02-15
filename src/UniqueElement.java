public class UniqueElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 1, 2, 4};
        System.out.println(uniqueElement(arr));
    }
    public static int uniqueElement(int[] arr) {
        int count = 0;
        for (int j : arr) {
            count = count ^ j;
        }
        return count;
    }
}
