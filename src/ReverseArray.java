public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Original Array: ");
        for(int i : arr)
            System.out.print(i+" ");
        arr = reverseArray(arr);
        System.out.println("\nReversed Array: ");
        for(int i : arr)
            System.out.print(i+" ");
        arr = reverseArrayWithoutUsingNewArray(arr);
        System.out.println("\nReversed Array without using new array: ");
        for(int i : arr)
            System.out.print(i+" ");
    }
    public static int[] reverseArray(int[] arr) {
        int[] newarr = new int[arr.length];
        for (int i = arr.length-1; i >= 0; i--)
            newarr[arr.length - 1 - i] = arr[i];
        return newarr;
    }
    public static int[] reverseArrayWithoutUsingNewArray(int[] arr) {
        for (int i = 0; i < arr.length/2; i++) {
            arr[i] = arr[i] + arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = arr[i] - arr[arr.length - 1 - i];
            arr[i] = arr[i] - arr[arr.length - 1 - i];
        }
        return arr;
    }
}
