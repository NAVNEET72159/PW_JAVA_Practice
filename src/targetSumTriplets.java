public class targetSumTriplets {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int target = 6;
        System.out.println(targetSumTriplets(arr, target));
    }
    public static int targetSumTriplets(int[] arr, int target) {
        int count= 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length-1; j++) {
                for (int k = j+1; k < arr.length-2; k++) {
                    if((arr[i] + arr[j] + arr[k]) == target) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
