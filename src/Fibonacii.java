import java.util.Scanner;

public class Fibonacii {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the range: ");
        int range = scanner.nextInt();
        int a = 0;
        int b = 1;
        int sum = 0;
        System.out.println("The Fibonacii series is: ");
        System.out.print(a+" " + b+ " ");
        for (int i = sum; i <= range; i=sum) {
            sum = a + b;
            a = b;
            b = sum;
            System.out.print(sum+" ");
        }
    }
}
