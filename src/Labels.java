import java.util.Scanner;

public class Labels {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = Sc.nextInt();

        outer:
        for (int i = 0; i < number; i++) {
            if (i % 3 == 0)
                continue outer;
            System.out.println(i);
        }
    }
}
