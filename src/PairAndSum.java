import java.util.Scanner;

public class PairAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Enter the sum to find pair: ");
        int pairSum = scanner.nextInt();
        PairAndSum pairAndSum = new PairAndSum();
        System.out.println(pairAndSum.pairAndSum(arr, pairSum));
    }
    public int pairAndSum(int[] arr, int pairSum) {

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if ((arr[i] + arr[j]) == pairSum) {
                    sum++;
                }
            }
        }
        return sum;
    }
}
