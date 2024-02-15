import java.util.Scanner;

public class Algebra {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = scanner.nextInt();
        System.out.println("Enter second number: ");
        int b = scanner.nextInt();
        Sum sum = new Sum();

        System.out.println("Sum of "+a+" and "+b+" is "+sum.sum(a,b));
    }
}

class Sum {

    Sum() {
        System.out.println("Sum class object created");
    }
    public int sum(int a, int b) {
        return a+b;
    }
}