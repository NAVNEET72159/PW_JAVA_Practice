public class TargetSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int target = 5;
        System.out.println(targetSum(arr, target));
    }
    public static int targetSum(int[] arr, int target) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length-1; j++) {
                if((arr[i] + arr[j]) == target) {
                    count++;
                }
            }
        }
        return count;
    }
}
